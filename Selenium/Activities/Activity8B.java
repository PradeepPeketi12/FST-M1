package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8B {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");

        List<WebElement> colSize = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));

        List<WebElement> rowSize = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));

        System.out.println("Column Size is  : "+colSize.size());
        System.out.println("Row size is : "+rowSize.size());

        System.out.println("2nd row 2nd column value is : "+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());

        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();

        System.out.println("2nd row 2nd column value after sorting is : "+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());

        List<WebElement> elements = driver.findElements(By.xpath("//tfoot/tr/th"));

        for(WebElement element : elements){
            System.out.println(element.getText());
        }

        driver.close();
    }

}
