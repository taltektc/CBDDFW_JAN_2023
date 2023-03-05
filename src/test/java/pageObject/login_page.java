package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class login_page extends Config {
    public login_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver=driver;
    }


    // locators
    @FindBy(how= How.NAME, using = "email")
    public WebElement emailLocator;
    @FindBy(how= How.NAME, using = "password")
    public WebElement passwordLocator;
    @FindBy(how= How.XPATH, using = "//*[@id='login_form']/input[3]")
    public WebElement loginButtonLocator;


    // functions
    public void enterEmailAddress(String email){
        emailLocator.sendKeys(email);
    }

    public void enterPassword(String pass){
        passwordLocator.sendKeys(pass);
    }

    public void clickOnLoginButton(){
        loginButtonLocator.click();
    }
}
