package Indeed.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

    public WebDriver driver;
    public WebDriver initializeDriver() throws IOException
    {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\nitaya\\Desktop\\Java Projects\\IndeedAutoMaven\\src\\main\\java\\Indeed\\resources\\data.properties");

        prop.load((fis));
        String browserName = prop.getProperty(("browser"));

        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:/Users/nitaya/Downloads/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();

        }
        else if (browserName.equals("ie"))
        {
            System.setProperty("webdriver.ie.driver", "C:\\Users\\nitaya\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer");
            driver = new InternetExplorerDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }
}
