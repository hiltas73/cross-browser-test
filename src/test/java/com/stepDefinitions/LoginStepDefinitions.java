package com.stepDefinitions;

import com.pages.BooksPage;
import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefinitions {

    BooksPage booksPage = new BooksPage();

    @Given("the user navigates to {string} page")
    public void theUserNavigatesToPage(String menuPage) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitFor(2);
        booksPage.clickOnMenuItems(menuPage);
        BrowserUtils.waitFor(2);
    }

    @When("the user clicks on the login button")
    public void clickLoginButton() {
        BrowserUtils.clickWithJS(booksPage.loginMenuButton);
        BrowserUtils.waitFor(2);
    }

    @And("the user enters a valid username")
    public void enterValidUsername() {
        booksPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        BrowserUtils.waitFor(2);
    }

    @And("the user enters a valid password")
    public void enterValidPassword() {
        booksPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.waitFor(2);
    }

    @And("the user clicks the submit login button")
    public void clickSubmitLogin() {
        BrowserUtils.clickWithJS(booksPage.loginButton);
        BrowserUtils.waitFor(2);
    }

    @Then("the user should be redirected to the Dashboard")
    public void verifyDashboardRedirection() {
//        String actualPageUrl = Driver.getDriver().getCurrentUrl();
//        System.out.println("actualPageUrl = " + actualPageUrl);
//        Assert.assertEquals("Logged in successfully test","https://demoqa.com/profile", actualPageUrl);

    }


}
