/*
Create a Class and a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://www.training-support.net/selenium/input-events
Get the title of the page using driver.getTitle() and print out the title.
Perform the following actions,
Press the key of your first name in caps
Press CTRL+a and the CTRL+c to copy all the text on the page.
(Paste the text in a text editor to verify results.)
Finally, close the browser.
 */

package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10B {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/input-events");

        System.out.println("Title is : "+driver.getTitle());

        WebElement keyPressed = driver.findElement(By.id("keyPressed"));

        Actions actions = new Actions(driver);
        actions.sendKeys("P").build().perform();

        System.out.println("Pressed key is : "+keyPressed.getText());

        WebElement sizer = driver.findElement(By.className("sizer"));
        actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        System.out.println("Copied text is : "+sizer.getText());
    }

}
