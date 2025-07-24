package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;
import utils.AppiumServerManager;

public class Hooks {

    @Before
    public void setUp() {
        AppiumServerManager.start();
        DriverManager.getDriver();
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
        AppiumServerManager.stop();
    }
}
