package com.loop.test.utilities;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /**
     * validate if driver switched to expected url and title
     * @param driver
     * @param expectedUrl
     * @param expectedTitle
     * @author Majd
     * implements assertion
     */

    public static void switchWindowAndValidate( WebDriver driver, String expectedUrl, String expectedTitle ){
        expectedTitle = expectedTitle.toLowerCase();
        expectedUrl = expectedUrl.toLowerCase();

        Set <String> windowHandles = driver.getWindowHandles();
        for ( String each : windowHandles){
            driver.switchTo().window(each);
            if ( driver.getCurrentUrl().toLowerCase().contains(expectedUrl)){
                break;
            }
        }

        Assert.assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));

    }

    /**
     * switches to the new window by the exact title
     * return to original window if the window with given title not found
     * @param driver
     * @param targetTitle
     */
    public static void switchToWindow(WebDriver driver, String targetTitle){
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
            if(driver.getTitle().contains(targetTitle)){
                return;                        // if the if condition is good return will be good , if the if condition not work it wil go out to line 50
            }                                  // we can use else too and it will work
        }
        driver.switchTo().window(origin);
    }


}
