package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class Activity8 {
    WebDriver driver;
    @BeforeMethod
    public void instantiateObject(){

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

    }

    @Test
    public void loginBackend() throws InterruptedException {
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).submit();
        //Thread.sleep(2000);
       Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(3)).
                pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
       WebElement element =  wait.until(new Function<WebDriver, WebElement>() {

           @Override
           public WebElement apply(WebDriver webDriver) {
               return driver.findElement(By.xpath("//div[@class='wrap']/h1"));
           }
       });
       Assert.assertEquals("Dashboard", element.getText());


    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }
}
