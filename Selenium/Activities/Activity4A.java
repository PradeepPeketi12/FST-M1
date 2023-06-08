/*
Activity 4-1
-----------

Create a Class and a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://www.training-support.net
Get the title of the page using driver.getTitle() and print out the title.
Use findElement() with xpath() to find and click the "About Us" link on the page.
Print the title of the new page that open when the link is clicked.
 */

package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4A {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title is :"+driver.getTitle());
        WebElement element = driver.findElement(By.xpath("//a[@class='ui inverted huge green button']"));
        element.click();
        System.out.println("Title for new page is :"+driver.getTitle());
        driver.close();
    }
}
