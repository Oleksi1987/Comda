package pages.comda_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ComdaHomePage extends BasePage {

    public ComdaHomePage clickOnRegisterButton;

    public ComdaHomePage(WebDriver driver) {
        super(driver);

            }
    private final By Login = By.xpath("//a[text()='Log In']");
    private final By Cookies = By.xpath("//a[@class = 'cc-btn cc-dismiss']");
    private final By Register = By.xpath("//li[@class = 'register-link']");
    private final By PromotionalCalendars = By.xpath("//div[@class = 'skip-content row']//*[@class = 'level0 nav-2 parent']");

    public ComdaHomePage clickOnLogin() {
        driver.findElement(Login).click();
        return this;
            }

    public ComdaHomePage clickOnCookiesButton() {
        driver.findElement(Cookies).click();
        return this;
    }
    public ComdaHomePage clickOnRegisterLink() {
        driver.findElement(Register).click();
        return this;
    }
    public ComdaHomePage clickOnPromotionalCalendarIcon() {
        driver.findElement(PromotionalCalendars).click();
        return this;
    }
}
