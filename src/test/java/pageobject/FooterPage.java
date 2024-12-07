package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FooterPage {

    private WebDriver driver;
    public FooterPage(WebDriver driver){
        this.driver = driver;
    }
    private By changeCurrencyButton = By.className("change");
    private By currencyCode = By.name("currency_code");
    private By saveCurrencyButton = By.name("save");
    private By cartCurrency = By.className("formatted_value");

    public void clickChangeCurrencyButton() {
        driver.findElement(changeCurrencyButton).click();
    }

    public void clickSaveCurrencyButton() {
        driver.findElement(saveCurrencyButton).click();
    }

    public void selectCurrency(String currencyValue) {
        clickChangeCurrencyButton();
        Select dropdownCurrency = new Select(driver.findElement(currencyCode));
        dropdownCurrency.selectByValue(currencyValue);
        clickSaveCurrencyButton();
    }

    public String cartCurrencyGetText(){
        return driver.findElement(cartCurrency).getText();
    }
}
