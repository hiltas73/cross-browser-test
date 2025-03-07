package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage{

    @FindBy(xpath = "//*[@id='item-0'][.='Login']")
    public WebElement loginButton;

}
