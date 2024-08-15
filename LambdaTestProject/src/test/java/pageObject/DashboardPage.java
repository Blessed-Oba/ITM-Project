package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DashboardPage {

    public WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement landingPageUsernameField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement landingPagePasswordField;

    @FindBy(xpath = "//button[contains(text(), 'Submit')]")
    public WebElement landingPageSubmitButtonField;

    @FindBy(xpath = "//div[contains(text(), 'Invalid username or password')]")
    public WebElement landingPageWarningMsg;

    @FindBy(xpath = "//h2[contains(text(),'Are you a Student, Teacher, Professional, Property')]")
    private WebElement homepageIntroWordings;

    @FindBy(xpath = "//app-home//div//header[@class='landing-nav-header']//button[@type='submit'][normalize-space()='Login']")
    private WebElement loginButtonInBlue;

    @FindBy(xpath = "//*[@id=\"emailAddress\"]")
    private WebElement userLoginEmailAddressField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement userLoginPasswordField;

    @FindBy(xpath = "//select[@class='form-select form-select-lg mb-3 ng-untouched ng-pristine ng-invalid']")
    private WebElement studentAccountType;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement userLoginButton;

    @FindBy(xpath = "//li[normalize-space()='Connections']")
    private WebElement ConnectionTabOnDashboardPage;

    @FindBy(xpath = "//p[@class='lead']")
    private WebElement homePageWelcomeWordings;

    @FindBy(xpath = "//div[contains(text(), 'User does not exist')]")
    public WebElement userLoginPageWarningMsg;








    public void landingPageLoginDetails(String username, String password ){
        landingPageUsernameField.sendKeys(username);
        landingPagePasswordField.sendKeys(password);
        landingPageSubmitButtonField.click();
    }

    public void verifyingHomePageIntroWordings(){
        Assert.assertTrue(homepageIntroWordings.isDisplayed(),"Wording is not displayed");
    }
    public void clickLoginButtonInBlue(){
        loginButtonInBlue.click();
    }

    public void User1loginCredentials(String accountType, String emailAddress, String password){
        new Select(studentAccountType).selectByVisibleText(accountType);
        userLoginEmailAddressField.sendKeys(emailAddress);
        userLoginPasswordField.sendKeys(password);
    }
    public void clickUserLoginButton(){
        userLoginButton.click();
    }

    public void varyingConnectionTabOnDashboard(){
//        Assert.assertTrue(ConnectionTabOnDashboardPage.isDisplayed(), "Connection Tab is not visible on the dashboard page");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
        WebElement connectionsTabOnDashboardPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Connections']")));
        Assert.assertTrue(connectionsTabOnDashboardPage.isDisplayed(),"Connection Tab is not visible on the dashboard page");
    }

    public void verifyHomePageWelcomeWordings(){
        Assert.assertTrue(homePageWelcomeWordings.isDisplayed(),"Wording is not displayed");
    }

}
