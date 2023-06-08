package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12B {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");

        System.out.println("Title is : "+driver.getTitle());

        driver.switchTo().frame(0);

        driver.switchTo().frame(0);

        System.out.println("Heading of 1st frame : "+driver.findElement(By.cssSelector("div.content")).getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        System.out.println("Heading of 2st frame : "+driver.findElement(By.cssSelector("div.content")).getText());

        driver.close();
    }
}
