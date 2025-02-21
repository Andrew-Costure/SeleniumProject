//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import java.time.Duration;
//
//public class TestWebsiteLitecart {
//    @Test
//    public void validLogin() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://litecart.stqa.ru/en/");
//        WebElement emailField = driver.findElement(By.name("email"));
//        WebElement passwordField = driver.findElement(By.name("password"));
//        emailField.sendKeys("test@gmail.com");
//        passwordField.sendKeys("1234");
//        driver.findElement(By.name("login")).click();
//        String noticeSuccess = "You are now logged in as Olya Cich.";
//        WebElement validStringWhenUserLogin = driver.findElement(By.cssSelector(".notice.success"));
//        Assert.assertEquals(validStringWhenUserLogin.getText(), noticeSuccess);
//        driver.quit();
//    }
//    @Test
//    public void invalidEmailAndCorrectPassword(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://litecart.stqa.ru/en/");
//        WebElement emailField = driver.findElement(By.name("email"));
//        WebElement passwordField = driver.findElement(By.name("password"));
//        emailField.sendKeys("test@gmail.co");
//        passwordField.sendKeys("1234");
//        driver.findElement(By.name("login")).click();
//        String noticeErrors = "Wrong password or the account is disabled, or does not exist";
//        WebElement validStringWhenUserNotLogin = driver.findElement(By.cssSelector(".notice.errors"));
//        Assert.assertEquals(validStringWhenUserNotLogin.getText(), noticeErrors);
//        driver.quit();
//    }
//
//    @Test
//    public void changeCurrencyInEuros() {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://litecart.stqa.ru/en/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
//        driver.findElement(By.className("change")).click();
//        Select dropdownCurrency = new Select(driver.findElement(By.name("currency_code")));
//        dropdownCurrency.selectByValue("EUR");
//        driver.findElement(By.name("save")).click();
//        char correctCurrency = '€';
//        WebElement cartCurrency = driver.findElement(By.className("formatted_value"));
//        Assert.assertEquals(cartCurrency.getText(), "0 " + correctCurrency);
//        driver.quit();
//    }
//
//    @Test
//    public void CartIsEmpty(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://litecart.stqa.ru/en/");
//        WebElement emailField = driver.findElement(By.cssSelector("[name=email]"));
//        WebElement passwordField = driver.findElement(By.cssSelector("[name=password]"));
//        emailField.sendKeys("test@gmail.com");
//        passwordField.sendKeys("1234");
//        driver.findElement(By.cssSelector("[name=login]")).click();
//        driver.findElement(By.id("cart")).click();
//        String massageWhenCartIsEmpty = "There are no items in your cart.";
//        WebElement stringInElementWhenCartIsEmpty = driver.findElement(By.tagName("em"));
//        Assert.assertEquals(stringInElementWhenCartIsEmpty.getText(), massageWhenCartIsEmpty);
//        driver.quit();
//
//    }
//
//    @Test
//    public void AddToCart1Duck(){
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://litecart.stqa.ru/en/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
//        driver.findElement(By.cssSelector("[title='Purple Duck']")).click();
//        WebElement addToCartButton = driver.findElement(By.name("add_cart_product"));
//        addToCartButton.click();
//        WebElement cartQuantityLabel = driver.findElement(By.cssSelector("span[class='quantity']"));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
//        wait.until(ExpectedConditions.textToBe(By.cssSelector("span[class='quantity']"), "1"));
//        Assert.assertEquals(cartQuantityLabel.getText(), "1");
//    }
