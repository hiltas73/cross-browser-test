Feature: User Login Functionality

  @crossbrowser @wip
  Scenario: Verify that user can successfully login with valid credentials
    Given the user navigates to "Book Store" page
    When the user clicks on the login button
    And the user enters a valid username
    And the user enters a valid password
    And the user clicks the submit login button
    Then the user should be redirected to the Dashboard