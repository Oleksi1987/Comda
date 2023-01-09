package login_to_website;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.COMDA_HOME_PAGE;

public class LoginToWebsiteCorrectCredentialsTest extends BaseTest {

@Test
    public void clickOnButtonLogin() {
        basePage
                .open(COMDA_HOME_PAGE);
        comdaHomePage
                .clickOnLogin()
                .clickOnCookiesButton();
        loginPage
                .checkTitle()
                .enterLogin()
                .enterPassword()
                .clickButtonLogin();
        accountDashboardPage
                .checkSuccessMessageForLogin();
    }

}
