package com.github.e999or.lesson16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);
    private WebDriver webDriver;

    @BeforeClass
    public void beforeTestClass() {
        LOG.info("Before class ComplexTest");
    }

    @AfterClass
    public void afterTestClass() {
        LOG.info("After class ComplexTest");
    }

    @BeforeMethod
    public void beforeTestMethod() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        LOG.info("Before ComplexTest method");
    }

    @AfterMethod
    public void afterTestMethod() {
        LOG.info("After Test method");
    }

    @Test
    public void simpleTest() throws InterruptedException {
        LOG.info("Simple test");
        webDriver.get("https://savkk.github.io/selenium-practice/");
        WebElement buttonButton = webDriver.findElement(By.id("button"));
        buttonButton.click();
        WebElement buttonFirstClikMe = webDriver.findElement(By.id("first"));
        buttonFirstClikMe.click();
        WebElement buttonFirstClikMeToo = webDriver.findElement(By.xpath("//div/input"));
        buttonFirstClikMeToo.click();
        webDriver.findElement(By.linkText("Great! Return to menu")).click();
        webDriver.findElement(By.id("checkbox")).click();
        webDriver.findElement(By.id("one")).click();
        webDriver.findElement(By.id("two")).click();
        webDriver.findElement(By.id("three")).click();
        webDriver.findElement(By.id("go")).click();
        webDriver.findElement(By.id("radio_one")).click();
        webDriver.findElement(By.id("radio_two")).click();
        webDriver.findElement(By.id("radio_three")).click();
        webDriver.findElement(By.id("radio_go")).click();
        webDriver.findElement(By.linkText("Great! Return to menu")).click();
        webDriver.findElement(By.id("select")).click();
        WebElement select = webDriver.findElement(By.name("hero"));
        Select selectHero = new Select(select);
        selectHero.selectByVisibleText("Donald Ervin Knuth");
        WebElement selectL = webDriver.findElement(By.name("languages"));
        Select selectLanguages = new Select(selectL);
        selectLanguages.selectByVisibleText("Java");
        webDriver.findElement(By.id("go")).click();
        webDriver.findElement(By.linkText("Great! Return to menu")).click();
        webDriver.findElement(By.id("form")).click();
        webDriver.findElement(By.xpath("//label[.='First Name:']/following::input")).sendKeys("Егор");
        webDriver.findElement(By.xpath("//label[.='Last Name:']/following::input")).sendKeys("Трофимов");
        webDriver.findElement(By.cssSelector("input[type=email]")).sendKeys("e999or@bk.ru");
        webDriver.findElement(By.xpath("//label[.='Sex:']/following::input")).click();
        webDriver.findElement(By.xpath("//label[.='Address:']/following::input")).sendKeys("Москва");
        webDriver.findElement(By.xpath("//label[.='Avatar:']/following::input")).sendKeys("C:\\1\\aiteko.homework1\\tastseleniumlesson16\\src\\test\\resources\\s1200.jpg");
        webDriver.findElement(By.xpath("//label[.='Tell me something about yourself']/following::textarea")).sendKeys("Рокен-Ролл");
        webDriver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        webDriver.findElement(By.linkText("Great! Return to menu")).click();
        webDriver.findElement(By.id("iframe")).click();
        webDriver.switchTo().frame(webDriver.findElement(By.id("code-frame")));
        String [] str = webDriver.findElement(By.id("code")).getText().split(":");
        String noSpace = str[1].replaceAll(" ", "");
        webDriver.switchTo().defaultContent();
        webDriver.findElement(By.name("code")).sendKeys(noSpace);
        webDriver.findElement(By.name("ok")).click();
        webDriver.findElement(By.linkText("Great! Return to menu")).click();
        webDriver.findElement(By.id("alerts")).click();
        webDriver.findElement(By.className("get")).click();
        Alert alert = webDriver.switchTo().alert();
        String [] getPassword = alert.getText().split(":");
        String noSpacePassword = getPassword[1].replaceAll(" ", "");
        alert.accept();
        webDriver.findElement(By.className("set")).click();
        alert.sendKeys(noSpacePassword);
        alert.accept();
        webDriver.findElement(By.className("return")).click();
        alert.accept();
        webDriver.findElement(By.id("table")).click();
        webDriver.findElement(By.id("customers")).click();
        webDriver.findElement(By.xpath("//td[text()='Island Trading']/parent:: node()/td/input")).click();
        webDriver.findElement(By.xpath("//input[@value='Delete']")).click();
        webDriver.findElement(By.xpath("//label[text()='Company']/following::input")).sendKeys("Айтеко");
        webDriver.findElement(By.xpath("//label[text()='Contact']/following::input")).sendKeys("9037777");
        webDriver.findElement(By.xpath("//label[text()='Country']/following::input")).sendKeys("Россия");
        webDriver.findElement(By.xpath("//input[@value='Add']")).click();
        webDriver.findElement(By.linkText("Great! Return to menu")).click();




        Thread.sleep(10000);
        webDriver.quit();
    }


}
