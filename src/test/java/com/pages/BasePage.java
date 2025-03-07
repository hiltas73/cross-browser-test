package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickOnMenuItems(String menuItem) {
        Driver.getDriver().findElement(By.xpath("//*[contains(text(),'"+ menuItem +"')]")).click();
    }

}
