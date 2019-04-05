package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyProfileScreen extends BaseScreen{
    public MyProfileScreen(AndroidDriver driver) {
        super(driver);
    }

    String keluarButton = "//android.widget.TextView[@text='Keluar']";
    String nameField = "(//android.widget.TextView)[1]";

    public void clickKeluar () {
        waitForElementVisible(By.xpath(keluarButton)).click();
    }

    public void assertName(String name){
        String nameOnApps = waitForElementVisible(By.xpath(nameField)).getText();
        Assert.assertEquals(name, nameOnApps);
    }

}
