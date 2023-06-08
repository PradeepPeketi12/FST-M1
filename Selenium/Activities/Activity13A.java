package activities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Activity13A {
    public static void main(String[] args) throws IOException, CsvException {

        CSVReader reader = new CSVReader(new FileReader("src/resources/data.csv"));
        List<String[]> list = reader.readAll();

        Iterator<String[]> iterator = list.iterator();

        while(iterator.hasNext()){
            String[] next = iterator.next();
            for(int i=0;i<next.length;i++){
                System.out.print(next[i]+" ");
            }
            System.out.println(" ");
        }
        reader.close();
    }
}
