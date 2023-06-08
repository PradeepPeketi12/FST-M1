/*
Create a Class with a main() method.
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://training-support.net/selenium/simple-form
Get the title of the page using driver.getTitle() and print out the title.
Use findElement() with name() to find the text fields - firstname and lastname.
Use WebElement.sendKeys() to type in those text fields.
Similarly, find and type into the email and contact number fields.
Finally, submit the form by clicking the Submit button.
Close the browser with driver.close()
 */
package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("Title is :"+title);
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement number = driver.findElement(By.id("number"));
        WebElement textarea = driver.findElement(By.tagName("textarea"));
        WebElement submitData = driver.findElement(By.cssSelector(".ui.green.button"));
        firstName.sendKeys("Pradeep");
        lastName.sendKeys("Peketi");
        email.sendKeys("pradeep@gmail.com");
        number.sendKeys("1234567891");
        textarea.sendKeys("submitting the form");
        submitData.click();
        driver.close();
    }
}
