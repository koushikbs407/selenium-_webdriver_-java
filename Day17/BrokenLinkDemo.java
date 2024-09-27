package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinkDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("total number of links " + links.size());

        for (WebElement linklist : links){
            String link = linklist.getAttribute("href");
//            System.out.println(link);

            if (link==null||link.isEmpty()){
                System.out.println("link is not found");
                continue;
            }

            try{
                URL linkurl = new URL(link);
                HttpURLConnection httpURLConnection = (HttpURLConnection) linkurl.openConnection();
                httpURLConnection.connect();

                if (httpURLConnection.getResponseCode()>=400){
                    System.out.println("link is broken " + linkurl);
                }else{
                    System.out.println("link is not broken " + linkurl);
                }


            }catch (Exception e){

            }
        }
        driver.close();
    }
}
