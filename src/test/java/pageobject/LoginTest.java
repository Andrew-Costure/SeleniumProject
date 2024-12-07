package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class LoginTest extends TestBase {

    String noticeSuccess = "You are now logged in as Olya Cich.";
    String noticeErrors = "Wrong password or the account is disabled, or does not exist";

    @Test
    public void testValidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        SoftAssert softAssert = new SoftAssert();
        loginPage.loginWithCredentials("test@gmail.com","1234");
        softAssert.assertTrue(loginPage.validStringWhenUserLoginIsDisplayed(), "Login massage is not displayed");
        softAssert.assertEquals(loginPage.getValidStringWhenUserLoginText(), noticeSuccess);
        softAssert.assertAll();
    }

    @Test
    public void testInvalidEmailAndCorrectPassword(){
        LoginPage loginPage = new LoginPage(driver);
        SoftAssert softAssert = new SoftAssert();
        loginPage.loginWithCredentials("test@gmail.co","1234");
        softAssert.assertTrue(loginPage.validStringWhenUserNotLoginIsDisplayed(), "Error massage is not displayed");
        softAssert.assertEquals(loginPage.getValidStringWhenUserNotLoginText(), noticeErrors);
        softAssert.assertAll();
    }


}
