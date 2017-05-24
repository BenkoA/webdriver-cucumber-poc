package stepDefinitions;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Assert;
import pages.AbstractPage;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class LoginSteps extends AbstractPage{

    private LoginPage loginPage;
    private HomePage homepage;

    private WebClient webClient = new WebClient(BrowserVersion.CHROME);

    @Given("^I go to \"([^\"]*)\"$")
    public void I_go_to(String pageURL) throws IOException {
        webClient.getPage(pageURL);
    }

    @When("^I click the Login button$")
    public void I_click_the_Login_button() {
        homepage = new HomePage(webClient);
        homepage.clickOnLoginButton();
    }

    @When("^I login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void I_login_with_username_and_password(String username, String password) {
        loginPage = new LoginPage(webClient);
        loginPage.doLogin(username, password);
    }

    @Then("^I should see the \"([^\"]*)\" name in the header$")
    public void I_should_see_the_name_in_the_header(String userData) {
        Assert.assertEquals(userData, homepage.getUsernameFromHeader());
    }

}
