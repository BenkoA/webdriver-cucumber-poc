package utils;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Helpers {

    public static HtmlPage getCurrentPage(WebClient webClient) {
        return (HtmlPage) webClient.getCurrentWindow().getEnclosedPage();
    }
}
