package TopDoctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class YoutubeDownSlider {

    @Test
    public void verifyattr() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.askapollo.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("(//div[@class='carousel-indicators'])[2]"));
    /*   WebElement  captions = driver.findElement(By.xpath("//div[@class='row text-center section-top']"));
        System.out.println(captions.getText());*/
        List<WebElement> linebutton = driver.findElements(By.xpath("//div[@class='carousel-indicators']//button"));
        int buttons= linebutton.size();
        System.out.println(buttons);
        linebutton.get(2).click();
        driver.findElement(By.xpath("//button[@class='btn pro-appt prohealth-btn']")).click();
       boolean condition=driver.findElement(By.xpath("//img[@src='assets/pro-health-new/fold-five-img.webp']")).isDisplayed();
        System.out.println(condition);

    }
}