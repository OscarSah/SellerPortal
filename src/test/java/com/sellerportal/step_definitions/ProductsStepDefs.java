package com.sellerportal.step_definitions;


import com.sellerportal.pages.ProductsPage;
import com.sellerportal.utilities.BrowserUtils;
import com.sellerportal.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.datatype.Duration;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.security.Key;

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
        BrowserUtils.waitFor(1);

        at.moveToElement(productsPage.taxClass).click().perform();
        BrowserUtils.waitFor(1);
        at.moveToElement(productsPage.taxClass).sendKeys("Tax 0").perform();
        BrowserUtils.waitFor(1);
        at.moveToElement(productsPage.taxClass).sendKeys(Keys.ENTER).perform();
        BrowserUtils.waitFor(1);

        at.moveToElement(productsPage.fulfillmentDay).click().perform();
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath("//*[@id=\"fulfillment_day\"]")).clear();
        BrowserUtils.waitFor(1);
        at.moveToElement(productsPage.fulfillmentDay).click().perform();
        BrowserUtils.waitFor(1);
        at.moveToElement(productsPage.fulfillmentDay).sendKeys("0").perform();
        BrowserUtils.waitFor(1);

        //BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.fulfillmentDay).sendKeys(Keys.ENTER).perform();
    }

    @Then("the user selects the first variant and fills out the required fields")
    public void the_user_selects_the_first_variant_and_fills_out_the_required_fields() {
        ProductsPage productsPage= new ProductsPage();
        Actions at = new Actions(Driver.get());
        BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.variantsTab).click().perform();
        BrowserUtils.waitFor(2);
        at.moveToElement(productsPage.addVariant).click().perform();
        BrowserUtils.waitFor(5);
    }

    @Then("the user fills out the blank fields of the appeared variant parts")
    public void the_user_fills_out_the_blank_fields_of_the_appeared_variant_parts() {
        ProductsPage productsPage=new ProductsPage();
        Actions at = new Actions(Driver.get());
        //BrowserUtils.waitFor(1);
        at.moveToElement(productsPage.variantName).click().perform();
        at.moveToElement(productsPage.variantName).sendKeys("hg test").perform();
        //BrowserUtils.waitFor(1);
        at.moveToElement(productsPage.variantSKU).click().perform();
        //BrowserUtils.waitFor(1);
        at.moveToElement(productsPage.variantSKU).sendKeys("brown_36_HB00000PCK4F");
        //BrowserUtils.waitFor(1);
        at.moveToElement(productsPage.variantPrice).click().perform();
        at.moveToElement(productsPage.variantPrice).sendKeys("1100").perform();
        //BrowserUtils.waitFor(1);
        at.moveToElement(productsPage.variantRetailPrice).click().perform();
        at.moveToElement(productsPage.variantRetailPrice).sendKeys("2200").perform();

        at.moveToElement(productsPage.variantStock).click().perform();
        at.moveToElement(productsPage.variantStock).sendKeys("10").perform();

        at.moveToElement(productsPage.variantBarcode).click().perform();
        at.moveToElement(productsPage.variantBarcode).sendKeys("123456").perform();

        at.moveToElement(productsPage.variantHsCode).click().perform();
        at.moveToElement(productsPage.variantHsCode).sendKeys("420293000000").perform();

        at.moveToElement(productsPage.variantGTIN).click().perform();
        at.moveToElement(productsPage.variantGTIN).sendKeys("09090909").perform();

        at.moveToElement(productsPage.variantDescription).click().perform();
        at.moveToElement(productsPage.variantDescription).sendKeys("shopping bag").perform();

        at.moveToElement(productsPage.variantDeci).click().perform();
        at.moveToElement(productsPage.variantDeci).sendKeys("11").perform();

        at.moveToElement(productsPage.variantHeight).click().perform();
        at.moveToElement(productsPage.variantHeight).sendKeys("55").perform();

        at.moveToElement(productsPage.variantWidth).click().perform();
        at.moveToElement(productsPage.variantWidth).sendKeys("35").perform();

        at.moveToElement(productsPage.variantLength).click().perform();
        at.moveToElement(productsPage.variantLength).sendKeys("09").perform();

        at.moveToElement(productsPage.variantWeight).click().perform();
        at.moveToElement(productsPage.variantWeight).sendKeys("5").perform();
    }
    @Then("the user hover overs to images tab")
    public void the_user_hover_overs_to_images_tab() {
        ProductsPage productsPage=new ProductsPage();
        Actions at = new Actions(Driver.get());
        at.moveToElement(productsPage.imagesTab).click().perform();
    }
    @Then("the user clicks on choose file and uploads the product image")
    public void the_user_clicks_on_choose_file_and_uploads_the_product_image() throws InterruptedException, AWTException {
        ProductsPage productsPage=new ProductsPage();
        Thread.sleep(8000);
        productsPage.upload();




        //WebDriverWait wait=new WebDriverWait(Driver.get(),10);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[3]/div/div/form/div/div")));
        //at.moveToElement(productsPage.imagesChooseFile).click().perform();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='file']")));
        //Thread.sleep(5000);
        //Driver.get().findElement(By.xpath("//input[@type='file']")).click();
        //at.moveToElement((WebElement) By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[3]/div/div/form/div/div")).sendKeys("/Users/ehilal/Downloads/jacket.jpeg/test-folder");
        //Driver.get().findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[3]/div/div/form/div/div")).sendKeys("/Users/ehilal/Downloads/jacket.jpeg");
        //Thread.sleep(5000);
        //JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        //jse.executeScript("document.getElementById('default_image_file').value='//Users/ehilal/IdeaProjects/SellerPortal/src/test/resources/files/jacket.jpeg'");
        //at.moveToElement((WebElement) By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[3]/div/div/form/div/div")).sendKeys("//Users/ehilal/Downloads/jacket.jpeg/test-folder");


        /*
        Actions at = new Actions(Driver.get());
        WebElement element=Driver.get().findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[3]/div/div/form/div/div"));
        WebElement element2=Driver.get().findElement(By.xpath("//input[@type='file']"));
        at.moveToElement(productsPage.imagesChooseFile).click().perform();
        Thread.sleep(5000);
        at.moveToElement(productsPage.imagesChooseFile).sendKeys("/Users/ehilal/Desktop/jacket.jpeg");
        JavascriptExecutor js=(JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].style.display='block';",element2);
        BrowserUtils.waitFor(5);
        at.moveToElement(productsPage.imagesChooseFile).sendKeys("/Users/ehilal/Desktop/jacket.jpeg");
        */


        /*Driver.get().findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[3]/div/div/form/div/div")).click();
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[3]/div/div/form/div/div")).sendKeys("/Users/ehilal/Downloads/jacket.jpeg");
        */

        /*at.moveToElement(productsPage.imagesChooseFile).click().perform();
        BrowserUtils.waitFor(5);
        at.moveToElement(productsPage.imagesChooseFile).sendKeys("ç").perform();
        BrowserUtils.waitFor(5);
        at.moveToElement(productsPage.clickimage).click().perform();
         */


        /*StringSelection s=new StringSelection("/Users/ehilal/Downloads/jacket.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(2000);

        at.moveToElement(productsPage.imagesChooseFile).click().perform();


         */

        /*Robot robot=new Robot();
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        */


        /*Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.delay(500);

        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        */

    }


}
