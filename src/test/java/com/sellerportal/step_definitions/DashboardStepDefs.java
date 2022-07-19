package com.sellerportal.step_definitions;

import com.sellerportal.pages.DashboardPage;
import com.sellerportal.utilities.BrowserUtils;
import com.sellerportal.utilities.ConfigurationReader;
import com.sellerportal.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DashboardStepDefs {

    DashboardPage dashboardPage =new DashboardPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @Then("the user enters the credentials")
    public void the_user_enters_the_credentials() throws InterruptedException {
        dashboardPage.username.click();
        dashboardPage.username.sendKeys(ConfigurationReader.get("username"));
        dashboardPage.password.click();
        dashboardPage.password.sendKeys(ConfigurationReader.get("password"));
        dashboardPage.submit.click();
    }
    @Then("the user logs in successfully")
    public void the_user_logs_in_successfully() throws InterruptedException {
        Thread.sleep(1000);
        String expected="https://seller-qa.hepsiglobal.com/admin/companies";
        String actual=Driver.get().getCurrentUrl();
        Assert.assertEquals(expected,actual);
    }
    @Then("the user is able to select the company")
    public void the_user_is_able_to_select_the_company() {
        BrowserUtils.waitFor(2);
        dashboardPage.companies.click();
        dashboardPage.actAs.click();
        BrowserUtils.waitFor(3);
    }
    @When("the user select the active products")
    public void the_user_select_the_active_products() {
        BrowserUtils.waitFor(2);
        dashboardPage.products.click();
        BrowserUtils.waitFor(2);
        dashboardPage.activeProducts.click();
        BrowserUtils.waitFor(3);
    }

    @When("the user clicks to add product")
    public void the_user_clicks_to_add_product() {
        dashboardPage.addProduct.click();
        BrowserUtils.waitFor(2);
    }

    public void navigateToProducts() throws InterruptedException {
        the_user_is_on_the_login_page();
        the_user_enters_the_credentials();
        the_user_logs_in_successfully();
        the_user_is_able_to_select_the_company();
        the_user_select_the_active_products();
        the_user_clicks_to_add_product();

    }

}
