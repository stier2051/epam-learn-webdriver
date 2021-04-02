package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.PastebinHomePage;

public class PastebinHomePageTest {

    private WebDriver driver;
    private String code = "git config --global user.name  \"New Sheriff in Town\"" + System.lineSeparator() +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")" + System.lineSeparator() +
            "git push origin master --force";

    @Test
    public void iCanWin() {
        PastebinHomePage page = new PastebinHomePage(driver);
        page.openPage();
        page.pasteCode("Hello from WebDriver");
        page.pasteExpiration();
        page.pasteName("helloweb");
        page.clickCreateNewPaste();
        new WebDriverWait(driver, 10);
        page.closePage();
    }

    @Test
    public void bringItOn() {
        PastebinHomePage page = new PastebinHomePage(driver);
        page.openPage();
        page.pasteCode(code);
        page.syntaxHighlighting();
        page.pasteExpiration();
        page.pasteName("how to gain dominance among developers");
        page.clickCreateNewPaste();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='post-view']")));

//        Assert.assertEquals(driver.getTitle(), "how to gain dominance among developers - Pastebin.com");
//        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='kw2']")).getCssValue("color"), "#c20cb9");
//        Assert.assertEquals(code, driver.findElement(By.xpath("//textarea/text()")).getText());
        page.closePage();
    }
}
