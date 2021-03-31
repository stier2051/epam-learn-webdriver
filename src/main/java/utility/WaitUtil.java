package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

    public static void waitUntilBeVisible(WebElement webElement, int timeout) {
        Wait wait = new WebDriverWait(ChromeDriverSet.getDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
