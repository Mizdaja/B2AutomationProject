package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Task1_window extends TestBase {

    /*
     1. go to https://loopcamp.vercel.app/
    2. click "Multiple Windows" link
    3. Validate "Powered by Loopcamp" is displayed
    4. Validate title is "Windows"
    5. Click - click here
    6. Switch to new window and validate title
     */

    @Test
    public void multiWindows(){
        //1.
        driver.get("https://loopcamp.vercel.app/");
        //2.
        WebElement multiWindows = driver.findElement(By.xpath("//a[@href='windows.html']"));
        multiWindows.click();
        //3.
        WebElement PoweredByLoopcamp = driver.findElement(By.xpath("//div[contains(text(),'Powered by ')] "));
        String poweredByLoopcampActual = PoweredByLoopcamp.getText();
        String poweredByLoopcampExpected = "Powered by LOOPCAMP";
        Assert.assertEquals(poweredByLoopcampActual,poweredByLoopcampExpected, "Test failed");
        //4.
        Assert.assertEquals(driver.getTitle(),"Windows");
        //5.
        WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHere.click();
        //6.
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles){
            System.out.println("window = " + window);
            driver.switchTo().window(window);
        }
        Assert.assertEquals(driver.getTitle(),"New Window","Actual does not match expected");
    }

}
