package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.ChromeDriverSet;
import utility.WaitUtil;

public class PastebinHomePage {

    private static final String HOMEPAGE_URL = "https://pastebin.com";
    private WebDriver driver;

    public PastebinHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver = ChromeDriverSet.getDriver();
        driver.get(HOMEPAGE_URL);

    }

    public void pasteCode(String code) {
        WebElement searchTextArea = driver.findElement(By.xpath("//*[@id = 'postform-text']"));
        searchTextArea.sendKeys(code);
    }

    public void pasteExpiration() {

    }

    public void pasteName(String name) {
        WebElement searchInput = driver.findElement(By.xpath("//input[@id = 'postform-name']"));
        searchInput.sendKeys(name);
    }

    public void clickCreateNewPaste() {
        WebElement searchBtn = driver.findElement(By.xpath("//*[text()='Create New Paste']"));
        searchBtn.click();
    }

    public void closePage() {
        driver.quit();
    }
}
