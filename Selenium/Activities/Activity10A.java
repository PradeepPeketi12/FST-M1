/*
Create a Class and a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://www.training-support.net/selenium/input-events
Get the title of the page using driver.getTitle() and print out the title.
On the page, perform
Left click and print the value of the side in the front.
Double click to show a random side and print the number.
Right click and print the value shown on the front of the cube.
Finally, close the browser.
 */



package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10A {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/input-events");

        System.out.println("Title of the page is : "+driver.getTitle());

        Actions actions = new Actions(driver);

        WebElement cube = driver.findElement(By.id("wrapD3Cube"));

        actions.click(cube).build().perform();

        System.out.println("Left click is : "+driver.findElement(By.className("active")).getText());

        actions.doubleClick(cube).build().perform();

        System.out.println("double click is : "+driver.findElement(By.className("active")).getText());

        actions.contextClick(cube).build().perform();

        System.out.println("right click is : "+driver.findElement(By.className("active")).getText());

        driver.close();
    }
}
