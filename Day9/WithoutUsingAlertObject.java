package Day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WithoutUsingAlertObject {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));


        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
       Alert alert = wait.until(ExpectedConditions.alertIsPresent());


        alert.accept();
    }
}
