package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 2: HRMS blank username and password validation
//        Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//        enter valid username and invalid password
//        Click on login button
//        Verify error message with text "invalid credentials"

public class HW3 {
    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("aaaa");
        WebElement button = driver.findElement(By.id("btnLogin"));
        button.click();

        WebElement text = driver.findElement(By.id("spanMessage"));

        System.out.println(text.getText());







    }
}
