package TopDoctors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocationFinder {
    @Test
    public void verifyattr(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.askapollo.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
      WebElement locationalt= driver.findElement(By.xpath("//a[@id='home_feature_doctors_selectcity']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", locationalt);
        locationalt.click();
        }

    }

