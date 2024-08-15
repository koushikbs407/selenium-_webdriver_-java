package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {


        // tag#id css selector
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

       WebElement  search  =  driver.findElement(By.cssSelector("#twotabsearchtextbox"));
       search.sendKeys("mackbook");
       search.submit();




       //amazon login check
        //tag[attribute = "value"]
        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://accounts.flipkart.com/?client=cemp-client&redirectURL=httpsmerchant.ekartlogistics.comcallbackappNamemerchant");
        WebElement loginid = driver2.findElement(By.cssSelector("input[type='text']"));
        loginid.sendKeys("6366153072");
        loginid.submit();

      //tag.class[attribute = "value"]
        driver.findElement(By.cssSelector(".nav-a[href='/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help']")).click();


        //tag.class css selector





        WebDriver driver3 = new ChromeDriver();
        driver3.manage().window().maximize();
        driver3.get("https://www.flipkart.com/");

        driver3.findElement(By.cssSelector("a[title='Login'] span")).click();
    }
}
