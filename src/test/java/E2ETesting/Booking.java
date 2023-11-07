package E2ETesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Booking {
    @Test
    public void verifyappointment() {

        //step 1
        //Launch a browser and open a below url
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/book-appointment/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Step 2
        //Navigate into the 01.select your city option
        //Enables the patient into choose one of the city
        driver.findElement(By.xpath("//*[@id=\"Location\"]/div[1]/div/div[2]/a")).click();

        //step3
        //once selected, navigate into the 02.select your speciality
        //Enables the patient into choose one of the specialities
        driver.findElement(By.xpath("//img[@alt='Neurology']")).click();

        //step4
        //once selected option 2.navigate into 03.Select the hopsital near you
        //shows the list of hospitals
        driver.findElement(By.xpath("//div[@class='hospital-cols']")).click();

        //shows the list of hospitals and allow to pick one
        driver.findElement(By.xpath("//div[@class='hospital-cols']//a[1]")).click();
    }

}
