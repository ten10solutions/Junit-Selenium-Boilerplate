package Tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import pageObjects.BasketPage;
import pageObjects.HomePage;
import pageObjects.SignInPage;

import static junit.framework.TestCase.assertTrue;
import static Tests.TestSuite.driverFactory;


/**
 * Created by jack.forman on 09/10/2016.
 */


public class Registration {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private BasketPage basketpage = new BasketPage(driver);
    private SignInPage signInPage = new SignInPage(driver);


    @BeforeClass
    public static void setUp(){
        if (driver == null){
            driver = driverFactory.setDriver();
        }

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
     * Navigate to signIn Page
     * Enter E-Mail Address
     * Click Create New Account
     * Fill in All Details on registration form
     * Click Register
     * Check My Account Page is Displayed
     */
    @Test
    public void registerAsNewUser(){
        homepage.navigateToSignInPage();
        signInPage.enterNewAccountEmailAddress();
        signInPage.clickCreateAnAccount();

    }

    /** Cannot register if user Already Registered
     * Pre-Conditions - Must have Email address of user already registered
     * Navigate to Sign In Screen
     * Enter E mail Address
     * Click Create Account
     * Verify error message displayed
     */


    @After
    public void individualTearDown(){

    }


}
