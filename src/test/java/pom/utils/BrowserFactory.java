package pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    private static BrowserFactory browserFactory;

    private BrowserFactory() {
    }

    public static BrowserFactory getBrowserFactory(){
        if (browserFactory == null){
            browserFactory = new BrowserFactory();
        }
        return browserFactory;
    }

    ThreadLocal<WebDriver> tlDriver = ThreadLocal.withInitial(()->{
        String browser = "chrome";
        WebDriver driver = switch (browser){
            case "chrome"-> WebDriverManager.chromedriver().create();
            case "edge"-> WebDriverManager.edgedriver().create();
            case "firefox"-> WebDriverManager.firefoxdriver().create();
            default -> throw new RuntimeException("Invalid browser name: "+browser);
        };
        driver.manage().window().maximize();
        return driver;
    });

    public WebDriver getDriver(){
        return tlDriver.get();
    }

    public void quitDriver(){
        WebDriver driver = tlDriver.get();
        if (driver != null){
            driver.quit();
            tlDriver.remove();
        }
    }
}
