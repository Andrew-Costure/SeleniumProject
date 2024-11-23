package pageobject.selenide;

import org.testng.annotations.Test;

public class ProductPurpleDuckTest extends TestBase {
    String expectedInformationAboutPurpleDuck = "Lorem ipsum dolor sit amet, " +
            "consectetur adipiscing elit. Suspendisse sollicitudin ante massa, " +
            "eget ornare libero porta congue. Cras scelerisque dui non consequat " +
            "sollicitudin. Sed pretium tortor ac auctor molestie. Nulla facilisi. " +
            "Maecenas pulvinar nibh vitae lectus vehicula semper. Donec et aliquet velit. " +
            "Curabitur non ullamcorper mauris. In hac habitasse platea dictumst. " +
            "Phasellus ut pretium justo, sit amet bibendum urna. Maecenas sit amet arcu " +
            "pulvinar, facilisis quam at, viverra nisi. Morbi sit amet adipiscing ante. " +
            "Integer imperdiet volutpat ante, sed venenatis urna volutpat a. " +
            "Proin justo massa, convallis vitae consectetur sit amet, facilisis id libero.";

    @Test
    public void CheckThatPurpleDuckHaveTrueInformation(){
        ProductPurpleDuckPage productPage = new ProductPurpleDuckPage();
        productPage.clickProductPurpleDuck();
        productPage.realInformationAboutPurpleDuckIsDisplayed();
        productPage.getRealInformationAboutPurpleDuckText(expectedInformationAboutPurpleDuck);
    }
}
