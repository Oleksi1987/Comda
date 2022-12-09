package pages.product_customization_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.add_product_to_card.WritingInstrumentsPage;
import pages.base.BasePage;

import static constants.Constant.Message.MESSAGE2;

public class MoreCustomizationPage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor)driver;
    public MoreCustomizationPage(WebDriver driver) {
        super(driver);
    }
    private final By NextStepButton = By.xpath("//div[@class = 'item']//li[@class = 'prev_next_step_tabs_item next_step']");
    public MoreCustomizationPage clickNextStepButton() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(NextStepButton).click();
        return this;
    }
    private final By QtySelector = By.xpath("//div[@class = 'add-to-cart']//span[@class = 'plus-qty']");
    public MoreCustomizationPage clickPlusQty() {
        js.executeScript("scrollBy(0, 150)");
        driver.findElement(QtySelector).click();
        return this;
    }
    private final By NextStep = By.xpath("//a[@class = 'item-name prev_next_step_tabs__link go_to_step_3']");
    public MoreCustomizationPage clickNextStepButtonStep2() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(NextStep).click();
        return this;
    }
    private final By StartNewImprint = By.xpath("//div[@class = 'step_3_body_type_list']//a[contains(text(), 'Send Us Your Artwork After Ordering')]");
    public MoreCustomizationPage clickSendUsYourArtworkButton() {
        driver.findElement(StartNewImprint).click();
        return this;
    }
    private final By SpecialInstructions = By.cssSelector("[name='super_options[107209][648688]']");
    public MoreCustomizationPage enterSpecialInstructions() {
        driver.findElement(SpecialInstructions).sendKeys(MESSAGE2);
        return this;
    }
    private final By AddToCart = By.xpath("//div[@class = 'add-to-box']//div[@id = 'btn-add-to-cart']//span[contains (text(), 'Add to Cart')]");
    public MoreCustomizationPage clickOnButtonAddToCart() {
        js.executeScript("scrollBy(0, 350)");
        driver.findElement(AddToCart).click();
        return this;
    }
    private final By Cart = By.xpath("//div[@class = 'inner-wrapper']//a[contains (text(), 'View Cart & Check Out')]");
    public MoreCustomizationPage clickCartButton() {
        driver.findElement(Cart).click();
        return this;
    }

}
