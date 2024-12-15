package pageobject.selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Epic("Footer")
@Feature("Currency change function")

public class FooterTest extends TestBase {
    String currencyValue = "EUR";
    String correctCurrencyEUR = "€";
    int numberOfItemsInCart = 0;

    @Description("The test clicks on the currency change button and successfully " +
            "changes it to euros")
    @Test
    public void changeCurrencyInEuros() {
        FooterPage footerPage = new FooterPage( );
        footerPage.selectCurrency(currencyValue);
        footerPage.cartCurrencyGetText(numberOfItemsInCart + " "
                + correctCurrencyEUR);
    }
}
