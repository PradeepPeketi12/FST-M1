/*
Create a Class and a main() method
Create a WebDriver instance, named driver, with the FirefoxDriver().
Open a browser with https://www.training-support.net/selenium/target-practice
Get the title of the page using driver.getTitle() and print out the title.
Use findElement() with xpath() to
Find the third header on the page.
Find the fifth header on the page and get it's 'colour' CSS Property.
Find the violet button on the page and print all the class attribute values.
Find the grey button on the page with Absolute XPath.
 */

package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4C {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title is :"+driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//h3[@id='third-header']")));
        System.out.println(driver.findElement(By
                .xpath("//h5[text()='Fifth header']"))
                .getCssValue("color"));
        String violetClass = driver.findElement(
                By.xpath("//button[contains(@class,'violet')]")).getAttribute("class");
        System.out.println("violet button classes are :"+violetClass);
      // Absolute path is : /html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]
        String greyClass = driver.findElement(By
                .xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"))
                        .getAttribute("class");
        System.out.println("Grey class is :"+greyClass);
        driver.close();
    }
}
