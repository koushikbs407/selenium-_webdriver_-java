package DAY10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");

        //moving to different frame

        WebElement frame = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame);

        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("mackbook");
        //moving to default driver page
        driver.switchTo().defaultContent();


        //moving from default to frame and then to iframe
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame2);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
        driver.switchTo().defaultContent();

        //working with iframes
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//a[@href='https://a9t9.com']")).click();



         driver.findElement(By.xpath("//a[@href='/#get']")).click();

    }
}
