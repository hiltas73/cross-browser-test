package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {


    /*
    Creating a private constructor, so we are closing
    access to the object of this class from outside the class
     */
    private Driver(){}


    // We make WebDriver private, because we want to close access from outside of class
    // We make it static, because we will use it inside static method
    private static WebDriver driver;

    /*
   Create a re-usable utility method which will return same driver instance when we call it
    */
    public static WebDriver getDriver() {

        // it will check if driver is null and if it is we will set up browser inside if statement
        // if you already setup driver and using it again for following line of codes, it will return to same driver
        if (driver == null) {

           /*
            We read our browserType from configuration.properties.
            This way, we can control which browser is opened from outside our code, from configuration.properties.
             */
            String browserType = System.getProperty("browser") != null ? browserType = System.getProperty("browser") :
                    ConfigurationReader.getProperty("browser");


            switch (browserType.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    break;

                case "safari":
                    driver = new SafariDriver();
                    break;

                case "edge":
                    driver = new EdgeDriver();
                    break;

                    //Opera needs selenium 3.x.x not 4.x.x
//                case "opera":
//                    driver = new OperaDriver();
//                    break;

                default:
                    throw new IllegalArgumentException("Browser not supported: " + browserType);
            }

        }

        return driver;

    }

    // This method will make sure our driver value is always null after using quit() method
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
