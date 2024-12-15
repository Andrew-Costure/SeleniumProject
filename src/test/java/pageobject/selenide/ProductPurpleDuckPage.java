package pageobject.selenide;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPurpleDuckPage {
    private By productPurpleDuck = By.cssSelector("[title='Purple Duck']");
    private By realInformationAboutPurpleDuck = By.id("tab-information");

//    @Step("Click on the icon purple duck")
    public void clickProductPurpleDuck(){
        $(productPurpleDuck).click();
    }
//    @Step("Validate that information about purple duck is visible")
    public void realInformationAboutPurpleDuckIsDisplayed(){
        $(realInformationAboutPurpleDuck).shouldBe(Condition.visible);
    }

//    @Step("Validate that information about purple duck matches expectation")
    public void getRealInformationAboutPurpleDuckText(String expectedText){
        $(realInformationAboutPurpleDuck).shouldHave(Condition.text(expectedText));
    }
}
