package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen {

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    String loginButton = "//android.widget.TextView[@text='Profil']";

    public void clickProfile() throws Exception {
        waitForElementVisible(By.xpath(loginButton)).click();
    }


}
