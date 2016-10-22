package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;
//import static Tests.Sprint1.driver;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class HomePage extends BasePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By HOMEPAGE_CAROUSELL = By.cssSelector("div#anonCarousel1");
    private static final By VIEW_BASKET_BUTTON = By.cssSelector("span.nav-cart-icon");

    public void isDisplayed(){
        assertTrue(elementIsVisible(driver.findElement(HOMEPAGE_CAROUSELL)));
    }

    public void navigateToBasket(){
        waitAndClick(driver.findElement(VIEW_BASKET_BUTTON));
    }

}
