package listners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import reporter.ExtentReportManager;
import utils.ThreadLocalWebDriverManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CustomListner implements ITestListener {

    WebDriver driver;

    @Override
    public void onTestStart(org.testng.ITestResult result) {
        System.out.println("Test Started: " + result.getName());
//        driver = WebDriverManager.chromedriver().create();
//        driver.manage().window().maximize();
//        driver.get("https://www.ebay.com");
    }

    @Override
    public void onTestSuccess(org.testng.ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
        ExtentReportManager.logPass("Test Passed: " + result.getName());
//            if (driver!=null){
//                driver.quit();
//            }
    }

    @Override
    public void onTestFailure(org.testng.ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
            driver = ThreadLocalWebDriverManager.getDriver();
            String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
            ExtentReportManager.logFailWithScreenshot("Test Failed: " + result.getName(), base64Screenshot);
            //ExtentReportManager.logFail("Test Failed: " + result.getName());
            //ExtentReportManager.logFail(result.getThrowable().getMessage());
//        if (driver!=null){
//            TakesScreenshot screenshot = (TakesScreenshot) driver;
//            File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
//            String path = System.getProperty("user.dir") + "/screenshots/" + result.getName() + ".png";
//            try{
//                Files.copy(screenshotFile.toPath(), Paths.get(path));
//                System.out.println("Screenshot saved at: " + path);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }

    @Override
    public void onTestSkipped(org.testng.ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
        ExtentReportManager.logSkip("Test Skipped: " + result.getName());
//        if (driver!=null){
//            driver.quit();
//        }
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        System.out.println("All tests finished.");
    }
}
