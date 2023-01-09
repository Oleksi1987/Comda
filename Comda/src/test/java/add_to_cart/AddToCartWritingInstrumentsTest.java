package add_to_cart;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.COMDA_HOME_PAGE;

public class AddToCartWritingInstrumentsTest extends BaseTest {

    @Test
    public void writingInstrumentsPage() {
        basePage
                .open(COMDA_HOME_PAGE);
        comdaHomePage
                .clickOnCookiesButton()
                .clickOnWritingInstrumentsIcon();
        writingInstrumentsPage
                .clickButtonBeginCustomize();
        writingInstrumentsCustomizingPage
                .clickNextStepButton()
                .clickPlusQty()
                .clickNextStepButtonStep2()
                .clickStartNewImprintButton()
                .clickTextAndImageOption()
                .clickColourStep1Option()
                .choseGoldColorOption()
                .insertMessageLine1()
                .uploadAnImage()
                .clickColourStep2Option()
                .choseBurgundyColorOption()
                .clickOnButtonAddToCart()
                .checkSuccessMessage();
    }
}
