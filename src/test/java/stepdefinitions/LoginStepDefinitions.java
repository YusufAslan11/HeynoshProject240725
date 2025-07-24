package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import static org.junit.Assert.*;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("The app is launched")
    public void the_app_is_launched() {
        // App already launched in Hooks
    }

    @When("The user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        loginPage.login("test@demo.com", "123456");
    }

    @And("The user taps the login button")
    public void the_user_taps_the_login_button() {
        // Tıklama zaten login() metodunda yapıldı, burada tekrar gerek yok.
    }

    @Then("The user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        assertTrue("Home page is not displayed!", loginPage.isHomePageDisplayed());
    }
}
