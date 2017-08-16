package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;


    By signin = By.id("userOptionsLabel");
    By expectedScript = By.id("gajui");
    By navBar = By.id("p_nav");
    By whatJob = By.id("what");
    By whereJob = By.id("where");
    By submitBtn = By.id("fj");
    By companyReviews = By.cssSelector("#p_nav>span:nth-child(2)>a");
    By findSalaries = By.cssSelector("#p_nav>span:nth-child(3)");
    By findResumes = By.cssSelector("#p_nav>span:nth-child(4)");
    By postAJob = By.cssSelector("#p_nav>span:nth-child(5)");
    By navUploadResume = By.cssSelector("#navpromo>a");
    By UploadResume = By.cssSelector("#resPromoDisplay>a>b");
    By languageChange = By.cssSelector("#viewport>div.content>table>tbody>tr:nth-child(2)>td>p>a");



    public LandingPage(WebDriver driver) { this.driver = driver; }
    public WebElement getLogin() { return driver.findElement(signin); }
    public WebElement getScript() { return driver.findElement(expectedScript); }
    public WebElement getNavBar() { return driver.findElement(navBar); }
    public WebElement getWhatJob() { return driver.findElement(whatJob); }
    public WebElement getWhereJob() { return driver.findElement(whereJob); }
    public WebElement getSubmitBtn() { return driver.findElement(submitBtn);}
    public WebElement getCompanyReviews() { return driver.findElement(companyReviews); }
    public WebElement getFindSalaries() { return driver.findElement((findSalaries)); }
    public WebElement getFindResumes() { return driver.findElement((findResumes)); }
    public WebElement getPostAJob() { return driver.findElement(postAJob); }
    public WebElement getNavResumeUpdate() { return driver.findElement(navUploadResume); }
    public WebElement getResumeUpdate() { return driver.findElement(UploadResume); }
    public WebElement getLanguageChange() { return driver.findElement(languageChange); }
}
