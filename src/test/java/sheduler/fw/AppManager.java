package sheduler.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppManager {

    AppiumDriver driver;
    DesiredCapabilities capabilities;

    UserHelper user;

    public UserHelper user() {
        return user;
    }

    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","8.0.0");
        capabilities.setCapability("deviceName","qa14_mob");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","com.example.svetlana.scheduler");
        capabilities.setCapability("app","C:/Projects/Android/v.0.0.3.apk");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        user = new UserHelper(driver);
    }

    public void stop() {
        driver.quit();
    }
}
