package com.github.e999or.lesson16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import javax.security.auth.login.Configuration;

public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);
    private WebDriver webDriver;

    @BeforeClass
    public void beforeTestClass() {
        LOG.info("Before class ComplexTest");
    }

    @AfterClass
    public void afterxTestClass() {
        LOG.info("After class ComplexTest");
    }

    @BeforeMethod
    public void beforeTestMethod() {
        WebDriverManager.chromedriver().setup();
       // Configuration.browser = “chrome” ;
        webDriver = new ChromeDriver();
        LOG.info("Before ComplexTest method");
    }

    @AfterMethod
    public void afterTestMethod() {
        LOG.info("After Test method");
    }

    @Test
    public void simpleTest() {
        LOG.info("Simple test");
        webDriver.get("https://savkk.github.io/selenium-practice/");
        WebElement buttonButton = webDriver.findElement(By.id("button"));
        buttonButton.click();
        WebElement buttonFirstClikMe = webDriver.findElement(By.id("first"));

        webDriver.quit();
    }

}
