package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObject.registrationPage;

public class registration {

    public static WebDriver driver;

    public registrationPage registrationPage;

    public registration() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        registrationPage = new registrationPage(driver);
    }

    @Given("I navigate to the form demo website")
    public void iNavigateToTheFormDemoWebsite() {
        driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
        driver.manage().window().maximize();
    }

    @And("I enter my full name")
    public void iEnterMyFullName() {
        //driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Blessed Oba");
        registrationPage.enterFullName();
    }

    @And("I enter a valid email address")
    public void iEnterAValidEmailAddress() {
        //driver.findElement(By.xpath("//*[@id=\"inputEmail4\"]")).sendKeys("great_man@gmail.com");
    //registrationPage.emailAddressField.sendKeys("great_man@gmail.com");
        registrationPage.enterEmailAddress();
    }

    @And("I enter a valid password")
    public void iEnterAValidPassword() {
        //driver.findElement(By.xpath("//*[@id=\"inputPassword4\"]")).sendKeys("@Success_77..$");
    registrationPage.enterPassword();
    }

    @And("I enter my company name")
    public void iEnterMyCompanyName() {
        //driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("TopPropatiX");
    registrationPage.enterCompanyName();
    }

    @And("I enter my company website address")
    public void iEnterMyCompanyWebsiteAddress() {
        //driver.findElement(By.xpath("//*[@id=\"websitename\"]")).sendKeys("http://www.toppropatix.com");
        registrationPage.enterCompanyWebsiteAddress();
    }

    @And("I select a country from the drop down list")
    public void iSelectACountryFromTheDropDownList() {
        //new Select(driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[3]/div[1]/select/option[237]")).isSelected();
        //new Select(driver.findElement(By.xpath("//select[@name='country']"))).selectByVisibleText("United Kingdom");
        //new Select(driver.findElement(By.xpath("//select[@name='country']"))).selectByVisibleText("United Kingdom");
        registrationPage.selectCountry();
    }

    @And("I enter my city")
    public void iEnterMyCity() {
        //driver.findElement(By.xpath("//*[@id=\"inputCity\"]")).sendKeys("Lagos");
    registrationPage.enterACity();
    }

    @And("I enter my first line of address")
    public void iEnterMyFirstLineOfAddress() {
        //driver.findElement(By.xpath("//*[@id=\"inputAddress1\"]")).sendKeys("24 Wealth Place");
    registrationPage.enterAddress1();
    }

    @And("I enter my second line of address")
    public void iEnterMySecondLineOfAddress() {
        //driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]")).sendKeys("Success Avenue");
    registrationPage.enterAddress2();
    }

    @And("I enter my state")
    public void iEnterMyState() {
        //driver.findElement(By.xpath("//*[@id=\"inputState\"]")).sendKeys("London");
    registrationPage.enterAState();
    }

    @And("I enter my zip code")
    public void iEnterMyZipCode() {
        //driver.findElement(By.xpath("//*[@id=\"inputZip\"]")).sendKeys("SU424");
    registrationPage.enterZipCode();
    }

    @When("I click the submit button")
    public void iClickTheSubmitButton() {
        //driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
        registrationPage.clickTheSubmitButton();
    }

    @Then("The form should be submitted successfully")
    public void theFormShouldBeSubmittedSuccessfully()  {
        //Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div/p")).isDisplayed());//locator for text "Thanks for contacting us..."
        //Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div")).isDisplayed());//locator for the box where the text "Thanks for contacting us..." is

        String actualMsg = "Thanks for contacting us, we will get back to you shortly.";
        //String expectedMsg = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div/p")).getText();
        //Assert.assertEquals(actualMsg, expectedMsg);
        Assert.assertEquals(actualMsg, registrationPage.expectedSuccessfulRegMsg());
        driver.quit();
    }


    @And("I enter my full name {string}")
    public void iEnterMyFullName(String name) {
        registrationPage.enterFullName(name);
    }

    @And("I enter a valid email address {string}")
    public void iEnterAValidEmailAddress(String email) {
        registrationPage.enterEmail(email);
    }

    @And("I enter a valid password {string}")
    public void iEnterAValidPassword(String password) {
        registrationPage.enterPassword(password);
    }

    @And("I enter my company's  website {string}")
    public void iEnterMyCompanySWebsite(String website) {
        registrationPage.enterCompanyWebsiteAddress(website);
    }

    @And("I enter my city {string}")
    public void iEnterMyCity(String city) {
        registrationPage.enterACity(city);
    }

    @And("I enter my first line of address {string}")
    public void iEnterMyFirstLineOfAddress(String firstlineAddress) {
        registrationPage.enterAddress1(firstlineAddress);
    }

    @And("I enter my second line of address {string}")
    public void iEnterMySecondLineOfAddress(String secondlineAddress) {
        registrationPage.enterAddress2(secondlineAddress);
    }

    @And("I enter my state {string}")
    public void iEnterMyState(String state) {
        registrationPage.enterAState(state);
    }

    @And("I enter my zipcode {string}")
    public void iEnterMyZipcode(String zipCode) {
        registrationPage.enterZipCode(zipCode);
    }

//    @And("I omit my first name")
//    public void iOmitMyFirstName(String omitName) { registrationPage.omitFirstName(omitName);}



//    @Then("The form should be not submitted successfully")
//    public void theFormShouldBeNotSubmittedSuccessfully() {
//        String actualMsg = "Please fill in this field.";
        //String expectedMsg = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div/p")).getText();
        //Assert.assertEquals(actualMsg, expectedMsg);
        //Assert.assertEquals(actualMsg, registrationPage.expectedSuccessfulRegMsg());
        //driver.quit();


//    @And("I enter an invalid email address")
//    public void iEnterAnInvalidEmailAddress() {
//    }
}
