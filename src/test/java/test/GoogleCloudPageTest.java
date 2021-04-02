package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page.GoogleCloudPage;

public class GoogleCloudPageTest {
    private WebDriver driver;

    @Test
    public void hurtMePlenty() throws InterruptedException {
        GoogleCloudPage googleCloudPage = new GoogleCloudPage(driver);
        googleCloudPage.openPage();
        googleCloudPage.startSearchByKeyWords();
        googleCloudPage.chooseItemFromSearchResults();
        Thread.sleep(5000);
        googleCloudPage.computeEngineClick();
    }
}
