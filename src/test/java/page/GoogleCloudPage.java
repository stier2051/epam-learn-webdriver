package page;

import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class GoogleCloudPage {
    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    private WebDriver driver;

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@class='gs-title']/a/b[text()='Google Cloud Platform Pricing Calculator']")
    private WebElement pricingCalculator;

    @FindBy(xpath = "//md-tab-item[1]")
    private WebElement itemComputeEngine;

    @FindBy(xpath = "//input[@id='input_65']")
    private WebElement numberOfInstancesField;

    @FindBy(xpath = "//md-select[@id='select_78']")
    private WebElement operatingSystemField;

    @FindBy(xpath = "//md-option[@id='select_option_67']")
    private WebElement debianSelect;

    @FindBy(xpath = "//md-select[@id='select_82']")
    private WebElement machineClassField;

    @FindBy(xpath = "//md-option[@id='select_option_80']")
    private WebElement regularSelect;

    @FindBy(xpath = "//md-select[@id='select_90']")
    private WebElement seriesField;

    @FindBy(xpath = "//md-option[@id='select_option_190']")
    private WebElement n1Select;

    @FindBy(xpath = "//md-select[@id='select_92']")
    private WebElement machineTypeField;

    @FindBy(xpath = "//md-option[@id='select_option_365']")
    private WebElement n1Standard8Select;

    @FindBy(xpath = "(//md-checkbox)[1]")
    private WebElement checkAddGPU;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_397']")
    private WebElement numberOfGPUsField;

    @FindBy(xpath = "//md-option[@id='select_option_404']")
    private WebElement numberOfGPUsSelect;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_398']")
    private WebElement gpusTypeField;

    @FindBy(xpath = "//md-option[@id='select_option_411']")
    private WebElement gpusTypeSelect;

    @FindBy(xpath = "//md-select[@id='select_360']")
    private WebElement localSSDField;

    @FindBy(xpath = "//md-option[@id='select_option_386']")
    private WebElement localSSDSelect;

    @FindBy(xpath = "//md-select[@id='select_94']")
    private WebElement dataCenterLocationField;

    @FindBy(xpath = "//md-option[@id='select_option_207']")
    private WebElement frankfurtSelect;

    @FindBy(xpath = "//md-select[@id='select_101']")
    private WebElement committedUsageField;

    @FindBy(xpath = "//md-option[@id='select_option_99']")
    private WebElement oneYearSelect;

    @FindBy(xpath = "(//button[contains(text(),'Add to Estimate')])[1]")
    private WebElement addToEstimateButton;

    @FindBy(xpath = "//md-list-item")
    private List<WebElement> resultItemsList;

    @FindBy(xpath = "//button[contains(text(),'Email Estimate')]")
    private WebElement emailEstimateButton;

    @FindBy(xpath = "//div[@class='gsc-resultsbox-visible']")
    private WebElement resultsOfSearch;

    @FindBy(xpath = "//md-card-content[@id='mainForm']")
    private WebElement calculatorForm;

    @FindBy(xpath = "//div[@id='select_container_79']")
    private WebElement operatingSystemDropDown;

    @FindBy(xpath = "//div[@id='select_container_83']")
    private WebElement machineClassDropDown;

    @FindBy(xpath = "//div[@id='select_container_91']")
    private WebElement seriesDropDown;

    @FindBy(xpath = "//div[@id='select_container_93']")
    private WebElement machineTypeDropDown;

    @FindBy(xpath = "//div[@id='select_container_400']")
    private WebElement numberOfGPUsDropDown;

    @FindBy(xpath = "//div[@id='select_container_402']")
    private WebElement gpusTypeDropDown;

    @FindBy(xpath = "//div[@id='select_container_361']")
    private WebElement localSSDDropDown;

    @FindBy(xpath = "//div[@id='select_container_95']")
    private WebElement dataCenterLocationDropDown;

    @FindBy(xpath = "//div[@id='select_container_102']")
    private WebElement committedUsageDropDown;

    @FindBy(xpath = "//md-card-content[@id='resultBlock']")
    private WebElement resultBlock;

    public GoogleCloudPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public GoogleCloudPage openPage() {
        driver.get(HOMEPAGE_URL);
        driver.manage().window().maximize();
        return this;
    }

    public GoogleCloudPage startSearchByKeyWords() {
        searchInput.click();
        searchInput.sendKeys("Google Cloud Platform Pricing Calculator");
        searchInput.submit();
        return this;
    }

    public GoogleCloudPage chooseItemFromSearchResults() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOf(resultsOfSearch));
        pricingCalculator.click();
        return this;
    }

    public GoogleCloudPage computeEngineClick() {

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(calculatorForm));
        itemComputeEngine.click();
        return this;
    }

    public GoogleCloudPage fillCalculatorForm() {
        numberOfInstancesField.sendKeys("4");
        operatingSystemField.click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(operatingSystemDropDown));
        debianSelect.click();
        machineClassField.click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(machineClassDropDown));
        regularSelect.click();
        seriesField.click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(seriesDropDown));
        n1Select.click();
        machineTypeField.click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(machineTypeDropDown));
        n1Standard8Select.click();
        checkAddGPU.click();
        numberOfGPUsField.click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(numberOfGPUsDropDown));
        numberOfGPUsSelect.click();
        gpusTypeField.click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(gpusTypeDropDown));
        gpusTypeSelect.click();
        localSSDField.click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(localSSDDropDown));
        localSSDSelect.click();
        dataCenterLocationField.click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(dataCenterLocationDropDown));
        frankfurtSelect.click();
        committedUsageField.click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(committedUsageDropDown));
        oneYearSelect.click();
        addToEstimateButton.click();
        return this;
    }

    public GoogleCloudPage emailEstimateButtonClick() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(resultBlock));
        emailEstimateButton.click();
        return this;
    }

    public List<String> resultsOfEstimation() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(resultBlock));
        List<String> resultItemListText = new ArrayList<>();
        for(WebElement element : resultItemsList) {
            resultItemListText.add(element.getText());
        }
        return resultItemListText;
    }

    public GoogleCloudPage closePage() {
        driver.quit();
        return this;
    }

    public void openNewTabForTempEmail() {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://10minutemail.com ");
    }
}
