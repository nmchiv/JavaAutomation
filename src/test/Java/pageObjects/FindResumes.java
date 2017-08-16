package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindResumes {

    public WebDriver driver;


    By frHeader = By.id("tagline");



    public WebElement getfrHeader() { return driver.findElement(frHeader); }






    public FindResumes (WebDriver driver) { this.driver = driver; }

}
