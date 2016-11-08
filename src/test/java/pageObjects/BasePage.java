package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Tests.Registration.driver;

/**
 * Created by jack.forman on 16/10/2016.
 */
abstract class BasePage {

   private WebDriverWait wait = new WebDriverWait(driver, 20);

    void waitAndClick(By selector){
        WebElement element = driver.findElement(selector);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    WebElement waitUntilClickable(By selector){
        WebElement element = driver.findElement(selector);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    boolean elementIsVisible(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (ElementNotVisibleException e){
            return false;
        }
    }

    void findAndType(By elementSelector, String inputString){
        WebElement element =  driver.findElement(elementSelector);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(inputString);
    }

}
