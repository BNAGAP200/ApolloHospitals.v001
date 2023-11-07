package HalifaxLoginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.Closeable;

public class ContactUsDropDown {
    @Test
    public void verifyDD2(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.halifax-online.co.uk/personal/logon/login.jsp");
        driver.findElement(By.xpath("//div[@class='accordion ui-accordion ui-widget ui-helper-reset']//div[2]//h2")).click();
       WebElement numb=  driver.findElement(By.xpath("//p[contains(text(),'Technical queries about the Online Banking service')]")); // for not having any of the attributes
       String dis = numb.getText();
        System.out.println(dis);
        WebElement img = driver.findElement(By.xpath("//div[@class='secondary']//div[@class='subPanel']//p//a//img"));
        String attr = img.getAttribute("src");
        WebElement logo = driver.findElement(By.xpath("//p[@id='logo']"));

        Assert.assertEquals("Halifax","Halifax");









        }
}
