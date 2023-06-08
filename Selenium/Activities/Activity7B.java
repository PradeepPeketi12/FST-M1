package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7B {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-attributes");

        System.out.println("Title is : "+driver.getTitle());

        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("Alchemy");

        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("Alchemy");

        driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input")).sendKeys("Alchemy");

        driver.findElement(By.xpath("//label[text()='Email']/following::input")).sendKeys("Alchemy@in.com");

        driver.findElement(By.xpath("//button[text() = 'Sign Up']")).click();

        String message = driver.findElement(By.id("action-confirmation")).getText();

        System.out.println("Message is : "+message);

        driver.quit();
    }

}
