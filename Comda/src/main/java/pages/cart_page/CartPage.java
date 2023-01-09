package pages.cart_page;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.add_product_to_card.MorePage;
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
    private final By message = By.xpath("//span[contains (text(), ' is not valid.')]");
    public CartPage checkErrorMessage() {
        String Message = driver.findElement(message).getText();
        Assert.isTrue(true, " is not valid.");
        return this;
    }
    private final By successMessage = By.xpath("//span[contains (text(), 'was applied.')]");
    public CartPage checkSuccessMessage() {
        String Message = driver.findElement(successMessage).getText();
        Assert.isTrue(true, "was applied.");
        return this;
    }
}
