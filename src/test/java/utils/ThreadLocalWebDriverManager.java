package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class ThreadLocalWebDriverManager {
    private static ThreadLocal<WebDriver> threadLocalWebDriver = new ThreadLocal<WebDriver>();

    public static WebDriver createDriver(String browser){
        WebDriver driver = null;

        if(browser.equalsIgnoreCase("chrome")){
            driver = WebDriverManager.chromedriver().create();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            driver = WebDriverManager.firefoxdriver().create();
        }
        else if(browser.equalsIgnoreCase("edge")){
            driver = WebDriverManager.edgedriver().create();
        }
        else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        threadLocalWebDriver.set(driver);
        return threadLocalWebDriver.get();
    }

    public static WebDriver getDriver(){
        return threadLocalWebDriver.get();
    }

    public static void quitDriver(){
        WebDriver driver = threadLocalWebDriver.get();
        if(driver != null){
            driver.quit();
            threadLocalWebDriver.remove();
        }
    }

}
