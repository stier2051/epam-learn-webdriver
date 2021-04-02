package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utility.ChromeDriverSet;

public class PastebinHomePage {

    private static final String HOMEPAGE_URL = "https://pastebin.com/";
    private WebDriver driver;

    public PastebinHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver = ChromeDriverSet.getDriver();
        driver.get(HOMEPAGE_URL);
        driver.manage().window().maximize();
    }

    public void pasteCode(String code) {
        WebElement textarea = driver.findElement(By.xpath("//textarea[@id='postform-text']"));
        textarea.sendKeys(code);
    }

    public void syntaxHighlighting() {
        WebElement syntaxHighlighting = driver.findElement(By.xpath("//*[@id='select2-postform-format-container']"));
        syntaxHighlighting.click();
        WebElement optionBash = driver.findElement(By.xpath("//li[text()='Bash']"));
        optionBash.click();
    }

    public void pasteExpiration() {
        WebElement expirationDropDown = driver.findElement(By.xpath("//span[@id='select2-postform-expiration-container']"));
        expirationDropDown.click();
        WebElement option10m = driver.findElement(By.xpath("//li[text()='10 Minutes']"));
        option10m.click();
    }

    public void pasteName(String name) {
        WebElement nameInput = driver.findElement(By.xpath("//input[@id = 'postform-name']"));
        nameInput.sendKeys(name);
    }

    public void clickCreateNewPaste() {
        WebElement searchBtn = driver.findElement(By.xpath("//*[text()='Create New Paste']"));
        searchBtn.click();
    }

    public void closePage() {
        driver.quit();
    }
}
