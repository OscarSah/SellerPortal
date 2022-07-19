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

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/form/div[6]/div/div/div/div[1]")
    public WebElement fulfillmentDay;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div[2]/button")
    public WebElement addProductBasic;
}
