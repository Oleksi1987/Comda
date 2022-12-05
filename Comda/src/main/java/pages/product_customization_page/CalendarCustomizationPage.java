package pages.product_customization_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Image.IMAGE;
import static constants.Constant.Message.MESSAGE;

public class CalendarCustomizationPage extends BasePage {
    public CalendarCustomizationPage(WebDriver driver) {
        super(driver);
    }
    private final By HideBundleButton = By.xpath("//div[@class = 'top c-pdy--20']//a[contains(text(), 'Click here')]");
    public CalendarCustomizationPage clickHideBundleButton() {
        driver.findElement(HideBundleButton).click();
        return this;
    }
    private final By NextStepButton = By.xpath("//div[@class = 'item']//li[@class = 'prev_next_step_tabs_item next_step']");
    public CalendarCustomizationPage clickNextStepButton() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(NextStepButton).click();
        return this;
    }
    private final By StartNewImprint = By.xpath("//div[@class = 'step_3_body_type_list']//a[contains (text(), 'Start New Imprint')]");
    public CalendarCustomizationPage clickStartNewImprintButton() {
        driver.findElement(StartNewImprint).click();
        return this;
    }
    private final By TextAndImageOption = By.xpath("//ul[@class = 'tabs__list designTabs__list_new']//a[contains(text(), 'Text & Image')]");
    public CalendarCustomizationPage clickTextAndImageOption() {
        driver.findElement(TextAndImageOption).click();
        return this;
    }
    private final By ColorOptionStep1 = By.xpath("//div[@class = 'grouped-option color-input color-input-1 imprint-line active']//div[@class = 'swatch-selection-wrapper small']");
    public CalendarCustomizationPage clickColourStep1Option() {
        driver.findElement(ColorOptionStep1).click();
        return this;
    }
    private final By ChoseColorStep1 = By.xpath("//div[@class = 'imprint-color-wrapper']//span[@class = 'swatch-label']['black-imprint']");
    public CalendarCustomizationPage choseBlackColorOption() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(ChoseColorStep1).click();
        return this;
    }
    private final By InsertMessageStep1 = By.xpath("//div[@class = 'grouped-option imprint-line-input imprint-line-1 imprint-line full-width active']//input[@class = 'product-custom-option product-custom-option-123532']");
    public CalendarCustomizationPage insertMessageLine1() {
        driver.findElement(InsertMessageStep1).sendKeys(MESSAGE);
        return this;
    }
    private final By ChoseFile = By.xpath("//div[@class = 'div_step_item_3 div_step_warp']//div[@class = 'input-box']//input[@class = 'product-custom-option product-custom-option-123532 ']");
    public CalendarCustomizationPage uploadAnImage() {
        driver.findElement(ChoseFile).sendKeys("src/main/resources/photo_5408991300897849748_y.jpg");
        return this;
    }
    private final By ImageColor = By.xpath("//div[@class = 'grouped-option color-input color-input-6 imprint-line active']//div[@class = 'swatch-selection']");
    public CalendarCustomizationPage clickColourStep2Option() {
        driver.findElement(ImageColor).click();
        return this;
    }
    private final By ChoseColorStep2 = By.xpath("//div[@class = 'imprint-color-wrapper']//li[@class = 'swatch-item option-blue-imprint is-media']//span[@class = 'swatch-label']");
    public CalendarCustomizationPage choseBlueColorOption() {
        driver.findElement(ChoseColorStep2).click();
        return this;
    }
    private final By AddToCart = By.xpath("//div[@class = 'add-to-box']//button[@class = 'button add-to-cart-button disabled'][1]");
    public CalendarCustomizationPage clickOnButtonAddToCart() {
        driver.findElement(AddToCart).click();
        return this;
    }
}
