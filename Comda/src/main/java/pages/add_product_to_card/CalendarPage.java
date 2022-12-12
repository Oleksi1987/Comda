package pages.add_product_to_card;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Quantity.DEFAULT_QTY;
import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class CalendarPage extends BasePage {
    JavascriptExecutor js = (JavascriptExecutor)driver;
    public CalendarPage(WebDriver driver) {
        super(driver);

    }
    private final By QTYField = By.xpath("//li[@class = 'item last calendar quick123499']//input[@class = 'input-text qty']");
    public CalendarPage insertQTY() {
        js.executeScript("scrollBy(0, 700)");
        driver.findElement(QTYField).clear();
        driver.findElement(QTYField).sendKeys("1");
        return this;
    }
    private final By QTYPlusSelector = By.xpath("//li[@class = 'item last calendar quick123499']//span[@class = 'plus-qty']");
    public CalendarPage clickPlusQTYButton() {
        driver.findElement(QTYPlusSelector).click();
        return this;
    }
    private final By AddToBundle = By.xpath("//li[@class = 'item last calendar quick123499']//button[@class = 'add-to-pack button']");
    public CalendarPage clickAddToBundleButton() {
        driver.findElement(AddToBundle).click();
        return this;
    }
    private final By CustomizeYourCalendars = By.xpath("//div[@class = 'left']//button[@class = 'button customize blue']");
    public CalendarPage clickCustomizeYourCalendarsButton() {
        driver.findElement(CustomizeYourCalendars).click();
        return this;
    }

}
