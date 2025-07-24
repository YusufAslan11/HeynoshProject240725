package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if (driver == null) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", ConfigReader.get("platformName"));
            caps.setCapability("platformVersion", ConfigReader.get("platformVersion"));
            caps.setCapability("deviceName", ConfigReader.get("deviceName"));
            caps.setCapability("appPackage", ConfigReader.get("appPackage"));
            caps.setCapability("appActivity", ConfigReader.get("appActivity"));
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("noReset", true);

            try {
                driver = new AndroidDriver(new URL(ConfigReader.get("appiumServerURL")), caps);
            } catch (MalformedURLException e) {
                throw new RuntimeException("Invalid Appium Server URL", e);
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
