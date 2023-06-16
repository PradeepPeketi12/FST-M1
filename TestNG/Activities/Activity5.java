package testngactivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity5 {
    WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void setup(){
        WebDriverManager.firefoxdriver().setup();

        //Create webdriver instance
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void titleTest(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Target Practice");
    }

    @Test(dependsOnMethods = "titleTest", groups = {"HeaderTests"})
    public void headerTests(){
        String thirdHeader = driver.findElement(By.id("third-header")).getText();
        System.out.println("Third header is : "+thirdHeader);
        Assert.assertEquals(thirdHeader, "Third header");
        String color = driver.findElement(By.tagName("h5")).getCssValue("color");
        Assert.assertEquals(color, "rgb(33, 186, 69)");
    }
    @Test(dependsOnMethods = {"titleTest"}, groups = {"ButtonTests"})
    public void buttonTest(){
        String buttonText = driver.findElement(By.className("olive")).getText();
        Assert.assertEquals(buttonText,"Fourth header");
        String btnColor = driver.findElement(By.xpath("//button[text()='Brown']")).getCssValue("color");
        Assert.assertEquals(btnColor, "rgb(255, 255, 255)");
    }

    @AfterTest(alwaysRun = true)
    public void quit(){
        driver.close();
    }
}
