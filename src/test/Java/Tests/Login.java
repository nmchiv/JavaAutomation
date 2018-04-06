package Indeed;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import java.io.IOException;

public class Login extends base {

    @Test(dataProvider = "getData")

    public void BasePageNavigation(String Username, String Password) throws IOException
    {
        LandingPage l = new LandingPage(driver);
        LoginPage lp = new LoginPage(driver);
        l.getLogin().click();
        lp.getEmail().sendKeys(Username);
        lp.getPassword().sendKeys(Password);
        lp.getLoginBtn().click();
    }

    @DataProvider
    public Object[][] getData()
    {
//        Row stands for how many different data types test should run (first bracket)
//        Column stands for how many values in each test (second bracket)
        Object[][] data = new Object[1][2];

        data[0][0] = "nmchivautomation@gmail.com";
        data [0][1] = "automation1";

//        data[1][0] = "nmchivautomation+1@gmail.com";
//        data[1][1] = "wrongpassword";

        return data;
    }

}
