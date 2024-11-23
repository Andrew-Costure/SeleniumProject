import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WebDriverTestTheInternet {
    @Test
    public void testTheInternet() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> allLinks = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));

        //проверяем, что наша 10 ссылка - это все еще то, что мы имели ввиду
        Assert.assertEquals(allLinks.get(10).getText(), "Drag and Drop");

        //кликаем на 10 ссылку
        allLinks.get(10).click();
        driver.quit();
    }

    @Test
    public void testFindElementHome() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement home = driver.findElement(By.cssSelector(".fa.fa-home"));
        home.click();
        WebElement lonelyDuck = driver.findElement(By.cssSelector("[src='/images/slides/1-lonely-duck.jpg']"));
        Assert.assertEquals(lonelyDuck.getAttribute("src"), "https://litecart.stqa.ru/images/slides/1-lonely-duck.jpg");
        driver.quit();
    }

    @Test
    public void testFindElementRubberDucks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement rubberDucks = driver.findElement(By.cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']"));
        rubberDucks.click();
        WebElement titleOfRubberDuck = driver.findElement(By.cssSelector("#box-category h1.title"));
        Assert.assertEquals(titleOfRubberDuck.getText(), "Rubber Ducks");
        driver.quit();
    }

    @Test
    public void testFindElementSubcategory() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement rubberDucks = driver.findElement(By.cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(rubberDucks).perform();
        WebElement subcategory = driver.findElement(By.cssSelector("#site-menu [href='https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/']"));
        subcategory.click();
        Assert.assertEquals(driver.getTitle(), "Subcategory | My Store");
        driver.quit();
    }

    @Test
    public void testRightClick() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Actions actions = new Actions(driver);
        WebElement rightButton = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
        actions.contextClick(rightButton).perform();
        driver.quit();

    }

    @Test
    public void testDoubleClick() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Actions actions = new Actions(driver);
        WebElement doubleButton = driver.findElement(By.cssSelector("[ondblclick='myFunction()']"));
        actions.doubleClick(doubleButton).perform();
        driver.quit();

    }
    //@Test
//    public void testScrollingAndClick() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().setSize(new Dimension(1366, 768));
//        driver.get("https://demo.guru99.com/test/guru99home/scrolling.html");
//        Actions actions = new Actions(driver);
//        actions.moveByOffset(150,475).clickAndHold().moveByOffset(491,475).release().perform();
//        WebElement scrollAndClick = driver.findElement(By.cssSelector(".icon-code-fork"));
//        scrollAndClick.click();
//        Assert.assertEquals(driver.getTitle(), "VBScript Tutorial for Beginner: Learn in 3 Days");
//
//    }
//
}
