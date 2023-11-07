package TopDoctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImageSLIDER {
    @Test
    public void verfiytitle() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.askapollo.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Step 2 finf the slider image  path

      List<WebElement> slider= driver.findElements(By.xpath("//section[@class='slider-wrapper pt-3 pb-5']//DIV"));

        System.out.println(slider.size());
        for (WebElement sliders :slider){
           String ele = sliders.getAttribute("src");
            System.out.println(ele);
        }
    }
}