package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndeedResume {

    public WebDriver driver;

    By irHeader = By.cssSelector("#container>div>div.splash-page>div.page-content>div>div:nth-child(1)>div:nth-child(1)>div>h2");



    public WebElement getIRHeader() { return driver.findElement(irHeader); }




    public IndeedResume(WebDriver driver) { this.driver = driver; }
}
