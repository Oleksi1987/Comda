package pages.login_page;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Passwords.CORRECT_PASSWORD;
import static constants.Constant.Passwords.INCORRECT_PASSWORD;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By message = By.xpath("//div[@class='page-title']");

    public LoginPage checkTitle() {
        String checkMessage = driver.findElement(message).getAccessibleName();
        Assert.isTrue(true, "Login or Create an Account");
        return this;
    }
    private final By LoginField = By.id("email");

    public LoginPage enterLogin() {
        driver.findElement(LoginField).sendKeys("yashchuk.o@softhousegroup.com");
        return this;
    }
    private final By PasswordField = By.id("pass");
    public LoginPage enterPassword() {
        driver.findElement(PasswordField).sendKeys(CORRECT_PASSWORD);
        return this;
    }
    public LoginPage enterIncorrectPassword() {
        driver.findElement(PasswordField).sendKeys(INCORRECT_PASSWORD);
        return this;
    }
    private final By LoginButton = By.id("send2");
    public LoginPage clickButtonLogin() {
        driver.findElement(LoginButton).click();
        return this;
    }

}
