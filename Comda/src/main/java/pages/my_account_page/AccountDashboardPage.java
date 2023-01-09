package pages.my_account_page;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.product_customization_page.ApparelCustomizingPage;

public class AccountDashboardPage extends BasePage {
    public AccountDashboardPage(WebDriver driver) {
        super(driver);
    }
    private final By message = By.xpath("//h1[contains(text(), 'My Dashboard')]");
    public AccountDashboardPage checkSuccessMessageForLogin() {
        String checkMessage = driver.findElement(message).getAccessibleName();
        Assert.isTrue(true, "My Dashboard");
        return this;
    }
    private final By messageRegistration = By.xpath("//span[contains(text(), 'Thank you for registering with Comda.')]");
    public AccountDashboardPage checkSuccessMessageForRegister() {
        String checkMessage = driver.findElement(messageRegistration).getAccessibleName();
        Assert.isTrue(true, "Thank you for registering with Comda.");
        return this;
    }
}
