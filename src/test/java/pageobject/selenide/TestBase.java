package pageobject.selenide;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    private final String baseUrl = "https://litecart.stqa.ru/en/";

    @BeforeMethod
    public void methodSetup() {
        String browser = System.getProperty("browser", "chrome");
        String platform = System.getProperty("os", "mac");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(browser);

        switch(platform) {
            case "win" -> caps.setPlatform(Platform.WINDOWS);
            case "linux" -> caps.setPlatform(Platform.LINUX);
            case "mac" -> caps.setPlatform(Platform.MAC);
        }

        Configuration.remote = "http://192.168.249.1:4444/wd/hub";
        Configuration.browserCapabilities = caps;
        Configuration.browser = browser;
        Configuration.browserSize = "1366 x 768";
        open(baseUrl);
        Configuration.pageLoadTimeout = 5000;

    }

    @AfterMethod
    public void metodTearDown(){
        closeWindow();
    }

}
