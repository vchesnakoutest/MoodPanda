package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.FeedPage;
import pages.LoginPage;
import pages.RateYourHappinessModalPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    LoginPage loginPage;
    FeedPage feedPage;
    RateYourHappinessModalPage rateYourHappinessModalPage;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 15000;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
        loginPage = new LoginPage();
        feedPage = new FeedPage();
        rateYourHappinessModalPage = new RateYourHappinessModalPage();

//        TODO: In order to use regular selenium configuration
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-pop-blocking");
//        WebDriver driver = new ChromeDriver(options);
//        setWebDriver(driver);
    }

    @AfterMethod
    public void closeBrowser() {
        getWebDriver().quit();
    }
}
