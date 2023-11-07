package AppolloAppointment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ButtonTest2 {
    @Test
    public void verifyappointment() {
    //step 1
    //Launch a browser and open a below url
    WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/book-appointment/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
// TOP RIGHT CORNER BUTTONS POLICY BUTTONS
      List<WebElement> btn1= driver.findElements(By.xpath("//div[@class='hdr-top-col d-flx itm-cntr']//ul//li"));
        System.out.println(btn1.size());
        for (WebElement btns:btn1) {
            String value = btns.getText();
            System.out.println(value);
            btns.sendKeys(Keys.ARROW_RIGHT);
        }

}

    }
