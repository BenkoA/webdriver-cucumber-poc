package pages;

import org.openqa.selenium.By;


public class LoginPage extends AbstractPage {

    private String usernameField = "login";
    private String passwordField = "password";

    public LoginPage() {
        setDriver(driver);
    }

    public void doLogin(String name, String password) {
        driver.findElement(By.id(usernameField)).sendKeys(name);
        driver.findElement(By.id(passwordField)).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
    }

}