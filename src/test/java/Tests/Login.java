package Tests;

import org.openqa.selenium.WebDriver;
import pageObjects.BasketPage;
import pageObjects.HomePage;

import static Tests.TestSuite.driverFactory;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class Login {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private BasketPage basketpage = new BasketPage(driver);
}
