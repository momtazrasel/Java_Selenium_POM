package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReusableMethod {
    private WebDriver driver;
    private WebDriverWait wait;
    private int defaultWaitTime = 5;
    public ReusableMethod(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param locator
     */

    public void waitUntilElementIsVisible(By locator) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(defaultWaitTime));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    /**
     *
     * @param locator
     */
    public void clickElement(By locator) {
        waitUntilElementIsVisible(locator);
        driver.findElement(locator).click();
    }
}
