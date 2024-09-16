package Tests;

import org.junit.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pageObjects.ShoppingCartPage;
import pageObjects.CreateNewAccountPage;
import pageObjects.HomePage;
import pageObjects.SignInPage;

import static Tests.TestSuite.driverFactory;


/**
 * Created by jack.forman on 09/10/2016.
 */


public class Registration {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private ShoppingCartPage basketpage = new ShoppingCartPage(driver);
    private SignInPage signInPage = new SignInPage(driver);
    private CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage(driver);


    /**
     * This should make sure we are on the correct page, i.e. set up each test case so we can be sure that they run
     */
    @BeforeEach
    public void individualSetUp(){
        homepage.goTo();
    }


    /** Cannot register if user Already Registered
     * Pre-Conditions - Must have Email address of user already registered
     * Navigate to Sign In Screen
     * Enter E mail Address
     * Click Create Account
     * Verify error message displayed
     */
    @Test
    public void registerAlreadyRegistered(){
        homepage.navigateToSignInPage();
        signInPage.enterEmailAddress("test@test.com");
        signInPage.clickCreateAnAccount();
        signInPage.alreadyRegisteredAlertPresent();
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
    @Test @Disabled
    public void registerAsNewUser(){

    }




    @AfterEach
    public void individualTearDown(){

    }

    @AfterAll
    public static void mainTearDown(){
        // Uncomment this when just running individual tests in this file.
        //driver.quit();
    }


}
