package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11B {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        System.out.println("Title is : "+driver.getTitle());

        WebElement confirm = driver.findElement(By.id("confirm"));

        confirm.click();

        Alert alert = driver.switchTo().alert();
        System.out.println("Text is : "+alert.getText());

        alert.accept();

        confirm.click();
        alert = driver.switchTo().alert();
        alert.dismiss();

        driver.close();

    }
}
