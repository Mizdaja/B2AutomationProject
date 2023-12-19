package com.loop.test.day8_windowTables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/*
1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza     +
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze       +
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1

 */

public class Task1_webTables extends TestBase {

    @Test
    public void test_webTables() throws InterruptedException {
        //1.
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //2.
        WebElement user = driver.findElement(By.xpath("//span[contains(text(),'User')]"));
        user.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //3.
        String fullNameExpected = "Alex De Souza";
        String fullNameActual = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "full name" );
        Assert.assertEquals(fullNameActual, fullNameExpected, "TEST #001 FAILED !" + fullNameActual + " NOT MATCHING WITH " + fullNameExpected);
        //4.
        String userNameExpected = "alexdesouze";
        String userNameActual = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "username" );
        Assert.assertEquals(userNameActual, userNameExpected, "TEST #001 FAILED !" + userNameActual + " NOT MATCHING WITH " + userNameExpected);
        //5.
        String phoneNumberExpected = "+994512060042";
        String phoneNumberActual = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "phone number" );
        Assert.assertEquals(phoneNumberActual, phoneNumberExpected, "TEST #001 FAILED !" + phoneNumberActual + " NOT MATCHING WITH " + phoneNumberExpected);
        //6.
        String roleExpected = "Client";
        String roleActual = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "role" );
        Assert.assertEquals(roleActual, roleExpected, "TEST #001 FAILED !" + roleActual + " NOT MATCHING WITH " + roleExpected);
        //7.
        String advisorExpected = "Batch1 Group1";
        String advisorActual = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "advisor" );
        Assert.assertEquals(advisorActual, advisorExpected, "TEST #001 FAILED !" + advisorActual + " NOT MATCHING WITH " + advisorExpected);

    }

}
