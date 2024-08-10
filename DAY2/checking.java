package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checking {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoblaze.com/");
        List<WebElement> headers = webDriver.findElements(By.className("nav-item"));
        System.out.println("number of header elements " + headers.size());
        for (WebElement webaddress : headers){
            System.out.println(webaddress.getText());

        }
        WebElement samsung = webDriver.findElement(By.linkText("Cart"));
        samsung.click();

    }
}
