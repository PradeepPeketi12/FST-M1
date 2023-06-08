/*
Create a Package with a Class and a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
Get the page title and print it to the console.
Use findElement() to find the checkbox input element.
Use the isDisplayed() method to check if it is visible on the page.
Click the "Remove Checkbox".
Print the result of the isDisplayed() method again.
 */
package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5A {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title is :"+driver.getTitle());
        WebElement checkbox = driver.findElement(By
                .xpath("//input[@type='checkbox']"));
        System.out.println("Before clicking on button :"+checkbox.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println("After clicking on the button :"+checkbox.isDisplayed());
        driver.close();
    }
}
