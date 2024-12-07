package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected By emailField = By.name("email");
    protected By passwordField = By.name("password");
    protected By loginButton = By.name("login");
    protected By validStringWhenUserLogin = By.cssSelector(".notice.success");
    protected By validStringWhenUserNotLogin = By.cssSelector(".notice.errors");
    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void loginWithCredentials(String email, String password) {
        typeEmail(email);
        typePassword(password);
        clickLoginButton();
    }

    public boolean validStringWhenUserLoginIsDisplayed(){
        return driver.findElement(validStringWhenUserLogin).isDisplayed();
    }

    public String getValidStringWhenUserLoginText(){
        return driver.findElement(validStringWhenUserLogin).getText();
    }

    public boolean validStringWhenUserNotLoginIsDisplayed(){
        return driver.findElement(validStringWhenUserNotLogin).isDisplayed();
    }

    public String getValidStringWhenUserNotLoginText(){
        return driver.findElement(validStringWhenUserNotLogin).getText();
    }

}
