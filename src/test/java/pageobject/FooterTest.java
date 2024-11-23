package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FooterTest extends TestBase {
    String currencyValue = "EUR";
    String correctCurrencyEUR = "€";
    int numberOfItemsInCart = 0;

    @Test
    public void changeCurrencyInEuros() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.selectCurrency(currencyValue);
        Assert.assertEquals(footerPage.cartCurrencyGetText(),numberOfItemsInCart + " "
                + correctCurrencyEUR);
    }
}
