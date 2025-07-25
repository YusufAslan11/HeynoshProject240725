package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage{


    // ➤ "Log in" butonunu bul
    @AndroidFindBy(uiAutomator = "text(\"Log in\")")
    public WebElement loginButton;

    // ➤ E-posta veya kullanıcı adı alanı
    @AndroidFindBy(xpath = "//android.widget.EditText")
    public WebElement loginMail;

    // ➤ Alternatif e-posta alanı (örneğin diyalog içindeyse)
    @AndroidFindBy(xpath = "//android.app.Dialog//android.widget.EditText")
    public WebElement loginMailInDialog;

    // ➤ Şifre alanı
    @AndroidFindBy(uiAutomator = "text(\"Password\")")
    public WebElement passwordInput;

    // ➤ Ana sayfa başlığı (doğrulama için)
    @AndroidFindBy(xpath = "//*[@text='Home']")
    public WebElement homePageTitle;

    // ➤ Login işlemini yapan metod
    public void login(String email, String password) {
        try {
            loginMail.sendKeys(email);
        } catch (Exception e) {
            loginMailInDialog.sendKeys(email); // yedek alan kullan
        }
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public boolean isHomePageDisplayed() {
        return homePageTitle.isDisplayed();
    }
}
