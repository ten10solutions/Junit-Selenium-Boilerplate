package stepDefs;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.BasketPage;
import pageObjects.HomePage;

import static junit.framework.TestCase.assertTrue;


/**
 * Created by jack.forman on 09/10/2016.
 */


public class Sprint1 {


    public static WebDriver driver;
    private HomePage homepage = new HomePage();
    private BasketPage basketpage = new BasketPage();

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jack.forman\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    /**
     * This should make sure we are on the correct page, i.e. set up each test case so we can be sure that they run
     */
    @Before
    public void individualSetUp(){
        driver.navigate().to("https://www.amazon.co.uk/");
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
    public void navigateToBasket() throws InterruptedException {
        homepage.isDisplayed();
        homepage.navigateToBasket();
        basketpage.isDisplayed();
    }


    @After
    public void individualTearDown(){

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
