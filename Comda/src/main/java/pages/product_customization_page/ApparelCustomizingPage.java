package pages.product_customization_page;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.add_product_to_card.ApparelPage;
import pages.base.BasePage;

import static constants.Constant.Message.MESSAGE;

public class ApparelCustomizingPage extends BasePage {
    JavascriptExecutor js = (JavascriptExecutor)driver;
    public ApparelCustomizingPage(WebDriver driver) {
        super(driver);
    }
    private final By NextStepButton = By.xpath("//div[@class = 'item']//li[@class = 'prev_next_step_tabs_item next_step']");
    public ApparelCustomizingPage clickNextStepButton() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(NextStepButton).click();
        return this;
    }
    private final By QtySelectorS = By.xpath("//div[@id = 'option-126478-1432-1427']//span[@class = 'plus-qty']");
    public ApparelCustomizingPage clickPlusQtyS() {
        js.executeScript("scrollBy(0, 100)");
        driver.findElement(QtySelectorS).click();
        return this;
    }
    private final By QtySelectorM = By.xpath("//div[@id = 'option-126478-1432-1426']//span[@class = 'plus-qty']");
    public ApparelCustomizingPage clickPlusQtyM() {
        driver.findElement(QtySelectorM).click();
        return this;
    }
    private final By QtySelectorL = By.xpath("//div[@id = 'option-126478-1432-1425']//span[@class = 'plus-qty']");
    public ApparelCustomizingPage clickPlusQtyL() {
        driver.findElement(QtySelectorL).click();
        return this;
    }
    private final By QtySelectorXL = By.xpath("//div[@id = 'option-126478-1432-1428']//span[@class = 'plus-qty']");
    public ApparelCustomizingPage clickPlusQtyXL() {
        driver.findElement(QtySelectorXL).click();
        return this;
    }
    private final By QtySelector2XL = By.xpath("//div[@id = 'option-126478-1432-1434']//span[@class = 'plus-qty']");
    public ApparelCustomizingPage clickPlusQty2XL() {
        driver.findElement(QtySelector2XL).click();
        return this;
    }
    private final By QtySelector3XL = By.xpath("//div[@id = 'option-126478-1432-61']//span[@class = 'plus-qty']");
    public ApparelCustomizingPage clickPlusQty3XL() {
        driver.findElement(QtySelector3XL).click();
        return this;
    }
    private final By NextStep = By.xpath("//a[@class = 'item-name prev_next_step_tabs__link go_to_step_3']");
    public ApparelCustomizingPage clickNextStepButtonStep2() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(NextStep).click();
        return this;
    }
    private final By StartNewImprint = By.xpath("//div[@class = 'step_3_body_type_list']//a[contains (text(), 'Start New Imprint')]");
    public ApparelCustomizingPage clickStartNewImprintButton() {
        driver.findElement(StartNewImprint).click();
        return this;
    }
    private final By TextAndImageOption = By.xpath("//ul[@class = 'tabs__list designTabs__list_new']//a[contains(text(), 'Text & Image')]");
    public ApparelCustomizingPage clickTextAndImageOption() {
        driver.findElement(TextAndImageOption).click();
        return this;
    }
    private final By ColorOptionStep1 = By.xpath("//div[@class = 'grouped-option color-input color-input-1 imprint-line active']//div[@class = 'swatch-selection-wrapper small']");
    public ApparelCustomizingPage clickColourStep1Option() {
        driver.findElement(ColorOptionStep1).click();
        return this;
    }
    private final By ChoseColorStep1 = By.cssSelector("[data-select-value='2986343']");
    public ApparelCustomizingPage choseBlackColorOption() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(ChoseColorStep1).click();
        return this;
    }
    private final By InsertMessageStep1 = By.xpath("//div[@class = 'grouped-option imprint-line-input imprint-line-1 imprint-line full-width active']//input[@id = 'super_options_126478_656131']");
    public ApparelCustomizingPage insertMessageLine1() {
        driver.findElement(InsertMessageStep1).sendKeys(MESSAGE);
        return this;
    }
    private final By ChoseFile = By.xpath("//div[@class = 'div_step_item_3 div_step_warp']//div[@class = 'input-box']//input[@class = 'product-custom-option product-custom-option-126478 ']");
    public ApparelCustomizingPage uploadAnImage() {
        driver.findElement(ChoseFile).sendKeys("D:\\Comda\\Comda\\src\\main\\resources\\photo_5408991300897849748_y.jpg");
        return this;
    }
    private final By ImageColor = By.xpath("//div[@class = 'grouped-option color-input color-input-6 imprint-line active']//div[@class = 'swatch-selection']");
    public ApparelCustomizingPage clickColourStep2Option() {
        driver.findElement(ImageColor).click();
        return this;
    }
    private final By ChoseColorStep2 = By.cssSelector("[data-select-value='2986415']");
    public ApparelCustomizingPage choseBrownColorOption() {
        driver.findElement(ChoseColorStep2).click();
        return this;
    }
    private final By AddToCart = By.xpath("//div[@class = 'add-to-box']//div[@id = 'btn-add-to-cart']//span[contains (text(), 'Add to Cart')]");
    public ApparelCustomizingPage clickOnButtonAddToCart() {
        js.executeScript("scrollBy(0, 350)");
        driver.findElement(AddToCart).click();
        return this;
    }


}
