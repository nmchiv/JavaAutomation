package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanyReviews {

    public WebDriver driver;

    By crHeader = By.cssSelector("#cmp-discovery-title-no-flag>a>p");
    By fsHeader = By.cssSelector("#cmp-salary-search>div");




    public WebElement getcrHeader() { return driver.findElement(crHeader); }
    public WebElement getfsHeader() { return driver.findElement(fsHeader); }






    public CompanyReviews (WebDriver driver) { this.driver = driver; }


}
