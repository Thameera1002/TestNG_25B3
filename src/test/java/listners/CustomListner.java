package listners;

import org.testng.ITestListener;

public class CustomListner implements ITestListener {

    @Override
    public void onTestStart(org.testng.ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(org.testng.ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(org.testng.ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(org.testng.ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        System.out.println("All tests finished.");
    }
}
