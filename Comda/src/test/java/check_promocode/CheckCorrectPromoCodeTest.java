package check_promocode;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.COMDA_HOME_PAGE;

public class CheckCorrectPromoCodeTest extends BaseTest {

    @Test
    public void morePage() throws InterruptedException {
        basePage
                .open(COMDA_HOME_PAGE);
        comdaHomePage
                .clickOnCookiesButton()
                .clickOnMoreIcon();
        morePage
                .clickButtonBeginCustomize();
        moreCustomizationPage
                .clickNextStepButton()
                .clickPlusQty()
                .clickNextStepButtonStep2()
                .clickSendUsYourArtworkButton()
                .enterSpecialInstructions()
                .clickOnButtonAddToCart()
                .clickCartButton();
        cartPage
                .insertCorrectPromoCode()
                .clickApplyCodeButton()
                .checkSuccessMessage();
    }
}
