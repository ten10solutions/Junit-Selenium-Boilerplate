package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class DriverFactory {

    public WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    public WebDriver setDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jack.forman\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

}
