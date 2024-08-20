package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://www.amazon.in/");
        //navigate.to() method this take a parameter as either url or object of url
        driver.navigate().to("https://www.amazon.in/");

        driver.findElement(By.xpath("//a[contains(@href,'/deals?ref_=nav_cs_gb')]")).click();
        Thread.sleep(5000);
        //this method will navigate backward
        driver.navigate().back();
        //this will navigate forward
        driver.navigate().forward();
        //this will refesh the page
        driver.navigate().refresh();

    }
}
