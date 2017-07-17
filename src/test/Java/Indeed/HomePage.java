package Indeed;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import resources.base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.io.IOException;

public class HomePage extends base {

    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        driver.get("http://www.indeed.com");
    }

    @AfterTest
    public void CloseTest()
    {
        driver.close();
    }

    @Test(dataProvider = "getData")

    public void BasePageNavigation(String Username, String Password) throws IOException
    {

        LandingPage l = new LandingPage(driver);
        l.getLogin().click();
        LoginPage lp = new LoginPage(driver);
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
