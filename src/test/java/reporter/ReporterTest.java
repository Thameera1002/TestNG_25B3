package reporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import listners.CustomListner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

@Listeners(CustomListner.class)
public class ReporterTest {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        ExtentReportManager.initReport();
    }

    @BeforeMethod
    public void beforeMethod(){
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
    }

    @Test
    public void ebayTest1(){
        ExtentReportManager.createTest("Ebay Test 1");
        try{
            driver.findElement(By.cssSelector("#gh-ac")).sendKeys("iphone");
            ExtentReportManager.logPass("Search box found and text entered successfully.");
        }catch (Exception e){
            ExtentReportManager.logFail("Search box not found.");
        }

        try{
            new Select(driver.findElement(By.id("gh-cat"))).selectByVisibleText("Cell Phones & Accessories");
            ExtentReportManager.logPass("Category selected successfully.");
        } catch (Exception e) {
            ExtentReportManager.logFail("Category selected not found.");
        }
        try{
            driver.findElement(By.cssSelector("#gh-search-btn")).click();
            ExtentReportManager.logPass("Search button clicked successfully.");
        } catch (Exception e) {
            ExtentReportManager.logFail("Search button not found.");
        }



    }

    @Test
    public void ebayTest2(){
        ExtentReportManager.createTest("Ebay Test 2");
            driver.findElement(By.cssSelector("#gh-ac")).sendKeys("dress");
            ExtentReportManager.logPass("Search box found and text entered successfully.");
            new Select(driver.findElement(By.id("gh-cat"))).selectByVisibleText("Clothing, Shoes & Accessories");
            ExtentReportManager.logPass("Category selected successfully.");
            driver.findElement(By.xpath("#gh")).click();
            ExtentReportManager.logPass("Search button clicked successfully.");
    }

    @AfterMethod
    public void afterMethod(){
        if (driver!=null){
            driver.quit();
        }
    }

    @AfterClass
    public void afterClass(){
        ExtentReportManager.flushReport();
    }
}
