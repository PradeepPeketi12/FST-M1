/*
Create a Class and a main() method
For this activity import the following classes
org.openqa.selenium.support.ui.ExpectedConditions
org.openqa.selenium.support.ui.WebDriverWait
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://training-support.net/selenium/dynamic-controls
Get the title of the page using driver.getTitle() and print out the title.
Find the checkbox toggle button and click it.
Wait till the checkbox disappears.
Click the button again. Wait till it appears and check the checkbox.
Finally, close the browser.
 */

package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6A {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://training-support.net/selenium/dynamic-controls");

        System.out.println("Title is :"+driver.getTitle());

        driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toggleCheckbox")));

        driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toggleCheckbox")));

        driver.quit();

    }
}
