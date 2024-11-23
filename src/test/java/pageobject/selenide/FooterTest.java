package pageobject.selenide;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest extends TestBase {
    String currencyValue = "EUR";
    String correctCurrencyEUR = "€";
    int numberOfItemsInCart = 0;

    @Test
    public void changeCurrencyInEuros() {
        FooterPage footerPage = new FooterPage( );
        footerPage.selectCurrency(currencyValue);
        footerPage.cartCurrencyGetText(numberOfItemsInCart + " "
                + correctCurrencyEUR);
    }
}
