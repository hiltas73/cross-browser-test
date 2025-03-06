package com.utilities;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    /*
    Creating a private constructor, so we are closing
    access to the object of this class from outside the class
     */
    private Driver(){}


    /*
   Create a re-usable utility method which will return same driver instance when we call it
    */
    public static WebDriver getDriver() {

        if (driver == null) {

           /*
            We read our browserType from configuration.properties.
            This way, we can control which browser is opened from outside our code, from configuration.properties.
             */
            String browser = System.getProperty("browser") != null ? System.getProperty("browser") :
                    ConfigurationReader.getProperty("browser");



            switch (browser.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();

                    /*
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yasemin\\Desktop\\Web-Drivers\\geckodriver\\geckodriver.exe");
                     */
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();

                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();

                    break;
//                case "opera":
//                    WebDriverManager.operadriver().setup();
//                    driver = new OperaDriver();
//
//                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    //driver = new InternetExplorerDriver();
                    InternetExplorerOptions options = new InternetExplorerOptions();
                    options.ignoreZoomSettings();
                    driver = new InternetExplorerDriver(options);

                    break;
                default:
                    throw new IllegalArgumentException("Browser not supported: " + browser);
            }

        }

        return driver;

    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
