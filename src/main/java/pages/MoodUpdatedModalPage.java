package pages;

import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedModalPage {

    public static final String GO_TO_MY_DIARY_BUTTON_CSS = ".ButtonMyDiary";

    public MyDiaryPage clickGoToMyDiaryButton() {
        $(GO_TO_MY_DIARY_BUTTON_CSS).click();
        return new MyDiaryPage();
    }
}