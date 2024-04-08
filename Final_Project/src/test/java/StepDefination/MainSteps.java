package StepDefination;

import Pages.AccountCreation;
import Utilities.Utilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MainSteps extends Utilities {

    @When("User Navigate to Signing in button")
    public void user_navigate_to_signing_in_button() {
        clickElement(AccountCreation.SIGN_IN_BUTTON );
    }
    @Then("User Navigate to Create account button")
    public void user_navigate_to_create_account_button() {
        clickElement(AccountCreation.CREATE_ACCOUNT_BUTTON);

    }
    @Then("Provide {string},{string} and {string}")
    public void provide_and(String name, String email, String password) {
        sendTextElement(AccountCreation.NAME_INPUT, name);
        sendTextElement(AccountCreation.EMAIL_INPUT, email);
        sendTextElement(AccountCreation.PASSWORD_INPUT,password);
        sendTextElement(AccountCreation.CONFIRM_PASSWORD_INPUT,password);

    }
    @Then("User to Click on SignUp button")
    public void user_to_click_on_sign_up_button() {
        clickElement(AccountCreation.SIGN_UP_BUTTON);
    }
    @Then("User Account is created")
    public void user_account_is_created() {
        isElementDisplayed((AccountCreation.USER_PROFILE));

    }
}
