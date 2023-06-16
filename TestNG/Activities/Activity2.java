package testngactivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.firefoxdriver().setup();

        //Create webdriver instance
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void titleTest(){
       String title =  driver.getTitle();
        Assert.assertEquals(title, "Target Practice");
    }
    @Test
    public void colorTest(){
       WebElement blackButton =  driver.findElement(By.className("black"));
       Assert.assertTrue(blackButton.isDisplayed());
       Assert.assertEquals(blackButton.getText(), "Black");
    }

    @Test(enabled = false)
    public void skipTest(){
        System.out.println("Test skipped");
    }

    @Test
    public void fourthTest(){
        throw new SkipException("Method is skipped and it will shown as skipped");
    }

    @AfterClass
    public void quit(){
        driver.close();
    }
}
