package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    By signin = By.id("userOptionsLabel");
    By expectedScript = By.className("gaj_heading");
    By navBar = By.id("p_nav");
    By whatJob = By.id("what");
    By whereJob = By.id("where");
    By submitBtn = By.id("fj");



    public LandingPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement getLogin()
    {
        return driver.findElement(signin);
    }

    public WebElement getScript()
    {
        return driver.findElement(expectedScript);
    }

    public WebElement getNavBar() { return driver.findElement(navBar); }

    public WebElement getWhatJob() { return driver.findElement(whatJob); }

    public WebElement getWhereJob() { return driver.findElement(whereJob); }

    public WebElement getSubmitBtn() { return driver.findElement(submitBtn);}
}
