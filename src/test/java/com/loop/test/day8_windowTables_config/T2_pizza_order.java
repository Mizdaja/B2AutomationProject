package com.loop.test.day8_windowTables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.PizzaOrderWebTableUtils;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class T2_pizza_order extends TestBase {

    @Test
    public void test_pizza_type() {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedPizzaType = "Thin Crust";
        String actualPizzaType = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Pizza type");
        assertEquals(actualPizzaType, expectedPizzaType, "actual does not match expected");
    }

}


