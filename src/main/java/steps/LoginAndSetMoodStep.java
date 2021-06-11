package steps;

import pages.LoginPage;

public class LoginAndSetMoodStep {
    private LoginPage loginPage;

    public LoginAndSetMoodStep() {
        loginPage = new LoginPage();
    }

    public LoginAndSetMoodStep loginAndSetMood(String login, String password) {
        loginPage
                .openPage()
                .login(login, password)
                .waitForMoodButtonVisible()
                .clickOnUpdateMoodButton();
        return this;
    }
}