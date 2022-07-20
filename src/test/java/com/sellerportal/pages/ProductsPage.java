package com.sellerportal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"product_name\"]")
    public WebElement productName;
    @FindBy(xpath = "//*[@id=\"spu\"]")
    public WebElement spu;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/form/div[3]/div/div/div/div[1]/div[1]")
    public WebElement category;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div/div[1]/div[1]")
    public WebElement brand;
    @FindBy(xpath = "//*[@id=\"guarantee\"]")
    public WebElement guarantee;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/form/div[6]/div/div/div/div[1]")
    public WebElement taxClass;
    @FindBy(xpath = "//*[@id=\"fulfillment_day\"]")
    public WebElement fulfillmentDay;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[2]/button")
    public WebElement addProductBasic;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/ul/li[2]/a")
    public WebElement variantsTab;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[2]/div[2]/button")
    public WebElement addVariant;





    @FindBy(xpath = "//input[@placeholder='Please enter name']")
    public WebElement variantName;

    @FindBy(xpath = "//input[@placeholder='Please enter sku']")
    public WebElement variantSKU;

    @FindBy(xpath = "//*[@id=\"product_price\"]")
    public WebElement variantPrice;

    @FindBy(xpath = "//*[@id=\"product_retail_price\"]")
    public WebElement variantRetailPrice;

    @FindBy(xpath = "//*[@id=\"product_stock\"]")
    public WebElement variantStock;

    @FindBy(xpath = "//*[@id=\"product_barcode\"]")
    public WebElement variantBarcode;

    @FindBy(xpath = "//*[@id=\"hs_code\"]")
    public WebElement variantHsCode;

    @FindBy(xpath = "//*[@id=\"gtin\"]")
    public WebElement variantGTIN;

    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement variantDescription;

    @FindBy(xpath = "//*[@id=\"freight\"]")
    public WebElement variantDeci;

    @FindBy(xpath = "//*[@id=\"height\"]")
    public WebElement variantHeight;

    @FindBy(xpath = "//*[@id=\"width\"]")
    public WebElement variantWidth;

    @FindBy(xpath = "//*[@id=\"length\"]")
    public WebElement variantLength;

    @FindBy(xpath = "//*[@id=\"weight\"]")
    public WebElement variantWeight;

    @FindBy(xpath = "//*[@id=\"0\"]/div[16]/div/div[1]/div[2]/button")
    public WebElement variantAttribute;

    @FindBy(xpath = "//*[@id=\"0\"]/div[16]/div/div[4]/button")
    public WebElement variantRemoveAttribute;






    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/ul/li[3]/a")
    public WebElement imagesTab;


}
