package pageobject.selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPurpleDuckPage {
    private By productPurpleDuck = By.cssSelector("[title='Purple Duck']");
    private By realInformationAboutPurpleDuck = By.id("tab-information");

    public void clickProductPurpleDuck(){
        $(productPurpleDuck).click();
    }

    public void realInformationAboutPurpleDuckIsDisplayed(){
        $(realInformationAboutPurpleDuck).shouldBe(Condition.visible);
    }

    public void getRealInformationAboutPurpleDuckText(String expectedText){
        $(realInformationAboutPurpleDuck).shouldHave(Condition.text(expectedText));
    }
}
