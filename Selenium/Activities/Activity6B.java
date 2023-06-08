/*
Create a Class and a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://training-support.net/selenium/ajax
Get the title of the page using driver.getTitle() and print out the title.
Find and click the "Change content" button on the page.
Wait for the text to say "HELLO!". Print the message that appears on the page.
Wait for the text to change to contain "I'm late!". Print the new message on the page.
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

public class Activity6B {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://training-support.net/selenium/ajax");

        System.out.println(driver.getTitle());

        driver.findElement(By.className("violet")).click();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

        System.out.println(driver.findElement(By.id("ajax-content")).getText());

        wait.until(ExpectedConditions.
                textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        System.out.println(driver.findElement(By.id("ajax-content")).getText());

        driver.quit();
    }
}
