package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Activity12C {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/popups");
        Actions builder = new Actions(driver);

        System.out.println("Title is : "+driver.getTitle());
        WebElement button = driver.findElement(By.cssSelector(".ui.inverted.orange.button"));
        builder.moveToElement(button).pause(Duration.ofSeconds(5)).build().perform();
        System.out.println("Message : "+button.getAttribute("data-tooltip"));
        button.click();

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        System.out.println("message after login is : "+driver.findElement(By.id("action-confirmation")).getText());

        driver.close();
    }
}
