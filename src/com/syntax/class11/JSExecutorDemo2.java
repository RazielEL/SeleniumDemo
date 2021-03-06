package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo2 {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        js.executeScript("window.scrollBy(0,1000)"); // lecimy w dol
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,-1000)"); // startujemy znowu od zera, tam gdzie nas przesunelo

        WebElement backToTop = driver.findElement(By.className("navFooterBackToTopText"));
        js.executeScript("arguments[0].scrollIntoView(true)", backToTop);


    }
}
