package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity1 {
    WebDriver driver;
    @BeforeMethod
    public void instantiateObject(){

        WebDriverManager.firefoxdriver().setup();

        //Create webdriver instance
        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs");
    }
    @Test
    public void verifyTitle() {

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Alchemy Jobs – Job Board Application",title);

    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
