package com.fashionette.tests;

import com.fashionette.pages.BasePage;
import com.fashionette.utilities.BrowserUtilities;
import com.fashionette.utilities.ConfigurationReader;
import com.fashionette.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Map;

public class Scenerio_01 extends TestBase {

    BasePage basePage = new BasePage();
    @Test
    public void scenerio1() throws InterruptedException {


        String title = driver.getTitle();
        System.out.println("title = " + title);
        Thread.sleep(1000);
        WebElement getOwnPropertyNames = driver.findElement(By.id("chromeLog"));
        WebElement getGlobalObjects = driver.findElement(By.id("globalLog"));
        String getOwnProp =  getOwnPropertyNames.getText();
        String getGlobal = getGlobalObjects.getText();


        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("selenium-firefox-headless-getOwnProp.txt"), "utf-8"));
            writer.write(getOwnProp);
        } catch (IOException ex) {
            // Report
        } finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }

        writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("selenium-firefox-headless-getGlobal.txt"), "utf-8"));
            writer.write(getGlobal);
        } catch (IOException ex) {
            // Report
        } finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }


    }
}
