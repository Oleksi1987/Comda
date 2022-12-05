package pages.product_customization_page;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

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

}
