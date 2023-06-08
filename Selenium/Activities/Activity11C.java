package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11C {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        System.out.println("Title is : "+driver.getTitle());

        driver.findElement(By.id("prompt")).click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("Yes, you are!");

        alert.accept();

        driver.close();
    }
}
