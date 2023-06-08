package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9B {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/selects");

        WebElement mutliSelect = driver.findElement(By.id("multi-select"));

        Select select  = new Select(mutliSelect);

        if(select.isMultiple()){
            select.selectByVisibleText("Javascript");
            select.selectByValue("node");
            select.selectByIndex(4);
            select.selectByIndex(5);
            select.selectByIndex(6);

            select.deselectByValue("node");

            select.deselectByIndex(7);

            System.out.println("Fist selected option : "+select.getFirstSelectedOption().getText());

            List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

            for(WebElement element : allSelectedOptions){
                System.out.println(element.getText());
            }
            select.deselectAll();
        }
        driver.close();
    }
}
