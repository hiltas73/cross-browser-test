package com.stepDefinitions;

import com.pages.LoginPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("the user navigates to {string} page")
    public void theUserNavigatesToPage(String menuPage) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.clickOnMenuItems(menuPage);
    }

    @When("the user clicks on the login button")
    public void clickLoginButton() {
        loginPage.loginButton.click();
    }

    @And("the user enters a valid username")
    public void enterValidUsername() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @And("the user enters a valid password")
    public void enterValidPassword() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @And("the user clicks the submit login button")
    public void clickSubmitLogin() {
        loginPage.loginButton.click();
    }

    @Then("the user should be redirected to the Dashboard")
    public void verifyDashboardRedirection() {
        String pageTitle = Driver.getDriver().getTitle();
        System.out.println("pageTitle = " + pageTitle);
    }


}
