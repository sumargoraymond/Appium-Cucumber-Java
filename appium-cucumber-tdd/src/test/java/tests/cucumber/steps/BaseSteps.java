package tests.cucumber.steps;

import org.openqa.selenium.support.ui.WebDriverWait;
import screens.*;
import tests.ThreadLocalDriver;

public class BaseSteps {

    protected WebDriverWait wait;

    protected void setupCucumber () {
        wait = new WebDriverWait(ThreadLocalDriver.getDriver(), 10);
    }

    protected void teardown(){
        ThreadLocalDriver.getDriver().quit();
    }
}
