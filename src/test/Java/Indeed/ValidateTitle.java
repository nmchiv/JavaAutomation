package Indeed;

import org.testng.annotations.BeforeTest;
import resources.base;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;

public class ValidateTitle extends base {

    @BeforeTest
    public void initialize() throws IOException
    {
        driver = initializeDriver();
        driver.get("http://www.indeed.com");
    }

    @AfterTest
    public void CloseTest()
    {
        driver.close();
    }

    @Test

    public void VerifyHomePage() throws IOException
    {
        LandingPage l = new LandingPage(driver);
        Assert.assertEquals(l.getScript().getText(), "Indeed helps people get jobs:");

    }


}
