package pages.add_product_to_card;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MorePage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor)driver;
    public MorePage(WebDriver driver) {
        super(driver);
    }
    private final By BeginCustomizingFieldMore = By.xpath("//li[@class = 'item last quick107217']//a[contains(text(), 'Begin Customizing')]");
    public MorePage clickButtonBeginCustomize() {
        js.executeScript("scrollBy(0, 400)");
        driver.findElement(BeginCustomizingFieldMore).click();
        return this;
    }
}
