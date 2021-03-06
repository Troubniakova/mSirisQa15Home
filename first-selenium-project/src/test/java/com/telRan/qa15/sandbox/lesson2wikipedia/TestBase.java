package com.telRan.qa15.sandbox.lesson2wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        openWikipedia();
        Thread.sleep(4000);

    }

    public void openWikipedia() {
        wd.get("https://wikipedia.org/");
    }

    public void findAndClickOnTheEnglishLink() {
        wd.findElement(By.id("js-link-box-en")).click();
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
