package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        //Accesing amazon url
        webDriver.get("https://www.amazon.in/");
        //finding the web element by id
     WebElement search =  webDriver.findElement(By.id("twotabsearchtextbox"));
     //passing a text to search box
     search.sendKeys("macbook");
     //submiting the text
     search.submit();
    // checking whether the imgae is displayed or not
      Boolean imageCheck =  webDriver.findElement(By.id("nav-logo")).isDisplayed();
      if (imageCheck==true){
          System.out.println("Test Case passed");
      }else{
          System.out.println("Test case failed");
      }
      //using linkText method to open a web url
     webDriver.findElement(By.linkText("Today's Deals")).click();
        List<WebElement> img = webDriver.findElements(By.tagName("img"));
        System.out.println(img.size());
        //finding a web element using the classname
        List<WebElement> headers = webDriver.findElements(By.className("nav-a  "));
        System.out.println("number of header elements are " + headers);
    }
}
