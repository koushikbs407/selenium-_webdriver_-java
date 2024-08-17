package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Xpathaxes {
    public static void main(String[] args) {


        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://money.rediff.com/gainers/bse/daily/groupa");

        WebDriver webDriver1   = new ChromeDriver();
        webDriver1.manage().window().maximize();
        webDriver1.get("https://www.amazon.in/");

        //self tag
        WebElement self = webDriver1.findElement(By.xpath("//*[@id='nav-main']/self::div"));
        System.out.println("self Xpath --" + self.getText());


        //parent
        String parent = webDriver.findElement(By.xpath("//td[normalize-space()='1,271.65']//parent::tr")).getText();
        System.out.println(parent);


        //child
        List<WebElement> child = webDriver1.findElements(By.xpath("//*[@id='nav-main']/child::*"));
        System.out.println("child element " + child.size());

//


        //procedingSibling
        List<WebElement> procedingSibling = webDriver.findElements(By.xpath("//td[normalize-space()='1,271.65']/preceding-sibling::*"));
        System.out.println("Number of proceding siblings: " + procedingSibling.size());


        //following sibing
        List<WebElement> followingSibling = webDriver.findElements(By.xpath("//td[normalize-space()='195.05']/following-sibling::*"));
        System.out.println("Number of following siblings: " + followingSibling.size());


        //decendent
        List<WebElement> decendent = webDriver1.findElements(By.xpath("//*[@id='nav-main']/descendant::*"));
        System.out.println("Number of decendent elements: " + decendent.size());





}

}
