package tests.base;

import common.CommonAction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.add_product_to_card.ApparelPage;
import pages.add_product_to_card.CalendarPage;
import pages.add_product_to_card.MorePage;
import pages.add_product_to_card.WritingInstrumentsPage;
import pages.base.BasePage;
import pages.cart_page.CartPage;
import pages.comda_home_page.ComdaHomePage;
import pages.login_page.LoginPage;
import pages.my_account_page.AccountDashboardPage;
import pages.product_customization_page.ApparelCustomizingPage;
import pages.product_customization_page.CalendarCustomizationPage;
import pages.product_customization_page.MoreCustomizationPage;
import pages.product_customization_page.WritingInstrumentsCustomizingPage;
import pages.register_page.RegisterPage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {

    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected ComdaHomePage comdaHomePage = new ComdaHomePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected RegisterPage registerPage = new RegisterPage(driver);
    protected CalendarPage calendarPage = new CalendarPage(driver);
    protected CalendarCustomizationPage calendarCustomizationPage = new CalendarCustomizationPage(driver);
    protected ApparelPage apparelPage = new ApparelPage(driver);
    protected ApparelCustomizingPage apparelCustomizingPage = new ApparelCustomizingPage(driver);
    protected WritingInstrumentsPage writingInstrumentsPage = new WritingInstrumentsPage(driver);
    protected WritingInstrumentsCustomizingPage writingInstrumentsCustomizingPage = new WritingInstrumentsCustomizingPage(driver);
    protected MorePage morePage = new MorePage(driver);
    protected MoreCustomizationPage moreCustomizationPage = new MoreCustomizationPage(driver);
    protected CartPage cartPage = new CartPage(driver);
    protected AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);


    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }

    }
    @AfterSuite(alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

}
