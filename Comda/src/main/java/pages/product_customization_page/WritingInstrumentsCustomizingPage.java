package pages.product_customization_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Image.IMAGE;
import static constants.Constant.Message.MESSAGE;

public class WritingInstrumentsCustomizingPage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor)driver;
    public WritingInstrumentsCustomizingPage(WebDriver driver) {
        super(driver);
    }
    private final By NextStepButton = By.xpath("//div[@class = 'item']//li[@class = 'prev_next_step_tabs_item next_step']");
    public WritingInstrumentsCustomizingPage clickNextStepButton() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(NextStepButton).click();
        return this;
    }
    private final By QtySelector = By.xpath("//div[@class = 'add-to-cart']//span[@class = 'plus-qty']");
    public WritingInstrumentsCustomizingPage clickPlusQty() {
        js.executeScript("scrollBy(0, 150)");
        driver.findElement(QtySelector).click();
        return this;
    }
    private final By NextStep = By.xpath("//a[@class = 'item-name prev_next_step_tabs__link go_to_step_3']");
    public WritingInstrumentsCustomizingPage clickNextStepButtonStep2() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(NextStep).click();
        return this;
    }
    private final By StartNewImprint = By.xpath("//div[@class = 'step_3_body_type_list']//a[contains(text(), 'Start New Imprint')]");
    public WritingInstrumentsCustomizingPage clickStartNewImprintButton() {
        driver.findElement(StartNewImprint).click();
        return this;
    }
    private final By TextAndImageOption = By.cssSelector("[class = 'designTabs__link text_and_image']");
    public WritingInstrumentsCustomizingPage clickTextAndImageOption() {
        driver.findElement(TextAndImageOption).click();
        return this;
    }
    private final By ColorOptionStep1 = By.xpath("//div[@class = 'grouped-option color-input color-input-1 imprint-line active']//div[@class = 'swatch-selection-wrapper small']");
    public WritingInstrumentsCustomizingPage clickColourStep1Option() {
        driver.findElement(ColorOptionStep1).click();
        return this;
    }
    private final By ChoseColorStep1 = By.cssSelector("[data-select-value='3085867']");
    public WritingInstrumentsCustomizingPage choseGoldColorOption() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(ChoseColorStep1).click();
        return this;
    }
    private final By InsertMessageStep1 = By.cssSelector("[id = 'super_options_123106_688234']");
    public WritingInstrumentsCustomizingPage insertMessageLine1() {
        driver.findElement(InsertMessageStep1).sendKeys(MESSAGE);
        return this;
    }
    private final By ChoseFile = By.cssSelector("[name = 'super-options_123106-688243_file']");
    public WritingInstrumentsCustomizingPage uploadAnImage() {
        driver.findElement(ChoseFile).sendKeys(IMAGE);
        return this;
    }
    private final By ImageColor = By.xpath("//div[@class = 'grouped-option color-input color-input-4 imprint-line inactive']//div[@class = 'swatch-selection']");
    public WritingInstrumentsCustomizingPage clickColourStep2Option() {
        driver.findElement(ImageColor).click();
        return this;
    }
    private final By ChoseColorStep2 = By.cssSelector("[data-select-value='3085912']");
    public WritingInstrumentsCustomizingPage choseBurgundyColorOption() {
        driver.findElement(ChoseColorStep2).click();
        return this;
    }
    private final By AddToCart = By.xpath("//div[@class = 'add-to-box']//div[@id = 'btn-add-to-cart']//span[contains (text(), 'Add to Cart')]");
    public WritingInstrumentsCustomizingPage clickOnButtonAddToCart() {
        js.executeScript("scrollBy(0, 350)");
        driver.findElement(AddToCart).click();
        return this;
    }
}
