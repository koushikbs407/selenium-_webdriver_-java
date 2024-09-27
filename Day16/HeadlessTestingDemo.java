package Day16;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestingDemo {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");



        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in/");

        System.out.println("test case passed");

        driver.close();



    }
}
