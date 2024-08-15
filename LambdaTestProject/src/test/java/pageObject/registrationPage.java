package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registrationPage {

    public WebDriver driver;

    public registrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Movement of WebElements into the PageObjects
    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement nameField;

    @FindBy(xpath = "//*[@id=\"inputEmail4\"]")
    public WebElement emailAddressField;

    @FindBy(xpath = "//*[@id=\"inputPassword4\"]")
    public WebElement passWordField;

    @FindBy(xpath = "//*[@id=\"company\"]")
    public  WebElement companyNamefield;

    @FindBy(xpath = "//*[@id=\"websitename\"]")
    public WebElement companyWebsitesAddressField;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement countryDropDownList;

    @FindBy(xpath = "//*[@id=\"inputCity\"]")
    public WebElement cityField;

    @FindBy(xpath = "//*[@id=\"inputAddress1\"]")
    public WebElement firstLineOfAddressField;

    @FindBy(xpath = "//*[@id=\"inputAddress2\"]")
    public WebElement secondLineOfAddressField;

    @FindBy(xpath = "//*[@id=\"inputState\"]")
    public WebElement stateField;

    @FindBy(xpath = "//*[@id=\"inputZip\"]")
    public WebElement zipCodeField;

    @FindBy (xpath = "//button[normalize-space()='Submit']")
    public WebElement submitButtonField;

    @FindBy (xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div/p")
    public WebElement SuccessfulRegText;

//    @FindBy (xpath = "//*[@id=\"name\"]")   //WebElement used for the name field under step definition
//    public WebElement omitFirstNameField;




    public void enterFullName() {nameField.sendKeys("Blessed Oba");}

    public void enterEmailAddress() {emailAddressField.sendKeys("great_man@gmail.com");}

    public void enterPassword() {passWordField.sendKeys("@Success_77..$");}

    public void enterCompanyName() {companyNamefield.sendKeys("TopPropatiX");}

    public void enterCompanyWebsiteAddress(){
        companyWebsitesAddressField.sendKeys("http://www.toppropatix.com");}

    public void selectCountry() {new Select(countryDropDownList).selectByVisibleText("United Kingdom");}

    public void enterACity(){cityField.sendKeys("Lagos");}

    public void  enterAddress1(){firstLineOfAddressField.sendKeys("24 Wealth Place");}

    public void enterAddress2(){secondLineOfAddressField.sendKeys("Success Avenue");}

    public void enterAState(){stateField.sendKeys("London");}

    public void enterZipCode() {zipCodeField.sendKeys("SU424");}

    public void clickTheSubmitButton(){submitButtonField.click();}

    public String expectedSuccessfulRegMsg() {return SuccessfulRegText.getText();}

//    public void omitFirstName() {nameField.sendKeys(" ");}

    public void enterFullName(String name){nameField.sendKeys(name);}

    public void enterEmail(String email) {emailAddressField.sendKeys(email);}

    public void enterPassword(String password) {
         emailAddressField.sendKeys(password);
    }

    public void enterCompanyWebsiteAddress(String website) {
      companyWebsitesAddressField.sendKeys(website);
    }

    public void enterACity(String city) {
      cityField.sendKeys(city);
    }

    public void enterAddress1(String firstlineAddress) {
        firstLineOfAddressField.sendKeys(firstlineAddress);
    }

    public void enterAddress2(String secondlineAddress) {
        secondLineOfAddressField.sendKeys(secondlineAddress);
    }

    public void enterAState(String state){
        stateField.sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        zipCodeField.sendKeys(zipCode);
    }

//    public void omitFirstName(String omitName) {omitFirstNameField.sendKeys(omitName);}
}
 