package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(5000);


       WebElement dropdows =  driver.findElement(By.xpath("//select[@id='country']"));
        Select options = new Select(dropdows);
//        options.selectByValue("United States");
//        options.selectByIndex(2);
//        options.selectByVisibleText("Canada");


        List<WebElement> availabeloptions = options.getOptions();
        for (WebElement check : availabeloptions){


            if (check.getText().equals("Canada")){
                options.selectByVisibleText("Canada");

            }
            System.out.println(check.getText());
        }
    }
}
