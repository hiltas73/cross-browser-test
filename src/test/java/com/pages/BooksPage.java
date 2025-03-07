package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage{

    @FindBy(id = "userName")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='item-0'][.='Login']")
    public WebElement loginMenuButton;

}
