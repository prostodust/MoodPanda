package pages;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class FeedPage {

    public static final String UPDATE_MOOD_BUTTON_CSS = "#LinkUpdate";

    public RateYourHappinessModalPage clickOnUpdateMoodButton() {
        $(UPDATE_MOOD_BUTTON_CSS).click();
        return new RateYourHappinessModalPage();
    }

    public String getTextUpdateMoodButton() {
        return $(UPDATE_MOOD_BUTTON_CSS).getText();
    }

    public FeedPage waitForMoodButtonVisible() {
        $(UPDATE_MOOD_BUTTON_CSS).shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }

}
