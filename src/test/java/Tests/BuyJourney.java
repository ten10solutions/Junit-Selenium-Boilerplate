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

    /** Add product to Cart from homepage
     * Select product from homepage
     * Enter Quantity
     * Enter Size
     * Click Add to cart
     * Click continue shopping on pop-up
     * Navigate to shopping cart
     * Verify item added
     */
    @Test
    public void navigateToBasket() {
//        assertTrue(homepage.isDisplayed());
//        homepage.navigateToBasket();
//        assertTrue(basketpage.isDisplayed());
    }
}
