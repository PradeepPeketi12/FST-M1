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

public class Activity6 {
    WebDriver driver;
    @BeforeMethod
    public void instantiateObject(){

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");

    }

    @Test
    public void navigateToAnotherPage() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//li[@id='menu-item-24']/a"));
        element.click();

        Assert.assertEquals("Jobs – Alchemy Jobs", driver.getTitle());

        //Getting object of keywords
        WebElement keyword = driver.findElement(By.id("search_keywords"));
        //Getting object of location
        WebElement location = driver.findElement(By.id("search_location"));
        //Setting value as "Banking" for keyword
        keyword.sendKeys("Banking");
        //Setting value as "Bangalore for location
        location.sendKeys("Banglore");
        //Getting object of submit button
        WebElement submitElement = driver.findElement(By.xpath("//input[@value='Search Jobs']"));
        //Clicking on submit button
        submitElement.submit();
        //Thread.sleep(1000);
        Wait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery((Duration.ofSeconds(2))).ignoring(Exception.class);
       WebElement clickResult =  wait.until(new Function<WebDriver, WebElement>(){

            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.xpath
                        ("//img[@class='company_logo'][1]"));
            }
        });
       clickResult.click();

        WebElement button = driver.findElement(By.xpath("//input[@value='Apply for job']"));
        button.click();

       String email = driver.findElement(By.className("job_application_email")).getText();
       System.out.println(email);
    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }
}
