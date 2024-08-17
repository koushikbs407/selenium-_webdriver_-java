package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //isDisplayed() method
        boolean textDisplayed =  driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).isDisplayed();
       System.out.println("textDisplayed :" + textDisplayed);


       //isEnabled() method  ////input[@id='FSsubmit']
      boolean button =  driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
      System.out.println("button :" + button);

      //isSelected() before clicking  checkBox
        boolean checkBoxMale =  driver.findElement(By.xpath("//input[@id='male']")).isSelected();
      System.out.println("checkBoxMale :" + checkBoxMale);

         WebElement checkBoxFemal  = driver.findElement(By.xpath("//input[@id='female']"));
         checkBoxFemal.click();

        System.out.println("checkBox :" + checkBoxFemal.isSelected());

      driver.close();




    }
}
