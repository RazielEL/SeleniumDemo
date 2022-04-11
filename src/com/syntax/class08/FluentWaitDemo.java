package com.syntax.class08;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);



        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");









    }
}
