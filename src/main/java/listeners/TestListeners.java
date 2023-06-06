package listeners;

import Utilities.Logs;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        Logs.info("on test start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Logs.info("on test success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Logs.info("on test failure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Logs.info("on test skipped");
    }
}
