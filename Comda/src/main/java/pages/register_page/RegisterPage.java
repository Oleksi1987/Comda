package pages.register_page;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Emails.EMAIL_ADDRESS;
import static constants.Constant.Emails.EMAIL_ADDRESS_EXISTING;
import static constants.Constant.Passwords.PASSWORD_EXAMPLE;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
    }

    private final By FirstNameField = By.id("firstname");
    public RegisterPage enterFirstName(){
        driver.findElement(FirstNameField).sendKeys("Ivan");
        return this;
    }
    private final By LastNameField = By.id("lastname");
    public RegisterPage enterLastName() {
        driver.findElement(LastNameField).sendKeys("Salofan");
        return this;
    }
    private final By EmailExistingAddressField = By.id("email_address");
    public RegisterPage enterExistingEmailAddress() {
        driver.findElement(EmailExistingAddressField).sendKeys(EMAIL_ADDRESS_EXISTING);
        return this;
    }
    private final By EmailAddressField = By.id("email_address");
    public RegisterPage enterEmailAddress() {
        driver.findElement(EmailAddressField).sendKeys(EMAIL_ADDRESS);
        return this;
    }
    private final By PasswordField = By.id("password");
    public RegisterPage enterPassword() {
        driver.findElement(PasswordField).sendKeys(PASSWORD_EXAMPLE);
        return this;
    }
    private final By ConfirmPasswordField = By.id("confirmation");
    public RegisterPage enterConfirmPassword() {
        driver.findElement(ConfirmPasswordField).sendKeys(PASSWORD_EXAMPLE);
        return this;
    }
    private final By RegisterButton = By.xpath("//div[@class = 'buttons-set']//button[@class = 'button']");
    public RegisterPage clickRegisterButton() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 300)");
        driver.findElement(RegisterButton).click();
        return this;
    }
    private final By errorMessage = By.xpath("//span[contains(text(), 'There is already an account with this email address.')]");
    public RegisterPage checkErrorMessage() {
        String checkMessage = driver.findElement(errorMessage).getAccessibleName();
        Assert.isTrue(true, "There is already an account with this email address.");
        return this;
    }
}
