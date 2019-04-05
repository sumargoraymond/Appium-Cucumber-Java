package tests.user;

import org.testng.annotations.Test;
import screens.HomeScreen;
import screens.LoginScreen;
import screens.MyProfileScreen;
import tests.BaseTest;
import tests.ThreadLocalDriver;

public class TestLogin extends BaseTest {

    public HomeScreen homeScreen;
    public LoginScreen loginScreen;
    public MyProfileScreen  myProfileScreen;

    @Test
    public void loginAndUpdate () throws Exception {
        homeScreen = new HomeScreen(ThreadLocalDriver.getDriver());
        homeScreen.clickProfile();
        loginScreen = new LoginScreen(ThreadLocalDriver.getDriver());
        loginScreen.clickGoogleLogin();
        loginScreen.clickChooseAccount();
        myProfileScreen = new MyProfileScreen((ThreadLocalDriver.getDriver()));
        myProfileScreen.assertName("Raymond Lucky");
        myProfileScreen.clickKeluar();

    }

}
