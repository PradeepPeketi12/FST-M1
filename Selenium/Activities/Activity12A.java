package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12A {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/iframes");

        System.out.println("Title is : "+driver.getTitle());

        driver.switchTo().frame(0);
        System.out.println("Heading is : "+driver.findElement(By.cssSelector("div.content")).getText());

        WebElement button =  driver.findElement(By.id("actionButton"));
        button.click();

        System.out.println("Text in button is : "+button.getText());
        System.out.println("Color of button is : "+button.getCssValue("background-color"));

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        System.out.println("Heading is : "+driver.findElement(By.cssSelector("div.content")).getText());

        WebElement button1 =  driver.findElement(By.id("actionButton"));
        button1.click();

        System.out.println("Text in button is : "+button1.getText());
        System.out.println("Color of button is : "+button1.getCssValue("background-color"));

        driver.close();
    }
}
