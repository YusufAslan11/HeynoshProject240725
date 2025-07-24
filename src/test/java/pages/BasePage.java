package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class BasePage {
    protected AppiumDriver driver;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
}
