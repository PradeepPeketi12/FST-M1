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

public class Activity2 {

    WebDriver driver;
    @BeforeMethod
    public void instantiateObject(){

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");

    }

    @Test
    public void verifyHeading(){

        WebElement element = driver.findElement(By.className("entry-title"));
        System.out.println(element.getText());
        Assert.assertEquals("Welcome to Alchemy Jobs", element.getText());
    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }
}
