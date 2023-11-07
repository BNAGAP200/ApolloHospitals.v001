package TopDoctors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UrlLaunch {
    @Test
    public void verfiytitle(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.askapollo.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println(driver.getTitle());




    }
}
