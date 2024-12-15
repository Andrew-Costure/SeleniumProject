package pageobject.selenide;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    protected By emailField = By.name("email");
    protected By passwordField = By.name("password");
    protected By loginButton = By.name("login");
    protected By validMassageWhenUserLogin = By.cssSelector(".notice.success");
    protected By validMassageWhenUserNotLogin = By.cssSelector(".notice.errors");

//    @Step("entering into the field \"Email Address\"")
    public void typeEmail(String email) {
        $(emailField).sendKeys(email);
    }

//    @Step("entering into the field \"Password\"")
    public void typePassword(String password) {
        $(passwordField).sendKeys(password);
    }

//    @Step("Click to button \"Login\"")
    public void clickLoginButton() {
        $(loginButton).click();
    }

//    @Step("Login with with the entered data")
    public void loginWithCredentials(String email, String password) {
        typeEmail(email);
        typePassword(password);
        clickLoginButton();
    }

//    @Step("Validate that message when user successfully login is visible")
    public void validMassageWhenUserLoginIsDisplayed(){
        $(validMassageWhenUserLogin).shouldBe(Condition.visible);
    }

//    @Step("Validate that message when user successfully login matches expectation")
    public void getValidMassageWhenUserLoginText(String expectedText){
        $(validMassageWhenUserLogin).shouldHave(Condition.text(expectedText));
    }

//    @Step("Validate that message when user unsuccessfully login is visible")
    public void validMassageWhenUserNotLoginIsDisplayed(){
        $(validMassageWhenUserNotLogin).shouldBe(Condition.visible);
    }

//    @Step("Validate that message when user unsuccessfully login matches expectation")
    public void getValidMassageWhenUserNotLoginText(String expectedText){
        $(validMassageWhenUserNotLogin).shouldHave(Condition.text(expectedText));
    }

}
