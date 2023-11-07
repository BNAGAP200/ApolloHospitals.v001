package AppolloAppointment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertTesting {
    @Test
    public void verifyappointment() {

        //step 1
        //Launch a browser and open a below url
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/book-appointment/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.findElement(By.className("call-num")).click();

        try {
            Alert alert = driver.switchTo().alert();
            // Do something with the alert, e.g., dismiss it
            alert.dismiss();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert was present.");
        }


    }
}

