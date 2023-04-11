package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

    WebDriver driver;
    @BeforeMethod
    public void instantiateObject(){

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");

    }

    @Test
    public void verifySecondHeading(){
        WebElement element = driver.findElement(By.tagName("h2"));
        Assert.assertEquals("Quia quis non", element.getText());
    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }

}
