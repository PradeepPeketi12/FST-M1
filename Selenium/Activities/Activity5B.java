/*
Create a Package with a Class and a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
Get the page title and print it to the console.
Use findElement() to find the checkbox input element.
Use the isSelected() method to check if the checkbox is selected.
Click the checkbox to select it.
Use the isSelected() method again and print the result.
 */
package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5B {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        WebElement element = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("Before selection :"+element.isSelected());
        element.click();
        System.out.println("After selection :"+element.isSelected());
        driver.close();
    }
}
