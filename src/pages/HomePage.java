package pages;

import org.openqa.selenium.By;

public class HomePage extends AbstractPage {

    private By loginButtonLocator = By.cssSelector(".login-button.nav-button");
    private String userInfoSectionLocator = "//span[@class='user-info']/span";

    public HomePage() {
      setDriver(driver);
    }

    public void clickOnLoginButton() {
        driver.findElement(loginButtonLocator).click();
    }

    public String getUsernameFromHeader() {
        return driver.findElement(By.xpath(userInfoSectionLocator)).getText();
    }
}