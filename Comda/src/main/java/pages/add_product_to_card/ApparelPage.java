package pages.add_product_to_card;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ApparelPage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor)driver;
    public ApparelPage(WebDriver driver) {
        super(driver);

    }
    private final By BeginCustomizingField = By.xpath("//li[@class = 'item last quick126479']//a[@class = 'begin_customizing_btn']");
    public ApparelPage clickButtonBeginCustomize() {
        js.executeScript("scrollBy(0, 400)");
        driver.findElement(BeginCustomizingField).click();
        return this;
    }

}
