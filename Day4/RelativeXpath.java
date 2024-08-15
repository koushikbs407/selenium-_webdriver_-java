package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");


        // realtiveXpath
        WebElement search = driver.findElement(By.xpath("//input[@id=\'twotabsearchtextbox\']"));
        search.sendKeys("macbook");
        search.submit();


        // realtive xpath with inner text
        WebElement amazonminitv = driver.findElement(By.xpath("//a[normalize-space()='Amazon miniTV']"));
        amazonminitv.click();
        driver.close();


        // xpath with multiple attribute using "and" operation
        WebElement amazontoplink = driver.findElement(By.xpath("//a[@id='nav-logo-sprites' and @aria-label=\"Amazon.in\" ]"));
        amazontoplink.click();


        // xpath with multiple attribute using "or" operation
        WebElement amazontopcheck = driver.findElement(By.xpath("//a[@id='nav-logo-sprites' or @aria-label=\"Amazon.in\" ]"));
        amazontopcheck.click();


        // xpath with contains
        WebElement searchs  = driver.findElement(By.xpath("//*[contains(@id,'twotabsearchtextbox')]"));
         searchs.sendKeys("selenium");
         searchs.submit();


        //xpath with starts -with
        WebElement searching = driver.findElement(By.xpath("//*[starts-with (@id,'twotabsearchtextbox')]"));
        searching.sendKeys("nothing cmf phone");
        searching.submit();



        //chained xpath
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://demo.opencart.com/");
        WebElement LOGO = driver.findElement(By.xpath("//div[@id,'logo']/a/img"));
        Boolean check = LOGO.isDisplayed();
        System.out.printf(check.toString());







//        WebElement laptop = driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple 2024 MacBook Air 13″ Laptop with M3 chip: 34')]"));
//        laptop.click();
    }
}
