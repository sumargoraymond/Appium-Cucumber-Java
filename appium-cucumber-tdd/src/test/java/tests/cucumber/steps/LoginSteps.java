package tests.cucumber.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import screens.LoginScreen;
import screens.MyProfileScreen;
import screens.HomeScreen;
import tests.ThreadLocalDriver;

public class LoginSteps extends BaseSteps {

    HomeScreen homeScreen;
    LoginScreen loginScreen;
    MyProfileScreen myProfileScreen;

    @Before
    public void setupLoginSteps () {
        setupCucumber();
        homeScreen = new HomeScreen(ThreadLocalDriver.getDriver());
        loginScreen = new LoginScreen(ThreadLocalDriver.getDriver());
        myProfileScreen = new MyProfileScreen(ThreadLocalDriver.getDriver());

    }

    @Given("^I am on homepage and I click profil$")
    public void onHomePageClickProfil() throws Throwable {
        homeScreen.clickProfile();
    }

    @And("^I click Masuk dengan Google+$")
    public void clickMasukGoogle() throws Throwable {
        loginScreen.clickGoogleLogin();
    }

    @And("^I choose login with existing Google account$")
    public void loginExistingGoogle() throws Throwable {
        loginScreen.clickChooseAccount();
    }

    @Then("^I should see my name \"([^\"]*)\"$")
    public void assertName(String name) throws Throwable {
        myProfileScreen.assertName(name);
    }

    @And("^I log out of my account$")
    public void logOut() throws Throwable {
        myProfileScreen.clickKeluar();
    }

}
