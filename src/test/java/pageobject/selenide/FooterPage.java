package pageobject.selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;

public class FooterPage {
    private By changeCurrencyButton = By.className("change");
    private By currencyCode = By.name("currency_code");
    private By saveCurrencyButton = By.name("save");
    private By cartCurrency = By.className("formatted_value");

    public void clickChangeCurrencyButton() {
        $(changeCurrencyButton).click();
    }

    public void clickSaveCurrencyButton() {
        $(saveCurrencyButton).click();
    }

    public void selectCurrency(String currencyValue) {
        clickChangeCurrencyButton();
        Select dropdownCurrency = new Select($(currencyCode));
        dropdownCurrency.selectByValue(currencyValue);
        clickSaveCurrencyButton();
    }

    public void cartCurrencyGetText(String expectedText){
        $(cartCurrency).shouldHave(Condition.text(expectedText));
    }
}
