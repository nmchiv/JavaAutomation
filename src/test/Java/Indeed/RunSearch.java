package Indeed;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import resources.base;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.ResultsPage;

public class RunSearch extends base {

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
        Assert.assertEquals(r.getResultsTitle(), "software tester jobs in Salt Lake City, UT");
    }
}
