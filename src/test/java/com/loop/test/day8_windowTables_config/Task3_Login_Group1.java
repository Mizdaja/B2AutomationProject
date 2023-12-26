package com.loop.test.day8_windowTables_config;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class Task3_Login_Group1 extends TestBase {
    @Test

    public void LoginGroup1 ()  throws InterruptedException{
        driver.get("https://beta.docuport.app/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //WebElement username = driver.findElement(By.xpath("//label[.='Username or email']//following-sibling::input"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement loginBUtton = driver.findElement(By.xpath("//button[@type='submit']"));

        password.sendKeys("Group1");
        loginBUtton.click();
        Thread.sleep(5000);

        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Please enter your username or email address')]"));
        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Please enter your username or email address";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Test fails, actual not match expected");
    }
}


