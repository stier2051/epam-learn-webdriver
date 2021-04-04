package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.GoogleCloudPage;
import utility.ChromeDriverSet;

import java.util.Arrays;
import java.util.List;

public class GoogleCloudPageTest extends BaseTest {

    private List<String> dataForCalculate = Arrays.asList(
            "2,920 total hours per month",
            "VM class: regular",
            "Instance type: n1-standard-8",
            "Region: Frankfurt",
            "Total available local SSD space 2x375 GiB",
            "Commitment term: 1 Year",
            "Estimated Component Cost: USD 1,082.77 per 1 month"
    );

    @Test
    public void hurtMePlenty() {
        GoogleCloudPage googleCloudPage = new GoogleCloudPage(ChromeDriverSet.getDriver());
        googleCloudPage
                .openPage()
                .startSearchByKeyWords()
                .chooseItemFromSearchResults()
                .computeEngineClick()
                .fillCalculatorForm();

        Assert.assertEquals(googleCloudPage.resultsOfEstimation(), dataForCalculate);

        googleCloudPage.closePage();
    }

    @Test
    public void hardcore() {
        GoogleCloudPage googleCloudPage = new GoogleCloudPage(ChromeDriverSet.getDriver());
        googleCloudPage
                .openPage()
                .startSearchByKeyWords()
                .chooseItemFromSearchResults();
        driver.switchTo().frame(0);
        driver.switchTo().frame("myFrame");
        googleCloudPage
                .computeEngineClick()
                .fillCalculatorForm()
                .emailEstimateButtonClick()
                .openNewTabForTempEmail();

//        Assert.assertEquals(googleCloudPage.resultsOfEstimation(), dataForCalculate);
    }
}
