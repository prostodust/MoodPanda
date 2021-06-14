package pages;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class RateYourHappinessModalPage {

    public static final String SLIDER_CSS = ".ui-slider-handle";
    public static final String UPDATE_MOOD_BUTTON_CSS = ".ButtonUpdate";
    public static final String CANCEL_BUTTON_CSS = ".btn-default.pull-left";
    public static final String DESCRIPTION_FIELD_CSS = "#TextBoxUpdateMoodTag";

    public RateYourHappinessModalPage updateMood(int moodValue) {
        $(SLIDER_CSS).click();
        int defaultMoodValue = 5;
        Keys direction = null;
        if (moodValue > defaultMoodValue) {
            direction = Keys.ARROW_RIGHT;
        } else if (moodValue < defaultMoodValue) {
            direction = Keys.ARROW_LEFT;
        }
        if (moodValue != defaultMoodValue) {
            for (int i = 0; i < Math.abs(moodValue - defaultMoodValue); i++) {
                $(SLIDER_CSS).sendKeys(direction);
            }
        }
        return this;
    }

    public MoodUpdatedModalPage clickOnUpdateMoodButton() {
        $(UPDATE_MOOD_BUTTON_CSS).click();
        return new MoodUpdatedModalPage();
    }

    public RateYourHappinessModalPage enterMoodDescription(String description) {
        $(DESCRIPTION_FIELD_CSS).sendKeys(description);
        return this;
    }

    public void clickOnCancelButton() {
        $(CANCEL_BUTTON_CSS).click();
    }
}
