package testngactivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class Activity1{
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.firefoxdriver().setup();

        //Create webdriver instance
        driver = new FirefoxDriver();
    }
    @Test
    public void activityTest(){
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Training Support");
        driver.findElement(By.id("about-link")).click();
        String newTitle = driver.getTitle();
        System.out.println("New title is : "+newTitle);
        Assert.assertEquals(newTitle, "About Training Support");
    }

    @AfterMethod
    public void quit(){
        driver.close();
    }
}