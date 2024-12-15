package pageobject.selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Epic("Implementation of the user's cart")
@Feature("Displaying products in the cart")

public class CartTest extends TestBase {
    String massageWhenCartIsEmpty = "There are no items in your cart.";
    String expectedNumberOfItemsInCart = "1";

    @Description("The test goes to the unregistered user's cart and checks that there " +
            "are 0 items in the cart")
    @Test
    public void cartIsEmpty(){
        CartPage cartPage = new CartPage();
        cartPage.clickCartButton();
        cartPage.validStringInElementWhenCartIsEmptyIsDisplayed();
        cartPage.getMessageInElementWhenCartIsEmptyGetText(massageWhenCartIsEmpty);
    }

    @Description("The test adds one product to the unregistered user's cart and checks " +
            "that the product counter is displayed correctly")
    @Test
    public void addToCart1Duck(){
        CartPage cartPage = new CartPage();
        cartPage.clickPurpleDuckButton();
        cartPage.clickAddPurpleDuckToCartButton();
        cartPage.cartQuantityLabelGetText(expectedNumberOfItemsInCart);
    }
}
