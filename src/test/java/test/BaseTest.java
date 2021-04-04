package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import utility.ChromeDriverSet;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = ChromeDriverSet.getDriver();
    }
}
