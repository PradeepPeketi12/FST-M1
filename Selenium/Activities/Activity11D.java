package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class Activity11D{
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.training-support.net/selenium/tab-opener");

        System.out.println("Title is : "+driver.getTitle());
        System.out.println("Handle of the tab is : "+driver.getWindowHandle());

        driver.findElement(By.id("launcher")).click();

        System.out.println("Handles are : "+driver.getWindowHandles());

        //Perform loop up to last window
        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        System.out.println("Current window title is : "+driver.getTitle());
        System.out.println("Current window is : "+driver.getWindowHandle());

        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        for(int i=0;i<8;i++){
            driver.findElement(By.id("actionButton")).click();
        }
        driver.quit();
    }
}