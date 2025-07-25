package pages;


import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up free\")")
    public WebElement signupForFree;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ion-input-0\")")
    public WebElement fullName_Register;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ion-input-1\")")
    public WebElement eMail_Register;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ion-input-2\")")
    public WebElement password_Register;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Continue\")")
    public WebElement continue_Register;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Agree and Continue\")")
    public WebElement agreeAndContinue_Register;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Skip\")")
    public WebElement skip_Register;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
    public WebElement allow_Register;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\")")
    public WebElement whileUsingTheApp;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"account\")")
    public WebElement account_Register;

    @AndroidFindBy(uiAutomator =
            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +  // Sayfayı kaydırarak ilgili locate e ulaşıyor
                    "new UiSelector().text(\"Log Out\"))")
    public WebElement logOut_Register;








    @AndroidFindBy(uiAutomator = "text(\"Don’t allow\")")
    public WebElement dontAllow;

    @AndroidFindBy(xpath="//android.widget.EditText")
    public WebElement EmailAndPassword;

    @AndroidFindBy(uiAutomator = "text(\"Continue\")")
    public WebElement Continue;

    @AndroidFindBy(uiAutomator = "text(\"Agree and Continue\")")
    public WebElement AgreeAndContinueOld;

    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Agree and Continue\"]")
    public WebElement AgreeAndContinue;

    @AndroidFindBy(xpath="//android.webkit.WebView[@text=\"Heynosh\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")
    public WebElement Skipvideo;

    @AndroidFindBy(uiAutomator = "text(\"Allow\")")
    public WebElement Allow;

    @AndroidFindBy(uiAutomator = "text(\"While using the app\")")
    public WebElement WhileUsingTheApp;

    @AndroidFindBy(uiAutomator = "text(\"Account\")")
    public WebElement Account;

    @AndroidFindBy(uiAutomator = "text(\"Show profile\")")
    public WebElement Showprofile;

    @AndroidFindBy(uiAutomator = "text(\"Profile\")")
    public WebElement Profile;


    @AndroidFindBy(uiAutomator = "text(\"* Please enter a valid email address!\")")
    public WebElement InvalidEmail;

    @AndroidFindBy(uiAutomator = "text(\"* Must contain at least 6 characters\")")
    public WebElement InvalidPassword;







}
