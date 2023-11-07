package AppolloAppointment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Downpage {
    @Test
    public void verifyappointment() {
        //step 1
        //Launch a browser and open a below url
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.apollohospitals.com/book-appointment/");
        //step 2
        //maximize the window
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");  // logic for scrooling the web page


      /*  WebElement links =driver.findElement(By.xpath("//section[@class='//section']//div"));
        System.out.println(links.getText());*/


        // the whole links are stored in the  seven different container and got the seven containers size and print the every link text
/*List<WebElement> alllinks = driver.findElements(By.xpath("//section[@class='ftr-mdl']//div"));
        System.out.println(alllinks.size());
        for (WebElement alllinkspage:alllinks){
            System.out.println(alllinkspage.getText());

        }*/

// i am going to print the all the clickable link
        List<WebElement> alllinks1 = driver.findElements(By.xpath("//section[@class='ftr-mdl']//div//a"));
       /* System.out.println(alllinks1.size());

        for (WebElement allhyperlink : alllinks1){
            System.out.println(allhyperlink.getAttribute("href"));
        }*/
        for (WebElement link : alllinks1) {
            if (isClickable(link)) {
                System.out.println("Link is clickable: " + link.getAttribute("href"));
            } else {
                System.out.println("Link is not clickable: " + link.getText());
            }
        }

        // Close the browser
        driver.quit();
    }
    public static boolean isClickable(WebElement element) {
       return element.isDisplayed() && element.isEnabled();
    }
}
