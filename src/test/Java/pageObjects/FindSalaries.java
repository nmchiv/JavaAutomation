package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindSalaries {

    public WebDriver driver;

    By fsHeader = By.cssSelector("#cmp-salary-search>div");



    public WebElement getfsHeader() { return driver.findElement(fsHeader); }






    public FindSalaries(WebDriver driver) { this.driver = driver; }

}
