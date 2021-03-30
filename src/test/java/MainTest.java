import org.openqa.selenium.WebDriver;

public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = ChromeDriverSet.getDriver();
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        driver.quit();
    }
}
