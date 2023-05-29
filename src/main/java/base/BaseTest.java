package base;

import Utilities.Logs;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected SoftAssert softAssert;

    @BeforeMethod
    public void setUpMaster() {
        softAssert = new SoftAssert();
        Logs.info("SetUp Master");
    }

    @AfterMethod
    public void tearDownMaster() {
        Logs.info("teardown Master");
    }
}
