package pageobject.selenide;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class CartTest extends TestBase {
    String massageWhenCartIsEmpty = "There are no items in your cart.";
    String expectedNumberOfItemsInCart = "1";

    @Test
    public void CartIsEmpty(){
        CartPage cartPage = new CartPage();
        cartPage.clickCartButton();
        cartPage.validStringInElementWhenCartIsEmptyIsDisplayed();
        cartPage.getStringInElementWhenCartIsEmptyGetText(massageWhenCartIsEmpty);
    }

    @Test
    public void AddToCart1Duck(){
        CartPage cartPage = new CartPage();
        cartPage.clickPurpleDuckButton();
        cartPage.clickAddPurpleDuckToCartButton();
        cartPage.cartQuantityLabelGetText(expectedNumberOfItemsInCart);
    }
}
