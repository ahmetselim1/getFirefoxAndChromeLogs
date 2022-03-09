package com.fashionette.tests;

import com.fashionette.utilities.ConfigurationReader;
import com.fashionette.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected Actions action;
    protected WebDriverWait wait;
    protected String url;

    @BeforeMethod
    public void setUpMethod() {
        url = ConfigurationReader.get("url1");
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, 10);


        //todo I added
        Path sampleFile = Paths.get("src/test/java/com/browserLogs/client/index.html");
        url = sampleFile.toUri().toString();



        driver.get(url);
        driver.manage().window().maximize();
    }

        @AfterMethod
     public void tearDown(){
        driver.close();
        }

    }

