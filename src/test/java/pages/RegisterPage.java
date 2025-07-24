package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

import java.time.Duration;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(

             new AppiumFieldDecorator(DriverManager.getDriver(), Duration.ofSeconds(10)),
            this
            );
}}
