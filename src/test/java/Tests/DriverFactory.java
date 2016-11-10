package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class DriverFactory {

    public WebDriver driver;
    public Properties properties;

    public WebDriver getDriver(){
        return driver;
    }

    public WebDriver setDriver() throws IOException {
        properties = loadDriverConfig();
        System.setProperty("webdriver.chrome.driver", properties.getProperty("chromeDriverLocation"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    private Properties loadDriverConfig() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(
                "drivers.properties");
        properties.load(inputStream);
        return properties;
    }
}
