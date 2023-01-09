package add_to_cart;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.COMDA_HOME_PAGE;

public class AddToCartCalendarTest extends BaseTest {

    @Test
    public void addToCartCalendar() {
        basePage
                .open(COMDA_HOME_PAGE);
        comdaHomePage
                .clickOnCookiesButton()
                .clickOnPromotionalCalendarIcon();
        calendarPage
                .insertQTY()
                .clickPlusQTYButton()
                .clickAddToBundleButton()
                .clickCustomizeYourCalendarsButton();
        calendarCustomizationPage
                .clickHideBundleButton()
                .clickNextStepButton()
                .clickStartNewImprintButton()
                .clickTextAndImageOption()
                .clickColourStep1Option()
                .choseBlackColorOption()
                .insertMessageLine1()
                .uploadAnImage()
                .clickColourStep2Option()
                .choseBlueColorOption()
                .clickOnButtonAddToCart()
                .checkSuccessMessage();
    }
}
