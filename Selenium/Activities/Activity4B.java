/*
Activity 4-2
------------
Create a Class and a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://www.training-support.net/selenium/simple-form
Get the title of the page using driver.getTitle() and print out the title.
Use findElement() with xpath() to find all the input fields on the page.
Fill in the details in the fields using the sendKeys() method.
Click the submit button at the end of the form to submit the form.
 */

package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4B {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        driver.findElement(By.xpath("//input[@placeholder='First Name']"))
                .sendKeys("Pradeep");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']"))
                .sendKeys("Peketi");
        driver.findElement(By.xpath("//input[@placeholder='abc@xyz.com']"))
                .sendKeys("Pradeep@gmail.com");
        driver.findElement(By.xpath("//div[@class='field']/textarea"))
                .sendKeys("submitting the form");
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        driver.close();
    }
}
