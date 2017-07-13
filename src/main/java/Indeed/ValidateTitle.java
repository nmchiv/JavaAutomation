package Indeed;

import resources.base;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;

public class ValidateTitle extends base {

    @AfterTest
    public void CloseTest()
    {
        driver.close();
    }

    @Test

    public void VerifyHomePage() throws IOException {
        driver = initializeDriver();
        driver.get("http://www.indeed.com");
        LandingPage l = new LandingPage(driver);
        Assert.assertEquals(l.getScript().getText(), "Indeed helps people get jobs:");

    }


}
