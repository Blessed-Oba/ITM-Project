package stepDefinitions;

import CucumberManager.BasePageHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObject.DashboardPage;

public class LandingPageStepDefinitions {

    public static WebDriver driver;

    public BasePageHooks basePageHooks;

    public DashboardPage dashboardPage;

    public LandingPageStepDefinitions(){
        driver = new ChromeDriver();
        dashboardPage = new DashboardPage(driver);
        basePageHooks = new BasePageHooks(driver);
    }


    @Given("I navigate to collabtoolz url")
    public void iNavigateToCollabtoolzUrl() {
        basePageHooks.goToCollabToolzUrl();
    }

    @And("I enter username {string}")
    public void iEnterUsername(String username) {
        dashboardPage.landingPageUsernameField.sendKeys(username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        dashboardPage.landingPagePasswordField.sendKeys(password);
    }

    @When("I click on the submit button on the landing page")
    public void iClickOnTheSubmitButtonOnTheLandingPage() {
        dashboardPage.landingPageSubmitButtonField.click();
    }

    @Then("a warning message should be displayed, {string}")
    public void aWarningMessageShouldBeDisplayed(String warningMessage) {
        Assert.assertEquals(warningMessage, dashboardPage.landingPageWarningMsg.getText());
    }
}
