package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PastebinHomePage {

    private static final String HOMEPAGE_URL = "https://pastebin.com/";
    private WebDriver driver;

    @FindBy (xpath = "//textarea[@id='postform-text']")
    private WebElement textarea;

    @FindBy (xpath = "//*[@id='select2-postform-format-container']")
    private WebElement syntaxHighlighting;

    @FindBy (xpath = "//li[text()='Bash']")
    private WebElement optionBash;

    @FindBy (xpath = "//span[@id='select2-postform-expiration-container']")
    private WebElement expirationDropDown;

    @FindBy (xpath = "//li[text()='10 Minutes']")
    private WebElement option10m;

    @FindBy (xpath = "//input[@id = 'postform-name']")
    private WebElement nameInput;

    @FindBy (xpath = "//*[text()='Create New Paste']")
    private WebElement searchBtn;

    @FindBy (xpath = "//span[@class='kw2']")
    private WebElement textColor;

    @FindBy (xpath = "//textarea")
    private WebElement textareaAfterPost;

    public PastebinHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PastebinHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        driver.manage().window().maximize();
        return this;
    }

    public PastebinHomePage pasteCode(String code) {
        textarea.sendKeys(code);
        return this;
    }

    public PastebinHomePage syntaxHighlighting() {
        syntaxHighlighting.click();
        optionBash.click();
        return this;
    }

    public PastebinHomePage pasteExpiration() {
        expirationDropDown.click();
        option10m.click();
        return this;
    }

    public PastebinHomePage pasteName(String name) {
        nameInput.sendKeys(name);
        return this;
    }

    public PastebinHomePage clickCreateNewPaste() {
        searchBtn.click();
        return this;
    }

    public PastebinHomePage closePage() {
        driver.quit();
        return this;
    }

    public String getTextColor() {
        return textColor.getCssValue("color");
    }

    public String getValueFromTextareaAfterPost() {
        return textareaAfterPost.getAttribute("value");
    }
}
