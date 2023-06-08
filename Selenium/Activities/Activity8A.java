package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8A {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");

        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));

        System.out.println("column size is : "+cols.size());
        System.out.println("row size is : "+ rows.size());

        List<WebElement> thirdRow = driver.findElements((By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td")));

        for(WebElement rowValue : thirdRow){
            System.out.println(rowValue.getText());
        }

       String cell2_2 =  driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]")).getText();

        System.out.println("2nd row  2nd column value is : "+cell2_2);

        driver.quit();
    }

}
