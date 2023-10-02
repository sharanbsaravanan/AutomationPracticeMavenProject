package com.practice.signIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeSignIn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver//chromedriver.exe");
        try {
            signin();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void signin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver//chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://automationexercise.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();
         driver.findElement(By.linkText("Signup / Login")).click();
         Thread.sleep(2000);
         driver.findElement(By.name("email")).sendKeys("sharan1beta@gmail.com");
         Thread.sleep(2000);
         driver.findElement(By.name("password")).sendKeys("act@12345");
         Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        Thread.sleep(2000);





    }

}
