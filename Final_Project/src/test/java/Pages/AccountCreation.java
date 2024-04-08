package Pages;

import org.openqa.selenium.By;

public class AccountCreation {
    public static final By SIGN_IN_BUTTON = By.xpath("//*[@id=\"signinLink\"]");

    public static final By CREATE_ACCOUNT_BUTTON = By.id("newAccountBtn");
    public static final By NAME_INPUT = By.name("name");
    public static final By EMAIL_INPUT = By.name("email");
    public static final By PASSWORD_INPUT = By.name("password");
    public static final By CONFIRM_PASSWORD_INPUT = By.xpath
            ("//*[@id=\"confirmPasswordInput\"]");
    public static final By SIGN_UP_BUTTON = By.xpath("//*[@id=\"signUpForm\"]/div[5]");
    public static final By USER_PROFILE = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div");
}
