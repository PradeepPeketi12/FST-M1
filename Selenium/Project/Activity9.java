package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {

    WebDriver driver;
    @BeforeMethod
    public void instantiateObject(){
        //ChromeOptions options = new ChromeOptions();
       // options.addArguments("--remote-allow-origins=*");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

    }

    @Test
    public void loginBackend() throws InterruptedException {
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).submit();
        Thread.sleep(2000);
        WebElement element =  driver.findElement
               (By.id("menu-posts-job_listing"));

        element.click();
        driver.findElement(By.className("page-title-action")).click();
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        driver.findElement(By.xpath("(//button[text()='Get started'])[2]")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("post-title-0")).sendKeys("Test Specialist Automation");

        driver.findElement(By.name("_job_location")).sendKeys("Hyderabad");
        WebElement email = driver.findElement(By.name("_application"));
        email.clear();
        email.sendKeys("pradeep@ibm.com");
        driver.findElement(By.name("_company_name")).sendKeys("IBM");
        driver.findElement(By.name("_company_website")).sendKeys("www.ibm.com");
        driver.findElement(By.name("_company_tagline")).sendKeys("IBM specializes in computer hardware, middleware, and software, and provides hosting and consulting services in areas ranging from mainframe computers to nanotechnology");
        driver.findElement(By.id("_job_expires")).click();

        while(!(driver.findElement(By.className("ui-datepicker-month")).getText().equals("May"))){
            driver.findElement(By.xpath("//a[@title='Next']")).click();
        }
        driver.findElement(By.xpath("//a[text()=10]")).click();

        driver.findElement(By.xpath("//button[text()='Publish…']")).click();
        driver.findElement(By.xpath("//button[text()='Publish']")).click();
        Thread.sleep(1000);
        Assert.assertEquals("Test Specialist Automation is now live.",
                driver.findElement(By.xpath("//div[text()='is now live.']")).getText());
    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }

}
