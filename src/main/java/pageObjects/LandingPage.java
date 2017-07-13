package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    By signin = By.id("userOptionsLabel");
    By expectedScript = By.className("gaj_heading");
    By navBar = By.id("p_nav");



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

    public WebElement getNavBar()
    {
        return driver.findElement(navBar);
    }
}
