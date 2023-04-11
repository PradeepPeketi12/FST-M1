package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {

    WebDriver driver;
    @BeforeMethod
    public void instantiateObject(){

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");

    }

    @Test
    public void printImageURL(){
        WebElement element = driver.findElement(
                By.xpath("//div[@class='post-thumb-img-content post-thumb']/img"));
        System.out.println(element.getAttribute("src"));
        System.out.println(element.getAttribute("srcset"));
    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }


}
