package AppolloAppointment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NegativeScenerio {
    @Test
    public void verifyappointment() throws InterruptedException {

        //step 1
        //Launch a browser and open a below url
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/book-appointment/");
        //Step 2
        //Maximize and wait the browser to load the web page fully
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

           // step 3
        // click the one city name and parallely clicking other one
        //it should not choose both the city
        List<WebElement> allcities = driver.findElements(By.xpath("//*[@id=\"Location\"]//a"));
        System.out.println(allcities.size());
        driver.findElement(By.xpath("//*[@id=\"Location\"]/div[1]/div/div[2]/a")).click();//chennai
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"Location\"]/div[1]/div/div[4]/a/img")).click(); //hyderabad


        //step






        }
    }


