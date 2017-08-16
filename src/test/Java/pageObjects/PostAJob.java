package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostAJob {

    public WebDriver driver;


    By postAJobHeader = By.cssSelector("#index-jan15>div:nth-child(2)>div>div>div>h1");



    public WebElement getPostAJobHeader() { return driver.findElement(postAJobHeader); }






    public PostAJob (WebDriver driver) { this.driver = driver; }

}
