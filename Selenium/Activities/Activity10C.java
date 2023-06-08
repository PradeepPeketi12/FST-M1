/*
Create a Class and a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://training-support.net/selenium/drag-drop
Get the title of the page using driver.getTitle() and print out the title.
Find the ball and simulate a click and drag to move it into "Dropzone 1".
Verify that the ball has entered Dropzone 1.
Once verified, move the ball into "Dropzone 2".
Verify that the ball has entered Dropzone 2.
Once verified, close the browser.
 */

package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10C {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/drag-drop");

        System.out.println("Title is : "+driver.getTitle());

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(draggable, droppable).build().perform();

        String message = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
        if(message.equals("Dropped!")){
            System.out.println("Dropped successfully");
        }else{
            System.out.println("Dropped unsuccessfully");
        }

        actions.dragAndDrop(droppable, driver.findElement(By.id("dropzone2"))).build().perform();
        String message1 = driver.findElement(By.xpath("//div[@id='dropzone2']/p")).getText();
        if(message1.equals("Dropped!")){
            System.out.println("Dropped successfully");
        }else{
            System.out.println("Dropped unsuccessfully");
        }

        driver.close();
    }
}
