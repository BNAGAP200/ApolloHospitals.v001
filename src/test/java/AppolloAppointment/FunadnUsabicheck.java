package AppolloAppointment;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FunadnUsabicheck {
    @Test
    public void verifyappointment() {

        //step 1
        //Launch a browser and open a below url
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/book-appointment/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // List<WebElement> allcities = driver.findElements(By.xpath("//*[@id=\"Location\"]//a"));
        // List<WebElement> names=driver.findElements(By.xpath("//*[@id=\"Location\"]//span"));
        //System.out.println(allcities.size());
       /* System.out.println(names.size());
        for(WebElement allnames:names){
            System.out.println(allnames.getText());
            System.out.println(allnames.getTagName());
        }*/


//It does not show the 80 elements when i executed
/*List<WebElement> allatt = driver.findElements(By.xpath("//div[@class='gray-grid speciality-cols d-flex flex-wrap']//span"));

        System.out.println(allatt.size());
        for (WebElement att :allatt){
            System.out.println(att.getText());
        }
    }*/





    }
}