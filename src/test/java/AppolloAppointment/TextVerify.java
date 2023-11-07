package AppolloAppointment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TextVerify {
    @Test
    public void verifyappointment() {
        //Launch a browser and open a below url
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/book-appointment/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement text= driver.findElement(By.xpath("//div[@class='section-top-left pt-5']"));
        System.out.println(text.getText());
    }
}