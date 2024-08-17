package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);

        WebElement input =   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        input.sendKeys("macbook");
        input.submit();


        driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-size-medium a-color-base a-text-normal']")).click();
        //.close()method will only close the driver directed tab
        driver.close();
        //.quite() method will close all the tab automated by the software
        driver.quit();

    }
}
