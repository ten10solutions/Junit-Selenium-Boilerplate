package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;
//import static Tests.Registration.driver;

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
    private By MY_ACCOUNT_BUTTON = By.cssSelector("a#nav-link-yourAccount");

    public void goTo() {
        driver.navigate().to("https://www.amazon.co.uk/");
    }

    public boolean isDisplayed(){
       return elementIsVisible(driver.findElement(HOMEPAGE_CAROUSELL));
    }

    public void navigateToBasket(){
        waitAndClick(VIEW_BASKET_BUTTON);
    }

    public void navigateToMyAccount(){
        waitAndClick(MY_ACCOUNT_BUTTON);
    }

}
