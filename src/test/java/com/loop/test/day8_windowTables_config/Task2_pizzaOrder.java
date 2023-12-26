package com.loop.test.day8_windowTables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportWebTableUtils;
import com.loop.test.utilities.PizzaOrderWebTableUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


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

public class Task2_pizzaOrder extends TestBase {

    @Test
    public void test_pizza_order(){
        //1.
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        //2.
        String name = "Alexandra Gray";
        //3.
        String pizzaTypeExpected = "Thin Crust";
        String pizzaTypeActual = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "pizza type" );
        Assert.assertEquals(pizzaTypeActual, pizzaTypeExpected, "TEST #001 FAILED !" + pizzaTypeActual + " NOT MATCHING WITH " + pizzaTypeExpected );
        //4.
        String amountExpected = "2";
        String amountActual = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "amount" );
        Assert.assertEquals(amountActual, amountExpected, "TEST #001 FAILED !" + amountActual + " NOT MATCHING WITH " + amountExpected );
        //5.
        String dateExpected = "04/15/2021";
        String dateActual = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "date" );
        Assert.assertEquals(dateActual, dateExpected, "TEST #001 FAILED !" + dateActual + " NOT MATCHING WITH " + dateExpected );
        //6.
        String streetExpected = "7, Miller Street";
        String streetActual = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "street" );
        Assert.assertEquals(streetActual, streetExpected, "TEST #001 FAILED !" + streetActual + " NOT MATCHING WITH " + streetExpected );
        //7.
        String cityExpected = "Chicago, IL";
        String cityActual = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "city" );
        Assert.assertEquals(cityActual, cityExpected, "TEST #001 FAILED !" + cityActual + " NOT MATCHING WITH " + cityExpected );
        //8.
        String stateExpected = "US";
        String stateActual = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "state" );
        Assert.assertEquals(stateActual, stateExpected, "TEST #001 FAILED !" + stateActual + " NOT MATCHING WITH " + stateExpected );
        //9.
        String zipExpected = "748";
        String zipActual = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "zip" );
        Assert.assertEquals(zipActual, zipExpected, "TEST #001 FAILED !" + zipActual + " NOT MATCHING WITH " + zipExpected );
        //10.
        String cardExpected = "VISA";
        String cardActual = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "card" );
        Assert.assertEquals(cardActual, cardExpected, "TEST #001 FAILED !" + cardActual + " NOT MATCHING WITH " + cardExpected );
        //11.
        String cardNumberExpected = "321456789012";
        String cardNumberActual = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "card number" );
        Assert.assertEquals(cardNumberActual, cardNumberExpected, "TEST #001 FAILED !" + cardNumberActual + " NOT MATCHING WITH " + cardNumberExpected );
        //12.
        String expExpected = "02/24";
        String expActual = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "exp" );
        Assert.assertEquals(expActual, expExpected, "TEST #001 FAILED !" + expActual + " NOT MATCHING WITH " + expExpected );
    }
}
