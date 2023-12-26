package com.loop.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaOrderWebTableUtils {


        /*
    1. go to https://loopcamp.vercel.app/web-tables.html
    2. create a method to test given field for a given name
    3. test type
    4. test amount
    5. test date
    6. test street
    7. test city
    8. test state
    9. test zip
    10. test card
    11. test card number
    12. test exp
     */

    /**
     * @param driver
     * @param name
     * @param field
     * @return field's text
     * @author Majd
     */



public static String returnAnyFieldValue (WebDriver driver, String name, String field){

    String index = "";
    if(field.equalsIgnoreCase("Pizza Type")){
        index = "[1]";
    } else if (field.equalsIgnoreCase("Amount")) {
        index = "[2]";
    } else if (field.equalsIgnoreCase("Date")) {
        index = "[3]";
    } else if (field.equalsIgnoreCase("Street")) {
        index = "[4]";
    } else if (field.equalsIgnoreCase("City")){
        index = "[5]";
    } else if (field.equalsIgnoreCase("State")) {
        index = "[6]";
    } else if (field.equalsIgnoreCase("Zip")) {
        index = "[7]";
    } else if (field.equalsIgnoreCase("Card")) {
        index = "[8]";
    } else if (field.equalsIgnoreCase("Card Number")) {
        index = "[9]";
    } else if (field.equalsIgnoreCase("Exp")) {
        index = "[10]";
    } else {
        System.out.println("There is not such a field: " + field);
    }

    WebElement element = driver.findElement(By.xpath("//td[.='" +name+ "']//following-sibling::td"+ index));
    return element.getText().trim();
}
}
