package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11A {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        System.out.println("Title is : "+driver.getTitle());

        driver.findElement(By.id("simple")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println("Text in alert is : "+alert.getText());
        alert.accept();

        driver.close();
        
    }
}
