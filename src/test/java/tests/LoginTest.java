package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest implements ITestConstants {

    @Test(description = "Authentication on the login page")
    public void loginTest() {
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .waitForMoodButtonVisible();
        Assert.assertEquals(feedPage.getTextUpdateMoodButton(), "  Update mood");
    }

}
