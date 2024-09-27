package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Autosugestions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
        Thread.sleep(5000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role= 'option']"));

        System.out.println(suggestions.size());
        String message = suggestions.get(9).getText();
        System.out.println(message);

        if (message.equals("selenium dev")){
            suggestions.get(9).click();

        }else {
            suggestions.get(0).click();
        }


        Thread.sleep(5000);


        driver.quit();
    }
}
