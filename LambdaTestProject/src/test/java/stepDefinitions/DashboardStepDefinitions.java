package stepDefinitions;

import CucumberManager.BasePageHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObject.DashboardPage;

import java.util.concurrent.TimeUnit;

public class DashboardStepDefinitions {
    public static WebDriver driver;

    DashboardPage dashboardPage;

    BasePageHooks basePageHooks;

    public DashboardStepDefinitions(){
//        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        dashboardPage = new DashboardPage(driver);
        basePageHooks = new BasePageHooks(driver);
    }

    @Given("I am on the home page with login details {string} {string}")
    public void iAmOnTheHomePageWithLoginDetails(String username, String password) {
//        driver.get("https://test.rcs-ct.com");
//        driver.manage().window().maximize();
        basePageHooks.goToCollabToolzUrl();
        dashboardPage.landingPageLoginDetails(username, password);
        dashboardPage.verifyingHomePageIntroWordings();}

    @And("I select the login button in blue")
    public void iSelectTheLoginButtonInBlue() {
        dashboardPage.clickLoginButtonInBlue();
    }

    @And("I entered the credentials {string} {string} {string}")
    public void iEnteredTheCredentials(String accountType, String emailAddress, String password) {
        dashboardPage.User1loginCredentials(accountType, emailAddress, password);
    }
    @When("I click on the user login button")
    public void iClickOnTheUserLoginButton() {
        dashboardPage.clickUserLoginButton();
    }

    @Then("I should be able access the dashboard")
    public void iShouldBeAbleAccessTheDashboard() {
        dashboardPage.varyingConnectionTabOnDashboard();
        dashboardPage.verifyingHomePageIntroWordings();
        //        driver.quit();
        basePageHooks.closeBrowser();
    }

    @Then("a warning message should popup")
    public void aWarningMessageShouldPopup() {
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(dashboardPage.userLoginPageWarningMsg.isDisplayed(), "Pop up not displayed/or Locator used is incorrect");
        basePageHooks.closeBrowser();
    }
}
