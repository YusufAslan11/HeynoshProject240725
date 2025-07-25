package utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import static utils.DriverManager.getDriver;

public class ReusableMethods {
    static Actions actions = new Actions(getDriver());

    /** Wait */
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /** Wait for clickable */
    public static WebElement waitForClickAbility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /** Wait for visible */
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /** Scroll down using TouchAction */
    public static void scrollDown() {
        Dimension size = getDriver().manage().window().getSize();
        int screenWidth = size.width;
        int screenHeight = size.height;

        int startX = screenWidth / 2;
        int startY = (int) (screenHeight * 0.8);
        int endY = (int) (screenHeight * 0.2);

        ((JavascriptExecutor) getDriver()).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, // kaydırılacak alanın sol sınırı
                "top", 100,  // üst sınırı
                "width", screenWidth - 200, // genişliği
                "height", screenHeight - 200, // yüksekliği
                "direction", "down",
                "percent", 0.8
        ));
    }

    /** Scroll into view by text */
    public static void scrollIntoView(String text) {
        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                + ".scrollIntoView(new UiSelector().text(\"" + text + "\"));";
        getDriver().findElement(AppiumBy.androidUIAutomator(command));
    }

    /** Tap on element using JavaScript */
    public static void tapJS(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("mobile: clickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
    }

    /** Long press */
    public static void longPress(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
    }

    /** Drag and drop */
    public static void dragAndDrop(WebElement element, double endX, double endY) {
        ((JavascriptExecutor) getDriver()).executeScript("mobile: dragGesture",
                ImmutableMap.of(
                        "elementId", ((RemoteWebElement) element).getId(),
                        "endX", endX,
                        "endY", endY,
                        "speed", 3000
                ));
    }

    /** Enter text safely */
    public static void enterText(WebElement element, String text) {
        waitForClickAbility(element, 10).sendKeys(text);
    }

    /** Scroll generic (direction: up/down/left/right) */
    public static void scroll(String direction) {
        Dimension size = getDriver().manage().window().getSize();
        int midX = size.width / 2;
        int midY = size.height / 2;

        ((JavascriptExecutor) getDriver()).executeScript("mobile: scrollGesture",
                ImmutableMap.of(
                        "left", midX * 0.5,
                        "top", midY * 0.5,
                        "width", midX,
                        "height", midY,
                        "direction", direction.toLowerCase(),
                        "percent", 0.75
                ));
    }

    /** Locate by text (returns By locator) */
    public static By locateElementByText(String text) {
        return AppiumBy.androidUIAutomator("new UiSelector().text(\"" + text + "\")");
    }
}
