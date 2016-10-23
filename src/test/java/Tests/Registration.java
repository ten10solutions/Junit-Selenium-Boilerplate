package Tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import pageObjects.BasketPage;
import pageObjects.CreateNewAccountPage;
import pageObjects.HomePage;
import pageObjects.LogInPage;

import static junit.framework.TestCase.assertTrue;
import static Tests.TestSuite.driverFactory;


/**
 * Created by jack.forman on 09/10/2016.
 */


public class Registration {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private BasketPage basketpage = new BasketPage(driver);
    private LogInPage logInPage = new LogInPage(driver);
    private CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage(driver);


    @BeforeClass
    public static void setUp(){

    }


    /**
     * This should make sure we are on the correct page, i.e. set up each test case so we can be sure that they run
     */
    @Before
    public void individualSetUp(){
        homepage.goTo();
    }

    /**
     * New user is able to register (New = not registered before)
     * 1. New user fills in all details on registration page
     * 2. Clicks register
     * 3. Shown Homepage
     * 4. Details displayed on my account button
     * 5. Log in button not shown
     * 6. Log out button shown;
     */
    @Test
    public void registerAsNewUser(){
        assertTrue(homepage.isDisplayed());
        homepage.navigateToMyAccount();
        logInPage.createNewAccount();
        createNewAccountPage.fillInAllDetails();
    }


    /**
     * Register as an existing customer
     * 1. navigate to registration page
     * 2. fill in all details - test@gmail.com
     * 3. assert that already registered message is displayed
     */
    @Test
    public void registerAsAlreadyRegisteredUser(){

    }


    @After
    public void individualTearDown(){

    }


}
