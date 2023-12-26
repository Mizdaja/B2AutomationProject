package com.loop.test.day9_config_driver;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class TaskRegistrationForm {

    /*
    task1
============
1. go to url: https://loopcamp.vercel.app/registration_form.html
2. fill the form
3. use faker
     */

@Test
    public void testRegistrationForm(){

    Driver.getDriver().get(ConfigurationReader.getProperty("reg_form"));
    Faker faker = new Faker();

    WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
    firstName.sendKeys(faker.name().firstName());

    WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
    lastName.sendKeys(faker.name().lastName());

    WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
    userName.sendKeys(faker.bothify("?????##??####"));

    WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
    email.sendKeys(faker.name().lastName().toLowerCase() + "@gmail.com");

    WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
    password.sendKeys(faker.bothify("???#??#######"));

    WebElement phoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
    phoneNumber.sendKeys(faker.numerify("###-###-####"));

    WebElement genderMale = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
    genderMale.click();

    WebElement dateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
    dateOfBirth.sendKeys(faker.numerify("0#/0#/19##"));


    Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
    departmentDropdown.selectByIndex(1);

    Select jobTitleDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
    jobTitleDropdown.selectByIndex(4);

    WebElement selectProgrammingLanguages = Driver.getDriver().findElement(By.xpath("//div[@class='form-check form-check-inline'][2]"));
    selectProgrammingLanguages.click();

    WebElement signUpButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
    signUpButton.click();

    String actual = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']")).getText();
    String expected = "Thanks for signing up!";
    Assert.assertEquals(actual, expected, "Test Failed, actual does not match expected");

        }

}
