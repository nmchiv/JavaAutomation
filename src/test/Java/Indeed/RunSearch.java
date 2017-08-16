package Indeed;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.Assertion;
import resources.base;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.ResultsPage;

import java.io.IOException;

public class RunSearch extends base {


    @BeforeTest
    public void Initialize() throws IOException {
        driver = initializeDriver();
        driver.get("http:www.indeed.com");
    }

    @AfterTest
    public void CloseWindows()
    {
        driver.close();
    }


    @Test
    public void SearchJobs()
    {
        LandingPage l = new LandingPage(driver);
        ResultsPage r = new ResultsPage(driver);
        l.getWhatJob().sendKeys("software tester");
        l.getWhereJob().clear();
        l.getWhereJob().sendKeys("SLC, UT");
        l.getSubmitBtn().click();
        r.toClosePopover().click();
        Assert.assertEquals("software tester jobs in SLC, UT", r.getResultsTitle().getText());
    }
}
