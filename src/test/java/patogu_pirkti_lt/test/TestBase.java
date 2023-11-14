package patogu_pirkti_lt.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import patogu_pirkti_lt.pages.Common;
import patogu_pirkti_lt.utilities.TestListener;

@Listeners(TestListener.class)
public abstract class TestBase {

    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown() {
//        Common.quitDriver();
    }
}
