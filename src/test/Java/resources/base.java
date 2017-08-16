package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pageObjects.LandingPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

    public Properties prop;
    public WebDriver driver;


    public WebDriver initializeDriver() throws IOException
    {
        Properties prop = new Properties();
//        FileInputStream fis = new FileInputStream("C:\\Users\\nitaya\\Desktop\\Java Projects\\IndeedAutoMaven\\src\\main\\java\\Indeed\\resources\\data.properties");
        FileInputStream fis = new FileInputStream("C:\\Users\\i57197\\Desktop\\Automation Stuff\\Java\\JavaAutomation\\src\\test\\java\\resources\\data.properties");
        prop.load((fis));

        String browserName = prop.getProperty(("browser"));
        String userComputer = prop.getProperty("computer");
        String goToUrl = prop.getProperty("url");

        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\Java\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browserName.equals("ie"))
        {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\Java\\Driver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }

    public void tearDown()
    {
        if(this.driver != null)
        {
            this.driver.quit();
        }
    }


//    @BeforeSuite
//    public void Initialize() throws IOException {
//        driver = initializeDriver();
//        driver.get("http:www.indeed.com");
//    }
//
//    @AfterSuite
//    public void CloseWindows()
//    {
//        driver.close();
//    }
}
