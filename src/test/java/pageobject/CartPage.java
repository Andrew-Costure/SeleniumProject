package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class CartPage extends LoginPage {
    private By cartButton = By.id("cart");
    private By stringInElementWhenCartIsEmpty = By.tagName("em");
    private By purpleDuckButton = By.cssSelector("[title='Purple Duck']");
    private By addPurpleDuckToCartButton = By.name("add_cart_product");
    public By cartQuantityLabel = By.cssSelector("span[class='quantity']");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickCartButton(){
        driver.findElement(cartButton).click();
    }
    public boolean validStringInElementWhenCartIsEmptyIsDisplayed(){
        return driver.findElement(stringInElementWhenCartIsEmpty).isDisplayed();
    }

    public String getStringInElementWhenCartIsEmptyGetText(){
        return driver.findElement(stringInElementWhenCartIsEmpty).getText();
    }

    public void clickPurpleDuckButton(){
        driver.findElement(purpleDuckButton).click();
    }

    public void clickAddPurpleDuckToCartButton(){
        driver.findElement(addPurpleDuckToCartButton).click();
    }

    public String cartQuantityLabelGetText(){
        return driver.findElement(cartQuantityLabel).getText();
    }

}
