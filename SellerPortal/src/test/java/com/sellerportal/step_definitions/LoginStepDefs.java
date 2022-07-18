package com.sellerportal.step_definitions;

import com.sellerportal.pages.LoginPage;
import com.sellerportal.utilities.BrowserUtils;
import com.sellerportal.utilities.ConfigurationReader;
import com.sellerportal.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Then("the user enters the credentials")
    public void the_user_enters_the_credentials() throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        loginPage.username.click();
        loginPage.username.sendKeys(ConfigurationReader.get("username"));
        loginPage.password.click();
        loginPage.password.sendKeys(ConfigurationReader.get("password"));
        loginPage.submit.click();
    }

    @Then("the user logs in successfully")
    public void the_user_logs_in_successfully() throws InterruptedException {
        Thread.sleep(1000);
        String expected="https://seller-qa.hepsiglobal.com/admin/companies";
        String actual=Driver.get().getCurrentUrl();
        Assert.assertEquals(expected,actual);

    }
}
