package testngactivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity10 {
    WebDriver driver;
    Actions builder;
    @BeforeClass
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        //Create webdriver instance
        driver = new FirefoxDriver();
        builder = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/sliders");

    }

    @Test
    public void middleValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        slider.click();
        String volumelevel = driver.findElement(By.id("value")).getText();
        Reporter.log("Mid Value : "+volumelevel);
        Assert.assertEquals(volumelevel, "50");
    }

    @Test
    public void maximumValue(){
        //Find slider
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(75, 0).release().build().perform();

        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Max value: " + volumeLevel);

        Assert.assertEquals(volumeLevel, "100");
    }

    @Test
    public void minimumValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(-75, 0).release().build().perform();

        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);

        Assert.assertEquals(volumeLevel, "0");
    }
    @Test
    public void thirtyPerValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(-30, 0).release().build().perform();

        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);

        Assert.assertEquals(volumeLevel, "30");
    }
    @Test
    public void eightyPerValue(){
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(45, 0).release().build().perform();

        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);

        Assert.assertEquals(volumeLevel, "80");
    }

    @AfterClass
    public void quit(){
        driver.close();
    }
}
