package pages.add_product_to_card;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class WritingInstrumentsPage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor)driver;
    public WritingInstrumentsPage(WebDriver driver) {
        super(driver);
    }
    private final By BeginCustomizingFieldWI = By.xpath("//li[@class = 'item last quick123107']//a[contains(text(), 'Begin Customizing')]");
    public WritingInstrumentsPage clickButtonBeginCustomize() {
        js.executeScript("scrollBy(0, 400)");
        driver.findElement(BeginCustomizingFieldWI).click();
        return this;
    }

}
