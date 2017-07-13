package Indeed;

import Indeed.resources.base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;

public class HomePage extends base {

    @Test

    public void BasePageNavigation() throws IOException {
        driver = initializeDriver();
        driver.get("http://www.indeed.com");
        LandingPage l = new LandingPage(driver);
        l.getLogin().click();
    }
//    Ended in section 190
}
