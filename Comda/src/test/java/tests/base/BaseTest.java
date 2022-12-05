package tests.base;

import common.CommonAction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.add_product_to_card.CalendarPage;
import pages.base.BasePage;
import pages.comda_home.ComdaHomePage;
import pages.login_page.LoginPage;
import pages.product_customization_page.CalendarCustomizationPage;
import pages.register_page.RegisterPage;

import javax.swing.*;

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
