package sheduler.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sheduler.models.User;

public class LoginTests extends TestBase {
    @Test
    public void loginPositiveTest(){
       app.user().login(new User().setEmail("koko@gmail.com").setPassword("123456789Rfnz"));
       app.user().hideKeyboard();
       app.user().isLoginPresent();
    }


}
