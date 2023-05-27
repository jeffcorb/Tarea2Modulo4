package testmvn;

import Utilities.Logs;
import base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTests extends BaseTest {
    @BeforeMethod
    public void setUp() {
        Logs.info("SetUp");
    }

    @Test
    public void firstTest() {
        Logs.info("Mi primer Test");
    }

    @Test
    public void secondTest() {
        Logs.info("Mi segundo Test");
    }

    @AfterMethod
    public void tearDown() {
        Logs.info("teardown");
    }
}
