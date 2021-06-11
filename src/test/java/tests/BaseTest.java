package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import steps.LoginAndSetMoodStep;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    FeedPage feedPage;
    LoginPage loginPage;
    MoodUpdatedModalPage moodUpdatedModalPage;
    MyDiaryPage myDiaryPage;
    RateYourHappinessModalPage rateYourHappinessModalPage;
    LoginAndSetMoodStep loginAndSetMood;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 15000;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
        feedPage = new FeedPage();
        loginPage = new LoginPage();
        moodUpdatedModalPage = new MoodUpdatedModalPage();
        myDiaryPage = new MyDiaryPage();
        rateYourHappinessModalPage = new RateYourHappinessModalPage();
        loginAndSetMood = new LoginAndSetMoodStep();
    }

    @AfterMethod
    public void closeBrowser() {
        getWebDriver().quit();
    }
}
