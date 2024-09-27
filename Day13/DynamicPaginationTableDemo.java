package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//public class DynamicPaginationTableDemo {
//
//    public static void main(String[] args) throws InterruptedException {
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testautomationpractice.blogspot.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//
////        hadling dynamic table
//        //number of pages of the website
//        int pageSize = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
//        System.out.println(pageSize);
//
//
//        int tablerowSize = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
//
//
//
//        for (int i = 1; i <= pageSize; i++) {
//
//
//
//            for (int j = 1; j <= tablerowSize; j++) {
//
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='productTable']//tr[" + j + "]//td[4]//input[contains(@type,'checkbox')]"))).click();
//
//
//            }
//
//            if (i < pageSize) {
//                // Click the next page link
//                WebElement nextpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='pagination']//li["+(i+1)+"]//a")));
//                nextpage.click();
//                Thread.sleep(2000);  // Add sleep to ensure page load before next iteration
//            }
////
//
//        }
//
//
//
//    }
//}






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicPaginationTableDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Handling dynamic table pagination
        int pageSize = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
        System.out.println("Total number of pages: " + pageSize);

        // Loop through each page
        for (int i = 1; i <= pageSize; i++) {

            // Recalculate the table rows size on each page load
            int tablerowSize = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
            System.out.println("Rows on page " + i + ": " + tablerowSize);

            // Loop through each row in the table
            for (int j = 1; j < tablerowSize; j++) {
                WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//table[@id='productTable']//tr[" + j + "]//td[4]//input[contains(@type,'checkbox')]")));
                checkbox.click();
            }

            // Click to go to the next page if not on the last page
            if (i < pageSize) {
                // Re-fetch the pagination element after navigating to a new page
                WebElement nextPage = wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//ul[@id='pagination']//li[" + (i + 1) + "]//a")));
                nextPage.click();

                // Wait for the page to load before continuing
                Thread.sleep(2000);

                // Re-fetch the elements after the page has changed
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='productTable']//tr")));
            }
        }

        // Close the browser after processing all pages
        driver.quit();
    }
}



