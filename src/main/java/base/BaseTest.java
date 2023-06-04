package base;

import Utilities.Logs;
import listeners.SuiteListeners;
import listeners.TestListeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

@Listeners({SuiteListeners.class, TestListeners.class})

public class BaseTest {
    protected SoftAssert softAssert;
    protected final String regression = "regression";
    protected final String smoke = "smoke";

    @BeforeMethod(alwaysRun = true)
    public void setUpMaster() {
        softAssert = new SoftAssert();
        Logs.info("SetUp Master");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownMaster() {
        Logs.info("teardown Master");
    }
}
