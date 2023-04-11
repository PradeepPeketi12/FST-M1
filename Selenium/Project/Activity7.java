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

public class Activity7 {
    WebDriver driver;
    @BeforeMethod
    public void instantiateObject(){

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");

    }

    @Test
    public void postJob() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Post a Job']")).click();
        driver.findElement((By.xpath("//a[text()='Sign in']"))).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("user_pass")).click();
        driver.findElement(By.id("wp-submit")).submit();
        Thread.sleep(1000);
        Assert.assertEquals("root", driver.findElement(By.xpath("//strong[text()='root']")).getText());
        driver.findElement(By.id("job_title")).sendKeys("Test Specialist Automation");
        driver.findElement(By.id("job_location")).sendKeys("Hyderabad");
        driver.findElement(By.xpath("//option[text()='Full Time']")).click();
        driver.findElement(By.xpath("//button[@id='mceu_0-button']/i")).click();

        driver.findElement(By.xpath("//iframe[@id='job_description_ifr']"))
                .sendKeys("Overall Experience: 3 to 5 Years Qualifications: B.Tech/MCA/M.Tech Location:");
        driver.findElement(By.id("application")).sendKeys("pradeep@ibm.com");
        driver.findElement(By.id("company_name")).sendKeys("IBM");
        driver.findElement(By.id("company_website")).sendKeys("http://ibm.com");
        driver.findElement(By.name("submit_job")).submit();
        //Thread.sleep(1000);
        driver.findElement(By.name("submit_job")).submit();

        driver.navigate().to("https://alchemy.hguy.co/jobs'/jobs/");
        driver.findElement(By.id("search_keywords")).sendKeys("Test Specialist Automation");
        driver.findElement(By.id("search_location")).sendKeys("Hyderabad");
        driver.findElement(By.xpath("//input[@value = 'Search Jobs']")).submit();

        Wait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery((Duration.ofSeconds(2))).ignoring(Exception.class);
        WebElement result =  wait.until(new Function<WebDriver, WebElement>(){

            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.xpath
                        ("//img[@class='company_logo'][1]"));
            }
        });
        result.click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Automation Test Specialist");

    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }
}
