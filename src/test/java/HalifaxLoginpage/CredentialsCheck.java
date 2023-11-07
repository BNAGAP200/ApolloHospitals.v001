package HalifaxLoginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CredentialsCheck {
    @Test
    public void verifylogindetails(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.halifax-online.co.uk/personal/logon/login.jsp");
        driver.findElement(By.id("frmLogin:strCustomerLogin_userID")).sendKeys("bsjfgjdf");
        driver.findElement(By.id("frmLogin:strCustomerLogin_pwd")).sendKeys("dfbgdbg");
        driver.findElement(By.id("frmLogin:btnLogin1")).click();
       WebElement error= driver.findElement(By.xpath("//span[@class='error']"));
        System.out.println(error.getText());
        driver.findElement(By.xpath("//button[@id='accept']")).click();
    }
}
