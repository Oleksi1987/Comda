package pages.comda_home_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ComdaHomePage extends BasePage {

    public ComdaHomePage(WebDriver driver) {
        super(driver);
    }

    private final By Login = By.xpath("//a[text()='Log In']");
    private final By Cookies = By.xpath("//a[@class = 'cc-btn cc-dismiss']");
    private final By Register = By.xpath("//li[@class = 'register-link']");
    private final By PromotionalCalendars = By.xpath("//div[@class = 'skip-content row']//li[@class = 'level0 nav-2 parent']");
    private final By ApparelAndTshirts = By.xpath("//div[@class = 'skip-content row']//li[@class = 'level0 nav-4 parent']");
    private final By WritingInstruments = By.xpath("//div[@class = 'skip-content row']//li[@class = 'level0 nav-3 parent']");
    private final By More = By.xpath("//div[@class = 'skip-content row']//li[@class = 'level0 nav-13 parent']");

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
    public ComdaHomePage clickOnApparelAndTshirtsIcon() {
        driver.findElement(ApparelAndTshirts).click();
        return this;
    }
    public ComdaHomePage clickOnWritingInstrumentsIcon() {
        driver.findElement(WritingInstruments).click();
        return this;
    }
    public ComdaHomePage clickOnMoreIcon() {
        driver.findElement(More).click();
        return this;
    }
}
