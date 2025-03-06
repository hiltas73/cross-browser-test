package com.stepDefinitions;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefinitions {

    @Given("the user navigates to the Book Store page")
    public void theUserNavigatesToTheBookStorePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user clicks on the login button")
    public void clickLoginButton() {
        // Implement Selenium code to click the login button
    }

    @And("the user enters a valid username")
    public void enterValidUsername() {
        // Implement Selenium code to enter the username
    }

    @And("the user enters a valid password")
    public void enterValidPassword() {
        // Implement Selenium code to enter the password
    }

    @And("the user clicks the submit login button")
    public void clickSubmitLogin() {
        // Implement Selenium code to submit the login form
    }

    @Then("the user should be redirected to the Dashboard")
    public void verifyDashboardRedirection() {
        // Implement validation to check if user is on the dashboard
    }

}
