package AppolloAppointment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DoctDropDown {
    @Test
    public void verifyappointment() {
        //step 1
        //Launch a browser and open a below url
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/book-appointment/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        //Step 2
        //click the search button

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("A");
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='ajax-search-result']//li"));

        System.out.println(links.size());
        String title = "Balaji";
        if (links.equals(title)) {
            System.out.println("It is okay");
        } else {
            for (WebElement alllinks:links){
                System.out.println(alllinks.getText());


            }
        }
    }
}