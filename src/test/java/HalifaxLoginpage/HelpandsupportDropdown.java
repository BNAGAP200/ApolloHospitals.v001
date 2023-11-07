package HalifaxLoginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class HelpandsupportDropdown {
    @Test
    public void verifydd1(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.halifax-online.co.uk/personal/logon/login.jsp");
        driver.findElement(By.xpath("//div[@class='accordion ui-accordion ui-widget ui-helper-reset']//div[1]//h2")).click();
     List<WebElement> dd1 = driver.findElements(By.xpath("//div[@class='accordion ui-accordion ui-widget ui-helper-reset']//div[1]//li//h3"));
     WebElement last = driver.findElement(By.xpath("//h3[@id='ui-id-9']"));
        /*System.out.println(dd1.size());
        String one = dd1.get(1).getText();
        System.out.println(one);*/
      /*if(dd1.equals(last)){
          String value = last.getText();
          System.out.println(value);



        }else {
         String tw0 = dd1.get(2).getText();
          System.out.println(tw0);
      }*/

        driver.findElement(By.xpath("//a[@title='More help & support: Opens in a new window']")).click();

    }
}
