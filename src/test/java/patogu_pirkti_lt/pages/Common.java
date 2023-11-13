package patogu_pirkti_lt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import patogu_pirkti_lt.utilities.Driver;

import java.time.Duration;
import java.util.List;

public class Common {
    public static void setUpChrome() {
        Driver.setChromeDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }


    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static void waitElementWhenVisible(By locator, int seconds) throws TimeoutException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitElementToClick(By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    private static Actions getActions() {
        return new Actions(Driver.getDriver());
    }

    public static void clickWithActions(By locator) {
        getActions()
                .moveToElement(getElement(locator))
                .click()
                .perform();
    }
}
