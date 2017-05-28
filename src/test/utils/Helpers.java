package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

    final int DEFAULT_WAITING_TIME = 20;

    public Boolean waitForElementToDisappear(WebDriver driver, By elementLocator){
        return new WebDriverWait(driver, DEFAULT_WAITING_TIME).until(ExpectedConditions.invisibilityOfElementLocated(elementLocator));
    }

    public WebElement waitForElementToBeClickable(WebDriver driver, By elementLocator){
        return new WebDriverWait(driver, DEFAULT_WAITING_TIME).until(ExpectedConditions.elementToBeClickable(elementLocator));
    }

    public WebElement waitForElementToBeClickable(WebDriver driver, WebElement element){
        return new WebDriverWait(driver, DEFAULT_WAITING_TIME).until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitForElementToBeDisplayed(WebDriver driver, By elementLocator) {
        return new WebDriverWait(driver, DEFAULT_WAITING_TIME).until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    }

    public WebElement waitForElementToBePresent(WebDriver driver, By elementLocator) {
        return new WebDriverWait(driver, DEFAULT_WAITING_TIME).until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }
}
