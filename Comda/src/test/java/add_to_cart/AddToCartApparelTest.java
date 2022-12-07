package add_to_cart;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.COMDA_HOME_PAGE;

public class AddToCartApparelTest extends BaseTest {

    @Test
    public void apparelCustomizingPage() {
        basePage
                .open(COMDA_HOME_PAGE);
        comdaHomePage
                .clickOnCookiesButton()
                .clickOnApparelAndTshirtsIcon();
        apparelPage
                .clickButtonBeginCustomize();
        apparelCustomizingPage
                .clickNextStepButton()
                .clickPlusQtyS()
                .clickPlusQtyS()
                .clickPlusQtyM()
                .clickPlusQtyM()
                .clickPlusQtyL()
                .clickPlusQtyL()
                .clickPlusQtyXL()
                .clickPlusQtyXL()
                .clickPlusQty2XL()
                .clickPlusQty2XL()
                .clickPlusQty3XL()
                .clickPlusQty3XL()
                .clickNextStepButtonStep2()
                .clickStartNewImprintButton()
                .clickTextAndImageOption()
                .clickColourStep1Option()
                .choseBlackColorOption()
                .insertMessageLine1()
                .uploadAnImage()
                .clickColourStep2Option()
                .choseBrownColorOption()
                .clickOnButtonAddToCart();
    }
}
