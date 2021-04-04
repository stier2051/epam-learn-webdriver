package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.PastebinHomePage;
import utility.WaitUtil;

public class PastebinHomePageTest extends BaseTest {

    private String code = "git config --global user.name  \"New Sheriff in Town\"" + System.lineSeparator() +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")" + System.lineSeparator() +
            "git push origin master --force";

    @Test
    public void iCanWin() {
        PastebinHomePage page = new PastebinHomePage(driver)
                .openPage()
                .pasteCode("Hello from WebDriver")
                .pasteExpiration()
                .pasteName("helloweb")
                .clickCreateNewPaste()
                .closePage();
    }

    @Test
    public void bringItOn() {
        PastebinHomePage page = new PastebinHomePage(driver)
                .openPage()
                .pasteCode(code)
                .syntaxHighlighting()
                .pasteExpiration()
                .pasteName("how to gain dominance among developers")
                .clickCreateNewPaste();

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='post-view']")));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getTitle().equals("how to gain dominance among developers - Pastebin.com"));
        softAssert.assertTrue(page.getTextColor().equals("rgba(194, 12, 185, 1)"));
        softAssert.assertTrue(page.getValueFromTextareaAfterPost().equals(code));
        page.closePage();
    }
}
