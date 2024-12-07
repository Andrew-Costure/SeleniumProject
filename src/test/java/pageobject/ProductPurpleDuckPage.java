package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPurpleDuckPage {
    private WebDriver driver;
    private By productPurpleDuck = By.cssSelector("[title='Purple Duck']");
    private By realInformationAboutPurpleDuck = By.id("tab-information");

    public ProductPurpleDuckPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickProductPurpleDuck(){
        driver.findElement(productPurpleDuck).click();
    }

    public boolean realInformationAboutPurpleDuckIsDisplayed(){
        return driver.findElement(realInformationAboutPurpleDuck).isDisplayed();
    }

    public String getRealInformationAboutPurpleDuckText(){
        return driver.findElement(realInformationAboutPurpleDuck).getText();
    }
}
