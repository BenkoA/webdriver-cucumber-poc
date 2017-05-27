package stepDefinitions;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class LoginSteps {

    private LoginPage loginPage;
    private HomePage homepage;
    private ChromeOptions chromeOptions = new ChromeOptions();
    public WebDriver driver;

    public void setUp(){
        chromeOptions.addArguments("--kiosk");
        driver = new ChromeDriver(chromeOptions);
        loginPage = new LoginPage(driver);
        homepage = new HomePage(driver);
    }

    @Given("^I go to \"([^\"]*)\"$")
    public void I_go_to(String pageURL) throws IOException {
        this.setUp();
        driver.get(pageURL);
    }

    @Given("^I close the promo popup window$")
    public void I_close_the_promo_popup_window() {
        homepage.closePromoPopupWindow();
    }

    @When("^I click the Login button$")
    public void I_click_the_Login_button() {
        homepage.clickOnLoginButton();
    }

    @When("^I login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void I_login_with_username_and_password(String username, String password) {
        loginPage.doLogin(username, password);
    }

    @Then("^I should see the \"([^\"]*)\" name in the header$")
    public void I_should_see_the_name_in_the_header(String userData) {
        Assert.assertEquals(userData, homepage.getUsernameFromHeader());
        driver.quit();
    }

}
