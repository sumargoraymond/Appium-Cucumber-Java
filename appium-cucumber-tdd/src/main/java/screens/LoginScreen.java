package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginScreen extends BaseScreen {
    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    String googleLoginButton = "//android.widget.TextView[@text='Masuk dengan Google+']";
    String chooseAccountLink = "com.google.android.gms:id/account_display_name";

    public void clickGoogleLogin() {
        waitForElementVisible(By.xpath(googleLoginButton)).click();
    }

    public void clickChooseAccount(){
        waitForElementVisible(By.id(chooseAccountLink)).click();
    }

}
