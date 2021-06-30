package sheduler.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sheduler.fw.AppManager;

import java.net.MalformedURLException;

public class TestBase {

    protected static AppManager app = new AppManager();

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        app.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        app.stop();
    }

}
