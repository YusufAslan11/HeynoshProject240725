package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterStepDefinitions {


    RegisterPage registerPage=new RegisterPage();

    @Given("User clicks on signUp for free button")
    public void user_clicks_on_sign_up_for_free_button() {

    }
    @Then("User enters full name")
    public void user_enters_fullname() {

    }
    @Then("User enters e-mail address")
    public void user_enters_e_mail_address() {

    }
    @Then("User enters password")
    public void user_enters_password() {

    }
    @Then("User clicks on Continue button")
    public void user_clicks_on_continue_button() {

    }
    @Then("User clicks Agree and Continue button")
    public void user_clicks_agree_and_continue_button() {

    }
    @Then("User clicks skip button")
    public void user_clicks_skip_button() {

    }
    @Then("User allows to the location")
    public void user_allows_to_the_location() {

    }
    @Then("User clicks While Using the app button")
    public void user_clicks_while_using_the_app_button() {

    }
    @Then("User clicks on account button")
    public void user_clicks_on_account_button() {

    }
    @Then("User sees Show Profile")
    public void user_sees_show_profile() {

        Assert.assertTrue(registerPage.logOut_Register.isDisplayed());

    }
    @Then("User closed the page")
    public void user_closed_the_page() {

    }


}
