package E2ETesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selectdoctors {
    @Test
    public void verifyappointment() {

        //step 1
        //Launch a browser and open a below url
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/hospital/chennai/apollo-cancer-institutes/neurologist/");
        driver.findElement(By.xpath("//a[text()=' Radiation Oncology ']")).click();

        //step 2
        //find out the doctors profile block and find out the common xpath for all 9 profiles

        List<WebElement> profiles = driver.findElements(By.xpath("//section[@class='profileblock mt-3 mt-lg-5']//h2"));





       List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='list-inline1 ']//a"));
        System.out.println(alloptions.size());

        for(WebElement options:alloptions){
            if(isClickable(options)){
                System.out.println("Options is clickable:"+options.getAttribute("href"));
            }else{
                System.out.println("Options is not clickable:"+options.getText());
            }

        }

    }
    public static  boolean isClickable(WebElement element){
        return element.isDisplayed() && element.isEnabled();
    }
}