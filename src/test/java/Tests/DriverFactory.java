package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class DriverFactory {

    private WebDriver driver;

    public WebDriver getDriver(){
        if (driver == null) {
            setDriver();
        }
        return driver;
    }

    private void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

}
