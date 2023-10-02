package com.practice.signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class chromeSignUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver//chromedriver.exe");
        try {
            signup();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void signup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Signup / Login")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("name")).sendKeys("Saravanan");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")).sendKeys("sharan1beta@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("id_gender1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("act12345");
        Thread.sleep(2000);
       WebElement daysdd = driver.findElement(By.xpath("//select[@id='days']"));
        Select days = new Select(daysdd);
        days.selectByVisibleText("1");
       WebElement  monthsdd = driver.findElement(By.xpath("//select[@id='months']"));
        Select months = new Select(monthsdd);
        months.selectByValue("3");
      WebElement  yeardd=  driver.findElement(By.cssSelector("#years"));
      Select years = new Select(yeardd);
      years.selectByValue("1995");
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("abcde");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("fgh");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("emcus");
        driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[4]/input[1]")).sendKeys("6. basweshara nagar, emcus");
        driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[5]/input[1]")).sendKeys("Bengalru");
        WebElement countrydd = driver.findElement(By.xpath("//select[@id='country']"));
        Select country = new Select(countrydd);
        country.selectByValue("India");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Karnataka");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bengalaru");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("560078");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("7258136360");
        driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();




    }
}
