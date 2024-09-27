package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BootstrapDropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");

        driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();

        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));

//        for (WebElement option : options) {
//            System.out.println(option.getText());
//            if (option.getText().equals("Java")||option.getText().equals("Python")||option.getText().equals("C#")) {
//                option.click();
//            }
//        }



        for (WebElement option : options) {
            String check = option.getText();
            System.out.println(check);



//
            if (option.getText().equals(check)) {

                    option.click();


            }



            Thread.sleep(1000);
        }




    }
}
