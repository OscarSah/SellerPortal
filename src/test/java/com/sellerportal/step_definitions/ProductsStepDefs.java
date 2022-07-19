package com.sellerportal.step_definitions;


import com.sellerportal.pages.ProductsPage;
import com.sellerportal.utilities.BrowserUtils;
import com.sellerportal.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProductsStepDefs{

    @Given("the user logs in and navigates to the products page")
    public void the_user_logs_in_and_navigates_to_the_products_page() throws InterruptedException {
        DashboardStepDefs dashboardStepDefs=new DashboardStepDefs();
        dashboardStepDefs.navigateToProducts();
    }

    @When("the user fills the required fields on the basic part")
    public void the_user_fills_the_required_fields_on_the_basic_part() {
        ProductsPage productsPage=new ProductsPage();
        productsPage.productName.sendKeys("hg test");
        productsPage.spu.sendKeys("HB00000SE4JHGFTYR");

        BrowserUtils.waitFor(3);

        //JavascriptExecutor executor=(JavascriptExecutor) Driver.get();
        //executor.executeScript("arguments[0].click();", productsPage.category);

        Actions at = new Actions(Driver.get());
        at.moveToElement(productsPage.category).click().perform();
        BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.category).sendKeys("alışveriş torbası").perform();
        BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.category).sendKeys(Keys.ENTER).perform();
        BrowserUtils.waitFor(2);

        at.moveToElement(productsPage.brand).click().perform();
        BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.brand).sendKeys("Gön").perform();
        BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.category).sendKeys(Keys.ENTER).perform();
        BrowserUtils.waitFor(2);


        productsPage.guarantee.clear();
        productsPage.guarantee.sendKeys("0");
        BrowserUtils.waitFor(2);

        at.moveToElement(productsPage.taxClass).click().perform();
        BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.taxClass).sendKeys("Tax 0").perform();
        BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.taxClass).sendKeys(Keys.ENTER).perform();
        BrowserUtils.waitFor(2);

        at.moveToElement(productsPage.fulfillmentDay).click().perform();
        BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.fulfillmentDay).sendKeys(Keys.CLEAR).perform();
        BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.fulfillmentDay).sendKeys("0").perform();
        BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.fulfillmentDay).sendKeys(Keys.ENTER).perform();


    }

    @Then("the user clicks to add product on the basic part")
    public void the_user_clicks_to_add_product_on_the_basic_part() {
        ProductsPage productsPage=new ProductsPage();
        BrowserUtils.waitFor(2);
        Actions at = new Actions(Driver.get());
        at.moveToElement(productsPage.addProductBasic).click().perform();
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[2]/button")).click();
        BrowserUtils.waitFor(2);

    }


}
