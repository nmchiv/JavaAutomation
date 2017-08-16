package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.base;

public class ResultsPage extends base {

    public WebDriver driver;

    By resultsTitle = By.xpath("//*[@id=\"tjobalertlabel\"]/b");
    By closePopover = By.id("prime-popover-close-button");



    public ResultsPage(WebDriver driver) { this.driver = driver; }



    public WebElement getResultsTitle() { return driver.findElement(resultsTitle); }

    public WebElement toClosePopover() { return driver.findElement(closePopover);  }
}
