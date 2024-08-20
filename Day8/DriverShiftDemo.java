package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class DriverShiftDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

      WebElement searchBox =  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
             searchBox .sendKeys("macbook");
             searchBox.submit();

       driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-size-medium a-color-base a-text-normal']")).click();
       String title = driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
        System.out.println(title);
       Set<String>windows =  driver.getWindowHandles();

        System.out.println(windows);
//        ArrayList<String> windowshift = new ArrayList<>(windows);
//        String firstWindow = windowshift.get(0);
//        String secondWindow = windowshift.get(1);
//        driver.switchTo().window(secondWindow);

        for (String window : windows) {
           if (driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
               driver.switchTo().window(window);
               System.out.println(window);
           }

        }

        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
