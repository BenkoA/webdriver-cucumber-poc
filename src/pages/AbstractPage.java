package pages;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

public class AbstractPage {
    protected WebClient webClient;

    public void AbstractPage() {
        // turn off htmlunit warnings
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);

        webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        this.setWebClient(webClient);
    }

    public void setWebClient(WebClient webClient) {
        this.webClient = webClient;
    }

}