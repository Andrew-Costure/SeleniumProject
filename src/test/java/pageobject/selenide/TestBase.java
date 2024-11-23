package pageobject.selenide;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    private final String baseUrl = "https://litecart.stqa.ru/en/";

    @BeforeMethod
    public void methodSetup() {
        String browser = System.getProperty("browser", "chrome");
        Configuration.browser = browser;
        Configuration.browserSize = "1366 x 768";
        open(baseUrl);
        Configuration.pageLoadTimeout = 5000;

    }

}
