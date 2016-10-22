package pageObjects;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static stepDefs.Sprint1.driver;

/**
 * Created by jack.forman on 16/10/2016.
 */
abstract class BasePage {

   private WebDriverWait wait = new WebDriverWait(driver, 20);

    void waitAndClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    boolean elementIsVisible(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (ElementNotVisibleException e){
            return false;
        }
    }

}
