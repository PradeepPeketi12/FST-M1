/*
This is a simple activity that shows the boilerplate of every selenium script.
Create a Class with a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://www.training-support.net
Close the browser with driver.close()
 */

package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //Initialize the driver and open the browser
        WebDriver driver = new FirefoxDriver();
        //Open the application in the browser
        driver.get("https://www.training-support.net");
        //close the browser
        driver.close();
    }
}
