package com.pages;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickOnMenuItems(String menuItem) {
        String menuLocator = "//*[contains(text(),'"+ menuItem +"')]";
        BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(menuLocator)));
        Driver.getDriver().findElement(By.xpath(menuLocator)).click();
    }

}
