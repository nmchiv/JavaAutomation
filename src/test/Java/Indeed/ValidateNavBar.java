package Indeed;

import org.testng.annotations.BeforeTest;
import resources.base;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;

public class ValidateNavBar extends base {

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

    @Test

    public void validateNavigationBar() throws IOException {

        LandingPage l = new LandingPage(driver);
//        Assert True means this the value is always there.
        Assert.assertTrue(l.getNavBar().isDisplayed());
        ;

    }


}
