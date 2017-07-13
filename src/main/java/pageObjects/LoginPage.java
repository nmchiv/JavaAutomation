package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    By email = By.id("signin_email");
    By password = By.id("signin_password");
    By loginBtn = By.cssSelector("#loginform > button");


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
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