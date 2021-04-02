package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.ChromeDriverSet;

import java.time.Duration;

public class GoogleCloudPage {
    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    private WebDriver driver;

    public GoogleCloudPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private WebElement searchInput;

    public void openPage() {
        driver = ChromeDriverSet.getDriver();
        driver.get(HOMEPAGE_URL);
        driver.manage().window().maximize();
    }

    public void startSearchByKeyWords() {
        searchInput = driver.findElement(By.xpath("//input[@name='q']"));
        searchInput.click();
        searchInput.sendKeys("Google Cloud Platform Pricing Calculator");
        searchInput.submit();
    }

    public void chooseItemFromSearchResults() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='gsc-resultsbox-visible']")));
        driver.findElement(By.xpath("//div[@class='gs-title']/a/b[text()='Google Cloud Platform Pricing Calculator']")).click();
    }

    public void computeEngineClick() {
//        new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#mainForm")));
        driver.findElement(By.xpath("//*[text()='Compute Engine']")).click();
    }
}
