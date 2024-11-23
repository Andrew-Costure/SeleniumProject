package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class CartTest extends TestBase {
    String massageWhenCartIsEmpty = "There are no items in your cart.";
    String expectedNumberOfItemsInCart = "1";

    @Test
    public void CartIsEmpty(){
        CartPage cartPage = new CartPage(driver);
        SoftAssert softAssert = new SoftAssert();
        cartPage.clickCartButton();
        softAssert.assertTrue(cartPage.validStringInElementWhenCartIsEmptyIsDisplayed(),
                "String when cart is empty not displayed");
        softAssert.assertEquals(cartPage.getStringInElementWhenCartIsEmptyGetText(), massageWhenCartIsEmpty);
        softAssert.assertAll();
    }

    @Test
    public void AddToCart1Duck(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        CartPage cartPage = new CartPage(driver);
        cartPage.clickPurpleDuckButton();
        cartPage.clickAddPurpleDuckToCartButton();
        wait.until(ExpectedConditions.textToBe((cartPage.cartQuantityLabel), "1"));
        Assert.assertEquals(cartPage.cartQuantityLabelGetText(), expectedNumberOfItemsInCart);
    }
}
