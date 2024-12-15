package pageobject.selenide;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;

public class FooterPage {
    private By changeCurrencyButton = By.className("change");
    private By currencyCode = By.name("currency_code");
    private By saveCurrencyButton = By.name("save");
    private By cartCurrency = By.className("formatted_value");

//    @Step("Click to button \"Change\"")
    public void clickChangeCurrencyButton() {
        $(changeCurrencyButton).click();
    }

//    @Step("Click to button \"Save\"")
    public void clickSaveCurrencyButton() {
        $(saveCurrencyButton).click();
    }

//    @Step("Selecting and saving the selected currency")
    public void selectCurrency(String currencyValue) {
        clickChangeCurrencyButton();
        Select dropdownCurrency = new Select($(currencyCode));
        dropdownCurrency.selectByValue(currencyValue);
        clickSaveCurrencyButton();
    }

//    @Step("Validate that the changed and selected currency matches the expected one")
    public void cartCurrencyGetText(String expectedText){
        $(cartCurrency).shouldHave(Condition.text(expectedText));
    }
}
