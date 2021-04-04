package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

    public void waitUntilBeVisible(WebDriver driver, WebElement webElement, int timeout) {
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilBePresence(WebDriver driver, int timeout, String xpath) {
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }
}
