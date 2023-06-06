package listeners;

import Utilities.Logs;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListeners implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        Logs.info("on suite starts");
    }

    @Override
    public void onFinish(ISuite suite) {
        Logs.info("on suite finish");
    }
}
