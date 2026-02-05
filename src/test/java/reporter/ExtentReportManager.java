package reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
    private static ExtentReports extentReports;
    private static ExtentTest test;

    public static void initReport(){
        extentReports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("reports/extentReport.html");
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setDocumentTitle("Automation Test Report");
        sparkReporter.config().setReportName("Test Execution Report");
        extentReports.attachReporter(sparkReporter);
    }

    public static void createTest(String testName){
        test = extentReports.createTest(testName);
    }

    public static void logPass(String message){
        if (test != null) {
            test.pass(message);
        }
    }

    public static void logFail(String message){
        if (test != null) {
            test.fail(message);
        }
    }

    public static void logInfo(String message) {
        if (test != null) {
            test.info(message);
        }
    }

    public static void logSkip(String message) {
        if (test != null) {
            test.skip(message);
        }
    }

    public static void flushReport(){
        if (test != null) {
            extentReports.flush();
        }
    }

    public static void logFailWithScreenshot(String message, String base64Screenshot) {
        if (test != null) {
            test.fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
        }
    }
}
