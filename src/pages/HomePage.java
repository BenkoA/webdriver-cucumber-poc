package pages;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSpan;
import utils.Helpers;

import java.io.IOException;
import java.util.List;

public class HomePage extends AbstractPage {

    private String loginButtonLocator = "//div[@class='user-section']//span[contains(text(),'Log in')]";
    private String userInfoSectionLocator = "//span[@class='user-info']/span";
    private HtmlPage currentPage;

    public HomePage(WebClient webClient) {
        setWebClient(webClient);
    }

    public Page clickOnLoginButton() {
        currentPage = Helpers.getCurrentPage(webClient);
        final List<HtmlSpan> loginButton = currentPage.getByXPath(loginButtonLocator);
        try {
            return loginButton.get(0).click();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getUsernameFromHeader() {
        currentPage = Helpers.getCurrentPage(webClient);
        final List<HtmlSpan> userinfoSection = currentPage.getByXPath(userInfoSectionLocator);
        return userinfoSection.get(0).getNodeValue();
    }
}