package CucumberManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BasePageHooks {
    protected WebDriver driver;

    public BasePageHooks(WebDriver driver){
        this.driver = driver;
    }

    public void goToCollabToolzUrl(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://test.rcs-ct.com");
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.quit();
    }
}
