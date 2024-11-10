import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WebDriverTestTheInternet {
    @Test
    public void startBrowserTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> allLinks = (ArrayList<WebElement>)driver.findElements(By.tagName("a"));

        //проверяем, что наша 10 ссылка - это все еще то, что мы имели ввиду
        Assert.assertEquals(allLinks.get(10).getText(),"Drag and Drop");

        //кликаем на 10 ссылку
        allLinks.get(10).click();
        driver.quit();
    }
}
