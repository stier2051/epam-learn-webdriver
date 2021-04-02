package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

    public static void waitUntilBeVisible(WebElement webElement, int timeout) {
        new WebDriverWait(ChromeDriverSet.getDriver(), timeout)
                .until(ExpectedConditions.visibilityOf(webElement));
    }
}
