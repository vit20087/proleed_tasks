package org.proleed_tasks.task2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.get("https://proleed.academy/exercises/selenium/selenium-element-name-locators-practice-form.php");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement nameField = driver.findElement(By.name("name"));
        nameField.sendKeys("vit20087");

        driver.findElement(By.name("mobile")).sendKeys("numberrr");


        driver.findElement(By.name("email")).sendKeys("vit20087@hotmail.com");

        driver.findElement(By.name("password")).sendKeys("vit20087");


        WebElement submitButton = driver.findElement(By.name("submit"));

        /* If this doesn't work try this instead

        WebElement submitButtom = driver.findElement(By.linktext("Submit"));
        js.executeScript("arguments[0].scrollIntoView()", submitButton);
        submitButton.getLocation.

         */
        submitButton.click();



        driver.quit();
    }
}
