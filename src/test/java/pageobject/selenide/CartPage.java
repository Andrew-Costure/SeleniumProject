package pageobject.selenide;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends LoginPage {
    private By cartButton = By.id("cart");
    private By stringInElementWhenCartIsEmpty = By.tagName("em");
    private By purpleDuckButton = By.cssSelector("[title='Purple Duck']");
    private By addPurpleDuckToCartButton = By.name("add_cart_product");
    public By cartQuantityLabel = By.cssSelector("span[class='quantity']");

//    @Step("Click to icon \"Cart\"")
    public void clickCartButton(){
        $(cartButton).click();
    }

//    @Step("Validate that message when cart is empty is visible")
    public void validStringInElementWhenCartIsEmptyIsDisplayed(){
        $(stringInElementWhenCartIsEmpty).shouldBe(Condition.visible);
    }

//    @Step("Validate that message when cart is empty matches expectation")
    public void getMessageInElementWhenCartIsEmptyGetText(String expectedText){
        $(stringInElementWhenCartIsEmpty).shouldHave(Condition.text(expectedText));
    }

//    @Step("Click to icon \"Purple Duck\"")
    public void clickPurpleDuckButton(){
        $(purpleDuckButton).click();
    }

//    @Step("Click to button \"Add To Cart\"")
    public void clickAddPurpleDuckToCartButton(){
        $(addPurpleDuckToCartButton).click();
    }

//    @Step("Validate that icon label in cart matches expectation number")
    public void cartQuantityLabelGetText(String expectedText){
        $(cartQuantityLabel).shouldHave(Condition.text(expectedText));
    }

}
