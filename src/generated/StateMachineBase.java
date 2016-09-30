/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Component findAdd(Component root) {
        return (com.codename1.ui.Component)findByName("Add", root);
    }

    public com.codename1.ui.Component findAdd() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Add", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Add", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findMessages(Component root) {
        return (com.codename1.ui.Container)findByName("Messages", root);
    }

    public com.codename1.ui.Container findMessages() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Messages", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Messages", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findEmail(Component root) {
        return (com.codename1.ui.TextField)findByName("Email", root);
    }

    public com.codename1.ui.TextField findEmail() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Email", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Email", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findMessage(Component root) {
        return (com.codename1.ui.TextField)findByName("Message", root);
    }

    public com.codename1.ui.TextField findMessage() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Message", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Message", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findHimPic(Component root) {
        return (com.codename1.ui.Button)findByName("HimPic", root);
    }

    public com.codename1.ui.Button findHimPic() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("HimPic", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("HimPic", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findLogin(Component root) {
        return (com.codename1.ui.Button)findByName("Login", root);
    }

    public com.codename1.ui.Button findLogin() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Login", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Login", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.list.MultiList findConversitons(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("Conversitons", root);
    }

    public com.codename1.ui.list.MultiList findConversitons() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("Conversitons", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("Conversitons", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findHim(Component root) {
        return (com.codename1.ui.TextField)findByName("Him", root);
    }

    public com.codename1.ui.TextField findHim() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Him", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Him", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findMobile(Component root) {
        return (com.codename1.ui.TextField)findByName("Mobile", root);
    }

    public com.codename1.ui.TextField findMobile() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Mobile", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Mobile", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSend(Component root) {
        return (com.codename1.ui.Button)findByName("Send", root);
    }

    public com.codename1.ui.Button findSend() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Send", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Send", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.list.MultiList findResults(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("Results", root);
    }

    public com.codename1.ui.list.MultiList findResults() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("Results", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("Results", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findUsername(Component root) {
        return (com.codename1.ui.TextField)findByName("Username", root);
    }

    public com.codename1.ui.TextField findUsername() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Username", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Username", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Component findCreate(Component root) {
        return (com.codename1.ui.Component)findByName("Create", root);
    }

    public com.codename1.ui.Component findCreate() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Create", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Create", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Component findSingup(Component root) {
        return (com.codename1.ui.Component)findByName("Singup", root);
    }

    public com.codename1.ui.Component findSingup() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Singup", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Singup", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findYouPic(Component root) {
        return (com.codename1.ui.Button)findByName("YouPic", root);
    }

    public com.codename1.ui.Button findYouPic() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("YouPic", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("YouPic", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSave(Component root) {
        return (com.codename1.ui.Button)findByName("Save", root);
    }

    public com.codename1.ui.Button findSave() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Save", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Save", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findYou(Component root) {
        return (com.codename1.ui.TextField)findByName("You", root);
    }

    public com.codename1.ui.TextField findYou() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("You", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("You", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPassword(Component root) {
        return (com.codename1.ui.TextField)findByName("Password", root);
    }

    public com.codename1.ui.TextField findPassword() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Password", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Password", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_HomeCreate = 3;
    public static final int COMMAND_MainSingup = 2;
    public static final int COMMAND_SingupLogin = 1;

    protected boolean onHomeCreate() {
        return false;
    }

    protected boolean onMainSingup() {
        return false;
    }

    protected boolean onSingupLogin() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_HomeCreate:
                if(onHomeCreate()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainSingup:
                if(onMainSingup()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_SingupLogin:
                if(onSingupLogin()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("Add".equals(f.getName())) {
            exitAdd(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            exitHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Create".equals(f.getName())) {
            exitCreate(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Singup".equals(f.getName())) {
            exitSingup(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Chat".equals(f.getName())) {
            exitChat(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitAdd(Form f) {
    }


    protected void exitHome(Form f) {
    }


    protected void exitCreate(Form f) {
    }


    protected void exitMain(Form f) {
    }


    protected void exitSingup(Form f) {
    }


    protected void exitChat(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Add".equals(f.getName())) {
            beforeAdd(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            beforeHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Create".equals(f.getName())) {
            beforeCreate(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Singup".equals(f.getName())) {
            beforeSingup(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Chat".equals(f.getName())) {
            beforeChat(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeAdd(Form f) {
    }


    protected void beforeHome(Form f) {
    }


    protected void beforeCreate(Form f) {
    }


    protected void beforeMain(Form f) {
    }


    protected void beforeSingup(Form f) {
    }


    protected void beforeChat(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Add".equals(c.getName())) {
            beforeContainerAdd(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(c.getName())) {
            beforeContainerHome(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Create".equals(c.getName())) {
            beforeContainerCreate(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Singup".equals(c.getName())) {
            beforeContainerSingup(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Chat".equals(c.getName())) {
            beforeContainerChat(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerAdd(Container c) {
    }


    protected void beforeContainerHome(Container c) {
    }


    protected void beforeContainerCreate(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }


    protected void beforeContainerSingup(Container c) {
    }


    protected void beforeContainerChat(Container c) {
    }

    protected void postShow(Form f) {
        if("Add".equals(f.getName())) {
            postAdd(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            postHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Create".equals(f.getName())) {
            postCreate(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Singup".equals(f.getName())) {
            postSingup(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Chat".equals(f.getName())) {
            postChat(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postAdd(Form f) {
    }


    protected void postHome(Form f) {
    }


    protected void postCreate(Form f) {
    }


    protected void postMain(Form f) {
    }


    protected void postSingup(Form f) {
    }


    protected void postChat(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Add".equals(c.getName())) {
            postContainerAdd(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(c.getName())) {
            postContainerHome(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Create".equals(c.getName())) {
            postContainerCreate(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Singup".equals(c.getName())) {
            postContainerSingup(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Chat".equals(c.getName())) {
            postContainerChat(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerAdd(Container c) {
    }


    protected void postContainerHome(Container c) {
    }


    protected void postContainerCreate(Container c) {
    }


    protected void postContainerMain(Container c) {
    }


    protected void postContainerSingup(Container c) {
    }


    protected void postContainerChat(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Add".equals(rootName)) {
            onCreateAdd();
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(rootName)) {
            onCreateHome();
            aboutToShowThisContainer = null;
            return;
        }

        if("Create".equals(rootName)) {
            onCreateCreate();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

        if("Singup".equals(rootName)) {
            onCreateSingup();
            aboutToShowThisContainer = null;
            return;
        }

        if("Chat".equals(rootName)) {
            onCreateChat();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateAdd() {
    }


    protected void onCreateHome() {
    }


    protected void onCreateCreate() {
    }


    protected void onCreateMain() {
    }


    protected void onCreateSingup() {
    }


    protected void onCreateChat() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Add".equals(f.getName())) {
            getStateAdd(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Home".equals(f.getName())) {
            getStateHome(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Create".equals(f.getName())) {
            getStateCreate(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Singup".equals(f.getName())) {
            getStateSingup(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Chat".equals(f.getName())) {
            getStateChat(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateAdd(Form f, Hashtable h) {
    }


    protected void getStateHome(Form f, Hashtable h) {
    }


    protected void getStateCreate(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }


    protected void getStateSingup(Form f, Hashtable h) {
    }


    protected void getStateChat(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Add".equals(f.getName())) {
            setStateAdd(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            setStateHome(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Create".equals(f.getName())) {
            setStateCreate(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Singup".equals(f.getName())) {
            setStateSingup(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Chat".equals(f.getName())) {
            setStateChat(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateAdd(Form f, Hashtable state) {
    }


    protected void setStateHome(Form f, Hashtable state) {
    }


    protected void setStateCreate(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }


    protected void setStateSingup(Form f, Hashtable state) {
    }


    protected void setStateChat(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("Conversitons".equals(listName)) {
            return initListModelConversitons(cmp);
        }
        if("Results".equals(listName)) {
            return initListModelResults(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelConversitons(List cmp) {
        return false;
    }

    protected boolean initListModelResults(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Add")) {
            if("Results".equals(c.getName())) {
                onAdd_ResultsAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Home")) {
            if("Conversitons".equals(c.getName())) {
                onHome_ConversitonsAction(c, event);
                return;
            }
            if("Add".equals(c.getName())) {
                onHome_AddAction(c, event);
                return;
            }
            if("Create".equals(c.getName())) {
                onHome_CreateAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Create")) {
            if("You".equals(c.getName())) {
                onCreate_YouAction(c, event);
                return;
            }
            if("YouPic".equals(c.getName())) {
                onCreate_YouPicAction(c, event);
                return;
            }
            if("Him".equals(c.getName())) {
                onCreate_HimAction(c, event);
                return;
            }
            if("HimPic".equals(c.getName())) {
                onCreate_HimPicAction(c, event);
                return;
            }
            if("Send".equals(c.getName())) {
                onCreate_SendAction(c, event);
                return;
            }
            if("Save".equals(c.getName())) {
                onCreate_SaveAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("Username".equals(c.getName())) {
                onMain_UsernameAction(c, event);
                return;
            }
            if("Password".equals(c.getName())) {
                onMain_PasswordAction(c, event);
                return;
            }
            if("Login".equals(c.getName())) {
                onMain_LoginAction(c, event);
                return;
            }
            if("Singup".equals(c.getName())) {
                onMain_SingupAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Singup")) {
            if("Username".equals(c.getName())) {
                onSingup_UsernameAction(c, event);
                return;
            }
            if("Mobile".equals(c.getName())) {
                onSingup_MobileAction(c, event);
                return;
            }
            if("Email".equals(c.getName())) {
                onSingup_EmailAction(c, event);
                return;
            }
            if("Password".equals(c.getName())) {
                onSingup_PasswordAction(c, event);
                return;
            }
            if("Singup".equals(c.getName())) {
                onSingup_SingupAction(c, event);
                return;
            }
            if("Login".equals(c.getName())) {
                onSingup_LoginAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Chat")) {
            if("Message".equals(c.getName())) {
                onChat_MessageAction(c, event);
                return;
            }
            if("Send".equals(c.getName())) {
                onChat_SendAction(c, event);
                return;
            }
        }
    }

      protected void onAdd_ResultsAction(Component c, ActionEvent event) {
      }

      protected void onHome_ConversitonsAction(Component c, ActionEvent event) {
      }

      protected void onHome_AddAction(Component c, ActionEvent event) {
      }

      protected void onHome_CreateAction(Component c, ActionEvent event) {
      }

      protected void onCreate_YouAction(Component c, ActionEvent event) {
      }

      protected void onCreate_YouPicAction(Component c, ActionEvent event) {
      }

      protected void onCreate_HimAction(Component c, ActionEvent event) {
      }

      protected void onCreate_HimPicAction(Component c, ActionEvent event) {
      }

      protected void onCreate_SendAction(Component c, ActionEvent event) {
      }

      protected void onCreate_SaveAction(Component c, ActionEvent event) {
      }

      protected void onMain_UsernameAction(Component c, ActionEvent event) {
      }

      protected void onMain_PasswordAction(Component c, ActionEvent event) {
      }

      protected void onMain_LoginAction(Component c, ActionEvent event) {
      }

      protected void onMain_SingupAction(Component c, ActionEvent event) {
      }

      protected void onSingup_UsernameAction(Component c, ActionEvent event) {
      }

      protected void onSingup_MobileAction(Component c, ActionEvent event) {
      }

      protected void onSingup_EmailAction(Component c, ActionEvent event) {
      }

      protected void onSingup_PasswordAction(Component c, ActionEvent event) {
      }

      protected void onSingup_SingupAction(Component c, ActionEvent event) {
      }

      protected void onSingup_LoginAction(Component c, ActionEvent event) {
      }

      protected void onChat_MessageAction(Component c, ActionEvent event) {
      }

      protected void onChat_SendAction(Component c, ActionEvent event) {
      }

}
