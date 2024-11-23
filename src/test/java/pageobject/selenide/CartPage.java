package pageobject.selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends LoginPage {
    private By cartButton = By.id("cart");
    private By stringInElementWhenCartIsEmpty = By.tagName("em");
    private By purpleDuckButton = By.cssSelector("[title='Purple Duck']");
    private By addPurpleDuckToCartButton = By.name("add_cart_product");
    public By cartQuantityLabel = By.cssSelector("span[class='quantity']");

    public void clickCartButton(){
        $(cartButton).click();
    }
    public void validStringInElementWhenCartIsEmptyIsDisplayed(){
        $(stringInElementWhenCartIsEmpty).shouldBe(Condition.visible);
    }

    public void getStringInElementWhenCartIsEmptyGetText(String expectedText){
        $(stringInElementWhenCartIsEmpty).shouldHave(Condition.text(expectedText));
    }

    public void clickPurpleDuckButton(){
        $(purpleDuckButton).click();
    }

    public void clickAddPurpleDuckToCartButton(){
        $(addPurpleDuckToCartButton).click();
    }

    public void cartQuantityLabelGetText(String expectedText){
        $(cartQuantityLabel).shouldHave(Condition.text(expectedText));
    }

}
