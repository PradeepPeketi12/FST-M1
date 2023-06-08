/*
Create a Class and a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://training-support.net/selenium/dynamic-attributes
Get the title of the page using driver.getTitle() and print out the title.
Find the username and password input fields. Type in the credentials:
username: admin
password: password
Wait for login message to appear and print the login message to the console.
Finally, close the browser.
 */

package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity7A {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-attributes");

        driver.findElement(By.xpath("//input[@placeholder='Username']"))
                .sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']"))
                .sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String text = driver.findElement(By.
                xpath("//div[@id='action-confirmation']")).getText();
        System.out.println("text is :"+text);
        driver.quit();
    }
}
