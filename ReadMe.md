
---

# Cross-Browser Test Project
==========================

This project is designed to perform cross-browser testing using Java, Selenium, and Cucumber BDD. It utilizes the Page Object Model (POM) and Singleton Design Pattern for efficient test execution.

## Project Structure
--------------------

- **pages**: Contains classes representing web pages, encapsulating web elements and common methods.
- **runners**: Holds the test "Runner" class.
- **stepDefinitions**: Includes Java code for test steps and hooks.
- **utilities**:
    - **BrowserUtils**: Provides utility methods for browser interactions.
    - **ConfigurationReader**: Reads configuration from `configuration.properties`.
    - **Driver**: Manages the Selenium WebDriver instance using the Singleton pattern.
- **resources**: Features the Gherkin feature file for login functionality.
- **configuration.properties**: Central configuration file containing URL, username, password, and browser type.
- **pom.xml**: Maven project file with dependencies and Surefire plugin for parallel test execution.  It allows Maven to download required libraries automatically and execute specific goals or tasks defined within the file.

## Dependencies
------------

The project uses Maven as the build tool. Key dependencies include:

- Selenium WebDriver for browser automation
- Cucumber for BDD testing
- JUnit for assertions
- Cucumber and Allure reports

## Running Tests
--------------

### Option 1: Manual Configuration

1. Clone the project.
2. Open `configuration.properties` and set the desired browser type.
3. Input your username and password.
4. Run tests using: `Runner`

### Option 2: Command-Line Configuration

From the terminal, use the following command to specify the browser type directly:

```
mvn test -Dbrowser=browserName
```

Replace `browserName` with the desired browser (e.g., chrome, firefox).

**Note**: If the specified browser is not supported, an exception will be thrown.

## Reporting
----------

The project generates reports in HTML, Cucumber, and Allure formats. After each test run, public links to these reports are printed in the console output.

## Features
------------

- **Cross-Browser Testing**: Supports testing across multiple browsers.
- **Parallel Execution**: Utilizes Maven Surefire plugin for parallel test execution.
- **Centralized Configuration**: `configuration.properties` serves as a central place for test configurations.

## Contributing
------------

Contributions are welcome! Please ensure that any changes adhere to the existing coding standards and project structure.

------------
## Author
-------

**Halim ILTAS**

-   LinkedIn: [https://www.linkedin.com/in/halim-iltas/](https://www.linkedin.com/in/halim-iltas/)