package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObject.login_page;

public class LoginSteps extends Config {
    login_page lp = new login_page(driver);
    @Given("user in TalentTEK Homepage")
    public void userInTalentTEKHomepage() {
        // verify page title
        String act = driver.getTitle();
        String exp = "Sign In";
        Assert.assertEquals(act, exp);

    }

    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
        lp.enterEmailAddress(Email_Address);
    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        lp.enterPassword(Password);
    }

    @When("user clicks on Log In button")
    public void userClicksOnLogInButton() {
        lp.clickOnLoginButton();
    }
}
