package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstTestCase {
    public static void main(String[] args) {
        //launching the browser
        WebDriver webDriver = new ChromeDriver();
        //passing the url to the driver
        webDriver.get("https://mvnrepository.com/");
        //accesing the title from the url
       String tileCheck =  webDriver.getTitle();

       //writing a test case to check whether the title matches the url
        if (tileCheck.equals("Maven Repository: Search/Browse/Explore")){
            System.out.println("Test Case passed");
        }else{
            System.out.println("Test Case failed");
        }
        webDriver.close();
    }
}
