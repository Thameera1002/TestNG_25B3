package pom.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.utils.BrowserFactory;

public class BaseTest {
    public WebDriver driver;

    protected BrowserFactory browserFactory = BrowserFactory.getBrowserFactory();

    @BeforeMethod
    public void beforeMethod(){
        driver = browserFactory.getDriver();
    }

    @AfterMethod
    public void afterMethod(){
        browserFactory.quitDriver();
    }
}
