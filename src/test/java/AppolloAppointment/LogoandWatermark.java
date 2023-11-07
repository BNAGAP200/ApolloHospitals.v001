package AppolloAppointment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogoandWatermark {

    @Test
    public void verifyappointment() {
        //Launch a browser and open a below url
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/book-appointment/");
        System.out.println(driver.getTitle());
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement logo = driver.findElement(By.xpath("//a[@class='apollo-logo']//img"));
       // System.out.println(logo.isDisplayed());
        if(logo.isDisplayed()){
           String logosrc = logo.getAttribute("src");
            System.out.println(logosrc);

        }
        WebElement logo1= driver.findElement(By.xpath("//img[@alt='Apollo Ask Logo']"));
        if(logo1.isDisplayed()){
            String logosrc1= logo.getAttribute("src");
            System.out.println(logosrc1);
        }
    }
}