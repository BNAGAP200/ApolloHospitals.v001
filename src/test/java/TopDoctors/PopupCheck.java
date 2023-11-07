package TopDoctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PopupCheck {

        @Test
        public void verifyattr() {
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.askapollo.com/");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().fullscreen();

            driver.findElement(By.xpath("//a[@id='request_a_call_back']")).click();
           List<WebElement> radio= driver.findElements(By.xpath("//div[@class='mb-1']//input"));
          /* int radiobuttons = radio.size();
           if(radiobuttons>=2){
               System.out.println(radio.get(0).getText());
               System.out.println(radio.get(1).getText());
           }else {
               System.out.println("there are not enough radio buittons");*/
              List<WebElement> cities= driver.findElements(By.xpath("//select[@class='form-control myselect h46 ng-pristine ng-valid ng-touched']//option"));
            System.out.println("The size of the cities list is: " + cities.size());
              /* for(WebElement allcities:cities){
                   String ele = allcities.getText();

                   System.out.println(ele);*/
                  /* if(ele.equals("Tamilnadu")){
                       System.out.println("The cities is okay");
                   }else {
                       System.out.println("The cities are not okay");
                   }*/
            driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Balaji");
            driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hdjsdahfj");
            driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("dgfsdgfd");
               }
               }





