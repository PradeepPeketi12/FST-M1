package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9A {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/selects");

        WebElement selectElement = driver.findElement(By.id("single-select"));

        Select select = new Select(selectElement);

        select.selectByVisibleText("Option 2");

        select.selectByIndex(3);

        select.selectByValue("4");

        List<WebElement> options = select.getOptions();

        System.out.println("Options are : ");

        for(WebElement option : options){
            System.out.println(option.getText());
        }

        driver.close();

    }

}
