package HalifaxLoginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Checkbox {
    @Test
    public void verifycheckbox(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.halifax-online.co.uk/personal/logon/login.jsp");
       WebElement check = driver.findElement(By.xpath("//input[@id='frmLogin:loginRemember']"));
       check.click();
       check.isEnabled();
        System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Remember my username on this computer']")).getText());
WebElement i = driver.findElement(By.xpath("//span[@class='cxtHelp']"));
if(i.isDisplayed()){
    i.click();
    System.out.println(i.getText());
}

    }
}
