package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5C {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        WebElement element = driver.findElement(By.id("input-text"));
        System.out.println("Before enable :"+element.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("After enable :"+element.isEnabled());
        driver.close();
    }
}
