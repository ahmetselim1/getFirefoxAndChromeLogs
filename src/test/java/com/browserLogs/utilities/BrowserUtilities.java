package com.fashionette.utilities;

import com.fashionette.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Map;

public class BrowserUtilities extends BasePage {




    public static WebElement waitToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 15);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void acceptCookies() throws InterruptedException {
        WebElement shadowHost = Driver.get().findElement(By.cssSelector("#usercentrics-root"));
        Object shadowRoot = ((JavascriptExecutor) Driver.get()).executeScript("return arguments[0].shadowRoot", shadowHost);
        String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");
        RemoteWebElement shadowRootElement = new RemoteWebElement();
        shadowRootElement.setParent((RemoteWebDriver) Driver.get());
        shadowRootElement.setId(id);
        WebElement acceptCookiesButton = shadowRootElement.findElement(By.cssSelector("button[data-testid='uc-accept-all-button']"));
        //waitToBeClickable(acceptCookiesButton);
        Thread.sleep(2000);
        acceptCookiesButton.click();
    }
}
