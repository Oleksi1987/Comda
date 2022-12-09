package pages.cart_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.PromoCode.CORRECT_PROMO_CODE;
import static constants.Constant.PromoCode.INCORRECT_PROMO_CODE;

public class CartPage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor)driver;
    public CartPage(WebDriver driver) {
        super(driver);
    }
    private final By DiscountCodeField = By.xpath("//div[@class = 'discount']//input[@class = 'input-text']");
    public CartPage insertCorrectPromoCode() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(DiscountCodeField).sendKeys(CORRECT_PROMO_CODE);
        return this;
    }
    public CartPage insertIncorrectCorrectPromoCode() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(DiscountCodeField).sendKeys(INCORRECT_PROMO_CODE);
        return this;
    }
    private final By ApplyCodeField = By.xpath("//div[@class = 'button-wrapper']//button[@class = 'button2']");
    public CartPage clickApplyCodeButton() {
        driver.findElement(ApplyCodeField).click();
        return this;
    }
}
