package TopDoctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDoctorsSPL {
   @Test
public void verfiydocs() throws InterruptedException {
       WebDriver driver = new EdgeDriver();
       driver.get("https://www.askapollo.com/");
       Assert.assertEquals("Top Doctors At Apollo Hospitals.Book Appoinment Now |AskApollo","Top Doctors At Apollo Hospitals.Book Appoinment Now |AskApollo");
       driver.manage().window().fullscreen();
       Thread.sleep(2000);

      WebElement viewall= driver.findElement(By.xpath("//div[@class='album']//a"));
       System.out.println(viewall.getSize());
       System.out.println(viewall.getText());




   }
}
