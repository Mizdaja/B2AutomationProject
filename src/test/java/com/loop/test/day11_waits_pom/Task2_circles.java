package com.loop.test.day11_waits_pom;

import com.loop.pages.Task2_circlesPage;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2_circles {

    /*
    1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
3. Click and hold small circle
4. Move it on top of the big circle
5. validate “Now drop…” text appears on big circ

                   AND

                 1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
3. Click and hold small circle
4. Dropped anywhere outside of big circle
5. validate “Try again!” text appears on big circle
     */

Task2_circlesPage task2_circlesPage;
Actions actions;

@BeforeMethod
    public void setUpMethod(){
    Driver.getDriver().get(ConfigurationReader.getProperty("loop.dragAndDrop"));
    task2_circlesPage = new Task2_circlesPage();
    actions = new Actions(Driver.getDriver());
}

@AfterMethod
public void tearDownMethod(){
    Driver.closeDriver();
}

    @Test
    public void nowDropTest(){
        actions.moveToElement(task2_circlesPage.smallCircle)
                .clickAndHold()
                .moveToElement(task2_circlesPage.bigCircle)
                .pause(1000)
                .perform();
        assertEquals(task2_circlesPage.bigCircle.getText(), "Now drop..." );
    }

    @Test
    public void tryAgainTest(){
        actions.moveToElement(task2_circlesPage.smallCircle)
                .clickAndHold()
                .moveByOffset(200,70)
                .pause(2000)
                .release()
                .perform();
        assertEquals(task2_circlesPage.bigCircle.getText(), "Try again!" );
    }
}
