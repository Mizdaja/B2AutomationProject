package com.loop.test.day1_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class NavigateToAmazon {
        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            Thread.sleep(5000);
            driver.get("https://www.amazon.com");
            driver.manage().window().maximize();
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().refresh();
        }
    }
