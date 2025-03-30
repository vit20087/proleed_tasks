package org.proleed_tasks.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php");

        driver.manage().window().maximize();

        try{
            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys("email");

        }catch(NoSuchFieldError e){
            throw new NoSuchFieldError("No email field");
        }

        try{
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("password");
        }catch(NoSuchFieldError e){
            throw new NoSuchFieldError("No password field");
        }


    }
}
