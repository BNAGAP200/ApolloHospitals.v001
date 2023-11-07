package AppolloAppointment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Buttonttest {
    @Test
    public void verifyappointment() {

        //step 1
        //Launch a browser and open a below url
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/book-appointment/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // test the button
      /*  WebElement btn = driver.findElement(By.xpath("//button[@class='toggle-menu d-flx jstfy-cntr itm-cntr']"));
        btn.click();

        // side button the 6 option come under logo buttons
        WebElement lists = driver.findElement(By.xpath("//nav[@class='ap-nav open']"));
        System.out.println(lists.getText());
        lists.getSize();*/

        //top left corner social media buttons
        List<WebElement> btns=driver.findElements(By.xpath("//div[@class='container d-flx itm-cntr jstfy-btwn']//span"));

        System.out.println(btns.size());
        String title="Appollo hospitals";


            if(title.equals(btns)){
                System.out.println("The execution is wrong");
            }else {
                System.out.println("The execution is okay");
            }
        }

    }
