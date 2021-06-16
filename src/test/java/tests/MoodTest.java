package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodTest extends BaseTest implements ITestConstants {

    @Test(description = "Setting the mood")
    public void setMoodTest() {
        int currentRatingValue = 6;
        loginAndSetMood
                .loginAndSetMood(LOGIN, PASSWORD);
        rateYourHappinessModalPage
                .updateMood(currentRatingValue)
                .clickOnUpdateMoodButton()
                .clickGoToMyDiaryButton()
                .waitForRateButtonVisible();
        Assert.assertEquals(myDiaryPage.getTextLastRate(), String.valueOf(currentRatingValue));
    }

    @Test(description = "Canceling the mood setting")
    public void cancelSetMoodTest() {
        int currentRatingValue = 4;
        loginAndSetMood
                .loginAndSetMood(LOGIN, PASSWORD);
        rateYourHappinessModalPage
                .updateMood(currentRatingValue)
                .clickOnCancelButton();
        Assert.assertEquals(feedPage.getTextUpdateMoodButton(), "  Update mood");
    }

    @Test(description = "Enter a description of the current mood")
    public void enterMoodDescriptionTest() {
        String moodDescription = "Average between five and ten";
        loginAndSetMood
                .loginAndSetMood(LOGIN, PASSWORD);
        rateYourHappinessModalPage
                .enterMoodDescription(moodDescription)
                .clickOnUpdateMoodButton()
                .clickGoToMyDiaryButton()
                .waitForRateButtonVisible();
        Assert.assertEquals(myDiaryPage.getTextLastMoodDescription(), moodDescription);
    }
}
