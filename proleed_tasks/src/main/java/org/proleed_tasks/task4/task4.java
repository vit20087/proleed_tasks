package org.proleed_tasks.task4;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
        try {
            Select fullName_dropDown = new Select(driver.findElement(By.id("prefix")));
            fullName_dropDown.selectByIndex(1);

        } catch (NotFoundException e) {
            System.out.println("Element not found");
        }


        try {
            WebElement fullName_firstName = driver.findElement(By.id("firstname"));
            fullName_firstName.click();
            fullName_firstName.sendKeys("Vitaliy");
        } catch (NotFoundException e) {
            System.out.println("firstName not found");
        }

        try {
            WebElement fullName_lastName = driver.findElement(By.id("lastname"));
            fullName_lastName.click();
            fullName_lastName.sendKeys("Padus");
        } catch (NotFoundException e) {
            System.out.println("lastName not found");
        }

        try {
            WebElement account_type = driver.findElement(By.xpath("//*[@id=\"pension\"]"));
            account_type.click();
        } catch (NotFoundException e) {
            System.out.println("accountType not found");
        }

        try {
            WebElement fathername = driver.findElement(By.name("fathername"));
            fathername.click();
            fathername.sendKeys("Yaroslav");
        } catch (NotFoundException e) {
            System.out.println("fathername not found");
        }

        try {
            WebElement mothername = driver.findElement(By.name("mothername"));
            mothername.click();
            mothername.sendKeys("Yulia");
        } catch (NotFoundException e) {
            System.out.println("mothername not found");
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        try {
            WebElement id_number = driver.findElement(By.id("identity_number"));
            id_number.sendKeys("1234567890");
        } catch (NoSuchFieldError e) {
            System.out.println("no identity number field error");
        }

        try {
            WebElement radiobutton_gender = driver.findElement(By.cssSelector("#other"));
            radiobutton_gender.click();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Gender not found");
        }


        try {
            Select birth_month = new Select(driver.findElement(By.id("dob_month")));
            birth_month.selectByVisibleText("March");

        } catch (java.util.NoSuchElementException e) {
            System.out.println("Birth month not found");
        }

        try {
            Select birth_day = new Select(driver.findElement(By.id("dob_date")));
            birth_day.selectByVisibleText("12");

        } catch (java.util.NoSuchElementException e) {
            System.out.println("Birth day not found");
        }

        try {
            Select birth_year = new Select(driver.findElement(By.id("dob_year")));
            birth_year.getAllSelectedOptions();
            birth_year.selectByValue("2005");
        } catch (NoSuchElementException e) {
            System.out.println("Birth year not found");
        }

        try {
            Select country_code = new Select(driver.findElement(By.xpath("//*[@id=\"country_code\"]")));
            country_code.getAllSelectedOptions();
            country_code.selectByVisibleText("Ukraine (+380)");
        } catch (NotFoundException e) {
            System.out.println("country_code not found");
        }

        try {
            WebElement mobile_number = driver.findElement(By.id("mobile"));
            mobile_number.sendKeys("0737395132");
        } catch (NoSuchFieldError e) {
            System.out.println("no such field error");
        }


        try {
            Select nationality = new Select(driver.findElement(By.xpath("//*[@id=\"nationality\"]")));
            nationality.getAllSelectedOptions();
            nationality.selectByVisibleText("Ukrainian");
        } catch (NoSuchFieldError e) {
            System.out.println("nationality not found");
        }


        try {
            Select country_select = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
            country_select.getAllSelectedOptions();
            country_select.selectByValue("Ukraine");

        } catch (NotFoundException exception) {
            System.out.println("country not found");
        } finally {
            driver.quit();
        }
    }
}
