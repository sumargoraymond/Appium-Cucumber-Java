package tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.URL;

public class BaseTest {

    @BeforeMethod
    @Parameters({"deviceName", "platformVersion"})
    public void setup (String deviceName, String platformVersion) throws IOException {
        String pathToApp = System.getProperty("user.dir") + "/kumparan.apk";
        System.out.println(pathToApp);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("platformVersion", platformVersion);
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", pathToApp);
        caps.setCapability("noReset","false");
        ThreadLocalDriver.setDriver(new AndroidDriver (new URL("http://0.0.0.0:4723/wd/hub"),caps));
    }

    @AfterMethod
    public synchronized void teardown(){
        ThreadLocalDriver.getDriver().quit();
    }
}
