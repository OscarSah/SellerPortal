package com.sellerportal.pages;

import com.sellerportal.utilities.BrowserUtils;
import com.sellerportal.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }


    public void navigateToModule(String tab, String module){
        String tabLocator= "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator="//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";

        try{
            BrowserUtils.waitForClickability(By.xpath(tabLocator), 5);
            WebElement tabElement= Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        }catch (Exception e){
            BrowserUtils.clickWithWait(By.xpath(tabLocator),5);
        }

        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator),5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        }catch (Exception e){
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 5);
        }
    }




}
