package pageobject.selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    protected By emailField = By.name("email");
    protected By passwordField = By.name("password");
    protected By loginButton = By.name("login");
    protected By validStringWhenUserLogin = By.cssSelector(".notice.success");
    protected By validStringWhenUserNotLogin = By.cssSelector(".notice.errors");


    public void typeEmail(String email) {
        $(emailField).sendKeys(email);
    }

    public void typePassword(String password) {
        $(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        $(loginButton).click();
    }

    public void loginWithCredentials(String email, String password) {
        typeEmail(email);
        typePassword(password);
        clickLoginButton();
    }

    public void validStringWhenUserLoginIsDisplayed(){
        $(validStringWhenUserLogin).shouldBe(Condition.visible);
    }

    public void getValidStringWhenUserLoginText(String expectedText){
        $(validStringWhenUserLogin).shouldHave(Condition.text(expectedText));
    }

    public void validStringWhenUserNotLoginIsDisplayed(){
        $(validStringWhenUserNotLogin).shouldBe(Condition.visible);
    }

    public void getValidStringWhenUserNotLoginText(String expectedText){
        $(validStringWhenUserNotLogin).shouldHave(Condition.text(expectedText));
    }

}
