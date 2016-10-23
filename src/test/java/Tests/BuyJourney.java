package Tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.BasketPage;
import pageObjects.HomePage;

import static Tests.TestSuite.driverFactory;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class BuyJourney {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private BasketPage basketpage = new BasketPage(driver);

    @Before
    public void individualSetUp(){
        homepage.goTo();
    }

    /**
     * Navigate to Basket
     * - Assert on Homepage
     * - Navigate to the basket page
     * - Assert basket page is displayed
     */
    @Test
    public void navigateToBasket() {
        assertTrue(homepage.isDisplayed());
        homepage.navigateToBasket();
        assertTrue(basketpage.isDisplayed());
    }
}
