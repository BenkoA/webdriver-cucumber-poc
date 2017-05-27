package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Helpers;

public class HomePage extends AbstractPage {

    private By closePromoWindowLocator = By.cssSelector(".close-modal.noselect");
    private By modalOverlayLayerLocator = By.cssSelector(".modal-overlay");
    private By loginButtonLocator = By.cssSelector(".login-button.nav-button");
    private By userInfoSectionLocator = By.xpath("//span[@class='user-info']/span");
    private Helpers helpers = new Helpers();

    public HomePage(WebDriver driver) {
      super(driver);
    }

    public void closePromoPopupWindow() {
        driver.findElement(closePromoWindowLocator).click();
        helpers.waitForElementToDisappear(driver, closePromoWindowLocator);
        helpers.waitForElementToDisappear(driver, modalOverlayLayerLocator);
    }

    public void clickOnLoginButton() {
        helpers.waitForElementToBePresent(driver, loginButtonLocator);
        helpers.waitForElementToBeClickable(driver, loginButtonLocator);
        driver.findElement(loginButtonLocator).click();
    }

    public String getUsernameFromHeader() {
        helpers.waitForElementToBeDisplayed(driver, userInfoSectionLocator);
        return driver.findElement(userInfoSectionLocator).getText();
    }
}