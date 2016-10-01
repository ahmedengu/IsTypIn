/**
 * Your application code goes here<br>
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose
 * of building native mobile applications using Java.
 */


package userclasses;

import com.codename1.capture.Capture;
import com.codename1.components.ToastBar;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.util.ImageIO;
import com.codename1.ui.util.Resources;
import com.parse4cn1.*;
import generated.StateMachineBase;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.List;

/**
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    Map<String, Object> data = new HashMap<>();

    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
        Parse.initialize("http://env-3406900.mircloud.host/parse", "myAppId", "master");
    }


    @Override
    protected void onSingup_SingupAction(Component c, ActionEvent event) {
        try {
            ParseUser user = ParseUser.create(findUsername().getText(), findPassword().getText());
            user.put("email", findEmail().getText());
            user.put("mobile", findMobile().getText());
            user.signUp();
            if (user.isAuthenticated()) {
                showForm("Home", null);
            }
        } catch (ParseException e) {
            e.printStackTrace();
            ToastBar.showErrorMessage(e.getMessage());
        }

    }

    @Override
    protected void onMain_LoginAction(Component c, ActionEvent event) {
        try {
            ParseUser user = ParseUser.create(findUsername().getText(), findPassword().getText());
            user.login();
            if (user.isAuthenticated()) {
                showForm("Home", null);
            }
        } catch (ParseException e) {
            e.printStackTrace();
            ToastBar.showErrorMessage(e.getMessage());
        }


    }

    @Override
    protected void onHome_ConversitonsAction(Component c, ActionEvent event) {


    }

    @Override
    protected void onHome_AddAction(Component c, ActionEvent event) {


    }

    @Override
    protected void onCreateHome() {

    }

    @Override
    protected void onChat_SendAction(Component c, ActionEvent event) {


    }

    @Override
    protected void beforeChat(Form f) {
        ParseObject chat = (ParseObject) data.get("chat");
        List<HashMap> dataList = chat.getList("data");
        for (int i = 0; i < dataList.size(); i++) {
            Label label = new Label(dataList.get(i).get("message").toString());

            label.setUIID(dataList.get(i).get("owner").toString());
            if (dataList.get(i).get("icon") != null) {
                EncodedImage placeholder = EncodedImage.createFromImage(fetchResourceFile().getImage("placeholder.jpg"), false);
                String url = "http://env-3406900.mircloud.host/parse/files/myAppId/" + ((ParseFile) dataList.get(i).get("icon")).getName();
                label.setIcon(URLImage.createToStorage(placeholder, url.substring(url.lastIndexOf("/") + 1), url));
            }

            findMessages().add(label);

        }
        f.repaint();
    }

    @Override
    protected void beforeHome(Form f) {

    }

    @Override
    protected void onAdd_ResultsAction(Component c, ActionEvent event) {
        Map<String, Object> at = (Map<String, Object>) findResults().getModel().getItemAt(findResults().getSelectedIndex());

        data.put("chat", at.get("object"));
        showForm("Chat", null);
    }

    @Override
    protected void beforeAdd(Form f) {
        ParseQuery<ParseObject> query = ParseQuery.getQuery("Story");
        try {
            java.util.List<ParseObject> objects = query.find();

            ArrayList<Map<String, Object>> d = new ArrayList<>();

            for (int i = 0; i < objects.size(); i++) {
                Map<String, Object> map = new HashMap<>();
                map.put("Line1", objects.get(i).getString("name"));
                map.put("object", objects.get(i));

                d.add(map);

            }
            findResults().setModel(new DefaultListModel(d));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onHome_CreateAction(Component c, ActionEvent event) {


    }

    @Override
    protected void onCreate_SaveAction(Component c, ActionEvent event) {
        Dialog dialog = new Dialog("Create");
        dialog.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        TextField name = new TextField("");
        name.setHint("Name");
        Button save = new Button("Save");
        save.addActionListener(evt -> {
            ParseObject object = ParseObject.create("Story");
            object.put("data", data.get("create"));
            object.put("name", name.getText());
            try {
                object.save();
                dialog.dispose();

                showForm("Home", null);
            } catch (ParseException e) {
                e.printStackTrace();
                ToastBar.showErrorMessage(e.getMessage());

            }

        });

        dialog.add(name);
        dialog.add(save);
        dialog.show();
    }

    @Override
    protected void onCreate_SendAction(Component c, ActionEvent event) {
        if (findYou().getText().length() > 0 && findHim().getText().length() > 0) {
            findYou().setText("");
            findHim().setText("");
        } else if (findYou().getText().length() > 0 || findHim().getText().length() > 0) {
            ArrayList<Map<String, Object>> create = (ArrayList<Map<String, Object>>) data.get("create");
            Map<String, Object> map = new HashMap<>();
            map.put("message", (findYou().getText().length() > 0) ? findYou().getText() : findHim().getText());
            map.put("owner", (findYou().getText().length() > 0) ? "you" : "him");
            create.add(map);
            findYou().setText("");
            findHim().setText("");

            Label label = new Label(map.get("message").toString());
            label.setUIID(map.get("owner").toString());
            findMessages().add(label);

            findMessages().getParent().repaint();
            data.put("create", create);

        }

    }

    @Override
    protected void beforeCreate(Form f) {
        data.put("create", new ArrayList<Map<String, Object>>());
    }

    @Override
    protected void onCreate_YouPicAction(Component c, ActionEvent event) {
        pic("you");
    }

    @Override
    protected void onCreate_HimPicAction(Component c, ActionEvent event) {
        pic("him");
    }

    private void pic(String owner) {
        String s = Capture.capturePhoto();
        if (s != null) {
            ArrayList<Map<String, Object>> create = (ArrayList<Map<String, Object>>) data.get("create");
            Map<String, Object> map = new HashMap<>();
            map.put("message", "");
            map.put("owner", owner);
            create.add(map);
            findYou().setText("");
            findHim().setText("");

            Label label = new Label(map.get("message").toString());
            label.setUIID(map.get("owner").toString());
            try {
                label.setIcon(Image.createImage(s).scaledWidth(50));

                ImageIO imgIO = ImageIO.getImageIO();
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                imgIO.save(label.getIcon(), out, ImageIO.FORMAT_JPEG, 1);
                byte[] ba = out.toByteArray();
                ParseFile file = new ParseFile(ParseUser.getCurrent().getUsername() + ".jpg", ba, "image/jpeg");
                findMessages().add(label);
                findMessages().getParent().repaint();

                file.save();
                map.put("icon", file);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }


            data.put("create", create);
        }
    }
}
