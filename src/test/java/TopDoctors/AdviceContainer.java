package TopDoctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AdviceContainer {
    @Test
    public void verfiyattr() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.askapollo.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
      List<WebElement> slides= driver.findElements(By.xpath("//div[@class='carousel-inner']//slide//div"));
        int nos = slides.size();
        System.out.println(nos);

        for (WebElement Allslides:slides){
            String eles = Allslides.getText();
            System.out.println(eles);

        }
    }
}
