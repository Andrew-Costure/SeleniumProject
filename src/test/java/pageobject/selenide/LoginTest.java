package pageobject.selenide;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {

    String noticeSuccess = "You are now logged in as Olya Cich.";
    String noticeErrors = "Wrong password or the account is disabled, or does not exist";

    @Test
    public void testValidLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginWithCredentials("test@gmail.com","1234");
        loginPage.validStringWhenUserLoginIsDisplayed();
        loginPage.getValidStringWhenUserLoginText(noticeSuccess);
    }

    @Test
    public void testInvalidEmailAndCorrectPassword(){
        LoginPage loginPage = new LoginPage( );
        loginPage.loginWithCredentials("test@gmail.co","1234");
        loginPage.validStringWhenUserNotLoginIsDisplayed();
        loginPage.getValidStringWhenUserNotLoginText(noticeErrors);
    }


}
