package Day8;

//public class AssignMent {
//}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class SeleniumAssignment {
    public static void main(String[] args) {
        // Set up the WebDriver
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // 1) Open the URL
            driver.get("https://testautomationpractice.blogspot.com/");

            // 2) Provide some string and search for it
            String searchString = "Automation";
            WebElement searchBox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
            searchBox.sendKeys(searchString);
            WebElement searchButton = driver.findElement(By.className("wikipedia-search-button"));
            searchButton.click();

            // 3) Count number of links
            List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));
            System.out.println("Number of links: " + links.size());

            // 4) Click on each link using a for loop
            for (WebElement link : links) {
                link.click();
                // Wait for the new window/tab to open
                try {
                    Thread.sleep(2000); // Adjust the sleep time as needed
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 5) Get window IDs for every browser window
            Set<String> windowIds = driver.getWindowHandles();
            System.out.println("Window IDs:");
            for (String windowId : windowIds) {
                System.out.println(windowId);
            }

            // 6) Close a specific browser window (e.g., the first window)
            String mainWindow = driver.getWindowHandle();
            for (String windowId : windowIds) {
                if (!windowId.equals(mainWindow)) {
                    driver.switchTo().window(windowId);
                    driver.close();
                    break;
                }
            }

            // Switch back to the main window
            driver.switchTo().window(mainWindow);
        } finally {
            // Close the main browser window
            driver.quit();
        }
    }
}
