package Indeed;

import org.apache.bcel.generic.LAND;
import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.*;
import resources.base;

import java.io.IOException;

public class HomePage extends base {

    @BeforeTest
    public void Initialize() throws IOException {
        driver = initializeDriver();
        driver.get("http:www.indeed.com");
    }

    @AfterMethod
    public void afterTestMethod()
    {
        driver.get("http:www.indeed.com");
    }

    @AfterTest
    public void CloseWindows()
    {
        driver.close();
    }

    //    Test Start

    @Test
    public void VerifyLandingPage() throws IOException
    {
        LandingPage l = new LandingPage(driver);
        Assert.assertEquals(l.getScript().getText(), "Indeed helps people get jobs: Over 10 million stories shared");
    }

//    @Test
//
//    public void verifyFindJobsPageLink()
//    {
//        LandingPage l = new LandingPage(driver);
//    }

    @Test
    public void verifyCompanyReviewPageLink()
    {
        LandingPage l = new LandingPage(driver);
        CompanyReviews cr = new CompanyReviews(driver);
        l.getCompanyReviews().click();
        Assert.assertEquals("Find great places to work", cr.getcrHeader().getText());
    }

    @Test
    public void verifyFindSalariesLink()
    {
        LandingPage l = new LandingPage(driver);
        FindSalaries fs = new FindSalaries(driver);
        l.getFindSalaries().click();
        Assert.assertEquals("Search and compare salaries", fs.getfsHeader().getText() );
    }

    @Test
    public void verifyFindResumesLink()
    {
        LandingPage l = new LandingPage(driver);
        FindResumes fr = new FindResumes(driver);
        l.getFindResumes().click();
        Assert.assertEquals("Fast, simple resume search.", fr.getfrHeader().getText() );
    }

    @Test
    public void verifyPostAResumeLink()
    {
        LandingPage l = new LandingPage(driver);
        PostAJob p = new PostAJob(driver);
        l.getPostAJob().click();
        Assert.assertEquals("Your next hire is here.", p.getPostAJobHeader().getText());
    }

    @Test
    public void VerifyNavUploadResumeLink()
    {
        LandingPage l = new LandingPage(driver);
        IndeedResume ir = new IndeedResume(driver);
        l.getNavResumeUpdate().click();
        Assert.assertEquals("Create an Indeed Resume", ir.getIRHeader().getText());
    }

    @Test
    public void VerifyUploadResumeLinkInBody()
    {
        LandingPage l = new LandingPage(driver);
        IndeedResume ir = new IndeedResume(driver);
        l.getResumeUpdate().click();
        Assert.assertEquals("Create an Indeed Resume", ir.getIRHeader().getText());
    }

    @Test
    public void verifySpanishLink()
    {
        LandingPage l = new LandingPage(driver);
        l.getLanguageChange().click();
        Assert.assertEquals("Indeed ayuda a la gente a encontrar empleo: Más de 1,8 millones de historias compartidas", l.getScript().getText());

    }

    //      Test End
}
