package pageobject.selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Epic("Login functionality implementation")
@Feature("Login")

public class LoginTest extends TestBase {

    String noticeSuccess = "You are now logged in as Olya Cich.";
    String noticeErrors = "Wrong password or the account is disabled, or does not exist";

    @Description("This test attempts to login with correct email and password and verifies success message")
    @Test
    public void testValidLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginWithCredentials("test@gmail.com","1234");
        loginPage.validMassageWhenUserLoginIsDisplayed();
        loginPage.getValidMassageWhenUserLoginText(noticeSuccess);
    }

    @Description("This test attempts to login with invalid email and correct password and verifies error message")
    @Test
    public void testInvalidEmailAndCorrectPassword(){
        LoginPage loginPage = new LoginPage( );
        loginPage.loginWithCredentials("test@gmail.co","1234");
        loginPage.validMassageWhenUserNotLoginIsDisplayed();
        loginPage.getValidMassageWhenUserNotLoginText(noticeErrors);
    }


}
