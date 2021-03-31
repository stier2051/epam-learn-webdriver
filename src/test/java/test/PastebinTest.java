package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.PastebinHomePage;
import utility.ChromeDriverSet;

public class PastebinTest {

    private WebDriver driver;

    @Test
    public void createNewPaste() throws InterruptedException {
        PastebinHomePage page = new PastebinHomePage(driver);
        page.openPage();
        page.pasteCode("Hello from WebDriver");
        page.pasteName("helloweb");
        page.clickCreateNewPaste();
        page.closePage();
    }
}
