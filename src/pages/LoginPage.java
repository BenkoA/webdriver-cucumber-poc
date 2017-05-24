package pages;

import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import utils.Helpers;

import java.io.IOException;


public class LoginPage extends AbstractPage {

    private String loginFormLocator = "loginForm";
    private String usernameField = "login";
    private String passwordField = "password";

    private HtmlPage currentPage;

    public LoginPage(WebClient webClient) {
        setWebClient(webClient);
    }

    public void doLogin(String name, String password) {
        currentPage = Helpers.getCurrentPage(webClient);

        final HtmlForm form = currentPage.getHtmlElementById(loginFormLocator);
        form.getInputByName(usernameField).setValueAttribute(name);
        form.getInputByName(passwordField).setValueAttribute(password);

        final List<HtmlInput> submitButton = form.getInputByValue("Log in");

        try {
             submitButton.get(0).click();
        } catch (IOException e) {
            e.getMessage();
        }
    }

}