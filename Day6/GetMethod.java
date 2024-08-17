package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class GetMethod {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);

        //getTitle() Method
        String title = driver.getTitle();
        System.out.println(title);

        //getCurrentUrl() Method
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        //getPageSource() method
//        String pageSource =   driver.getPageSource();
//        System.out.println(pageSource);


        //getWindowHandle() method
        String windowID = driver.getWindowHandle();
        System.out.println(windowID);

      WebElement input =   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
      input.sendKeys("macbook");
      input.submit();


      driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-size-medium a-color-base a-text-normal']")).click();


        //getWindowsHandler() this will return number of windows
        Set<String> windowsId = driver.getWindowHandles();
        System.out.println(windowsId);


        Thread.sleep(5000);
        driver.quit();



    }
}
