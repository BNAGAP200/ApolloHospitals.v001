package AppolloAppointment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {
    @Test
    public void verifyappointment() {
        //step 1
        //Launch a browser and open a below url
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/book-appointment/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        List<WebElement>DD1 = driver.findElements(By.xpath("//div[@class='sl-nav']//a"));
        System.out.println(DD1.size());
        String lang = "Tamil";
        if (DD1.equals(lang)){
            System.out.println("The program is okay");

    }else {
            System.out.println("the program is no okay");

}

    }
}