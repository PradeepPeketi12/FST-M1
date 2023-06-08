/*
Create a Class with a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://www.training-support.net
Get the title of the page using driver.getTitle() and print out the title
Use findElement() with the following locators to find the "About Us" link:
id()
className()
linkText()
cssSelector()
Print the text in the WebElement using the getText() method.
Close the browser with driver.close()
 */

package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("Title is :"+title);
        //Using id locator
        WebElement element1 = driver.findElement(By.id("about-link"));
        System.out.println("Text in the web element using id locator is:"+element1.getText());
        //using class locator
        WebElement element2 = driver.findElement(By.className("inverted"));
        System.out.println("Text in web element using class locator is:"+element2.getText());
        //using css selector locator
        WebElement element3 = driver.findElement(By.cssSelector(".ui.inverted.green.button"));
        System.out.println("Text in web element using css locator is:"+element3.getText());
        //using link text locator
        WebElement element4 = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in web element using link text:"+element4.getText());
        driver.close();
    }
}
