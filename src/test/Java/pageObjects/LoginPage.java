package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;

public class LoginPage {

    public WebDriver driver;
    public Properties prop;

    By email = By.id("signin_email");
    By password = By.id("signin_password");
    By loginBtn = By.cssSelector("#loginform > button");


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage(Properties prop)
    {
        this.prop = prop;
    }

    public WebElement getEmail()
    {
        return driver.findElement(email);
    }

    public WebElement getPassword()
    {
        return driver.findElement(password);
    }

    public WebElement getLoginBtn()
    {
        return driver.findElement(loginBtn);
    }



}