package sheduler.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import sheduler.models.User;

public class UserHelper extends HelperBase{

    public UserHelper(AppiumDriver driver) {
        super(driver);
    }

    public void login(User user){
        type(By.id("log_email_input"), user.getEmail());
        type(By.id("log_password_input"), user.getPassword());
        hideKeyboard();
        tap(By.id("login_btn"));
    }
}
