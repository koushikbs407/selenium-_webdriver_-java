package Day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alertdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));


        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//       Alert alerts =  wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();


        //conformation that is ok or cancel
         driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//         driver.switchTo().alert().accept();
         driver.switchTo().alert().dismiss();






         //prompt alert this take any prompt
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
       Alert promptalert =  driver.switchTo().alert();
       promptalert.sendKeys("hello world");
       promptalert.accept();


    }
}
