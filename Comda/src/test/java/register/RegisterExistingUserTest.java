package register;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.COMDA_HOME_PAGE;

public class RegisterExistingUserTest extends BaseTest {
    @Test
    public void clickOnRegisterButton() {
        basePage
                .open(COMDA_HOME_PAGE);
        comdaHomePage
                .clickOnRegisterLink()
                .clickOnCookiesButton();
        registerPage
                .enterFirstName()
                .enterLastName()
                .enterExistingEmailAddress()
                .enterPassword()
                .enterConfirmPassword()
                .clickRegisterButton();

    }
}
