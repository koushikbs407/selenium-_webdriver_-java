package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxHandeling {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        //accesing all the checkbox
        List<WebElement> checkbox = driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
//        checkbox.get(0).click();


        //clicking individual check box

//        for (int i = 0; i < checkbox.size(); i++) {
//            checkbox.get(i).click();
//        }


        for (int i = 3; i < checkbox.size(); i++) {


            checkbox.get(i).click();
        }

        Thread.sleep(5000);

        for (int i = 0; i < checkbox.size(); i++) {
            if (!checkbox.get(i).isSelected()) {
                checkbox.get(i).click();

            }else {
                checkbox.get(i).click();
            }
        }











        //
    }
}
