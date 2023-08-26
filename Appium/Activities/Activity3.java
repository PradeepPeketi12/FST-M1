package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity3 {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setup() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.miui.calculator");
        options.setAppActivity(".cal.CalculatorActivity");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void sumTest(){
        driver.findElement(AppiumBy.id("btn_5_s")).click();
        driver.findElement(AppiumBy.id("btn_plus_s")).click();
        driver.findElement(AppiumBy.id("btn_9_s")).click();
        driver.findElement(AppiumBy.id("btn_equal_s")).click();
        String result = driver.findElement(AppiumBy.id("result")).getText();
        Assert.assertEquals(result, "= 14");
        driver.findElement(AppiumBy.id("btn_c_s")).click();
    }
    @Test
    public void subtractTest(){
        driver.findElement(AppiumBy.id("btn_1_s")).click();
        driver.findElement(AppiumBy.id("btn_0_s")).click();
        driver.findElement(AppiumBy.id("btn_minus_s")).click();
        driver.findElement(AppiumBy.id("btn_5_s")).click();
        driver.findElement(AppiumBy.id("btn_equal_s")).click();
        String result = driver.findElement(AppiumBy.id("result")).getText();
        Assert.assertEquals(result, "= 5");
        driver.findElement(AppiumBy.id("btn_c_s")).click();
    }

    @Test
    public void multiplyTest(){
        driver.findElement(AppiumBy.id("btn_5_s")).click();
        driver.findElement(AppiumBy.id("btn_mul_s")).click();
        driver.findElement(AppiumBy.id("btn_1_s")).click();
        driver.findElement(AppiumBy.id("btn_0_s")).click();
        driver.findElement(AppiumBy.id("btn_0_s")).click();
        driver.findElement(AppiumBy.id("btn_equal_s")).click();
        String result = driver.findElement(AppiumBy.id("result")).getText();
        Assert.assertEquals(result, "= 500");
        driver.findElement(AppiumBy.id("btn_c_s")).click();
    }

    @Test
    public void divideTest(){
        driver.findElement(AppiumBy.id("btn_5_s")).click();
        driver.findElement(AppiumBy.id("btn_0_s")).click();
        driver.findElement(AppiumBy.id("btn_div_s")).click();
        driver.findElement(AppiumBy.id("btn_2_s")).click();
        driver.findElement(AppiumBy.id("btn_equal_s")).click();
        String result = driver.findElement(AppiumBy.id("result")).getText();
        Assert.assertEquals(result, "= 25");
        driver.findElement(AppiumBy.id("btn_c_s")).click();
    }
}
