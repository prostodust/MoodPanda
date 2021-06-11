package pages;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MyDiaryPage {

    public static final String RATE_BUTTON_CSS = ".badge.pull-right";
    public static final String DESCRIPTION_FIELD_CSS = ".MoodPostItem";

    public String getTextLastRate() {
        return $$(RATE_BUTTON_CSS).get(0).getText();
    }

    public String getTextLastMoodDescription() {
        return $$(DESCRIPTION_FIELD_CSS).get(0).getText();
    }

    public MyDiaryPage waitForRateButtonVisible() {
        $(RATE_BUTTON_CSS).shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }
}