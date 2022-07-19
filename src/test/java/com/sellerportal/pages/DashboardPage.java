package com.sellerportal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DashboardPage extends BasePage{

    @FindBy(xpath = "//input[@type='email']")
    public WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/table/tbody/tr[1]/td[6]/div[1]/button")
    public WebElement actAs;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[5]/a/div")
    public WebElement products;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[5]/ul/li[1]/a/div")
    public WebElement activeProducts;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div[2]/button")
    public WebElement addProduct;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[1]/a/div/span")
    public WebElement dashboard;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[2]/a/div/span")
    public WebElement dashboardCache;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[4]/a/div/span")
    public WebElement companies;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/button")
    public WebElement addCompany;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[5]/a/div/span")
    public WebElement productTools;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[6]/a/div/span")
    public WebElement orderClaimTools;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[7]/a/div/span")
    public WebElement leadTimeTools;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[8]/a/div/span")
    public WebElement categoryTools;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[9]/a/div/span")
    public WebElement companyLimits;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[10]/a")
    public WebElement delete;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[11]/a/div/span")
    public WebElement tagManagement;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[12]/a")
    public WebElement logistics;


}
