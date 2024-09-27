package Day16;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class SceenShotDemo {
    public static void main(String[] args) throws IOException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

//         Take screenshot
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        File source = screenshot.getScreenshotAs(OutputType.FILE);
//
//        // Specify the full path including the filename where the screenshot will be saved
//        File targetSource = new File("C:\\Users\\koushik\\IdeaProjects\\Selenium\\src\\test\\java\\Screenshort\\amazon_screenshot2.png");
//
//        try {
//            // Copy the screenshot to the target location
//            FileUtils.copyFile(source, targetSource);
//            System.out.println("Screenshot taken and saved to: " + targetSource.getAbsolutePath());
//        } catch (IOException e) {
//            System.out.println("Error while saving screenshot: " + e.getMessage());
//        }

        //to take specific portion screenshot
//        WebElement specificsection = driver.findElement(By.xpath("//div[@id='gw-card-layout']"));
//        File photo = specificsection.getScreenshotAs(OutputType.FILE);
////        File targetSource = new File("C:\\Users\\koushik\\IdeaProjects\\Selenium\\src\\test\\java\\Screenshort\\photo1.png");
//        File targetsSource = new File(System.getProperty("user.dir") + "\\src\\test\\java\\Screenshort\\photo2.png");
//
//
//
//        FileUtils.copyFile(photo,targetsSource);



    //take a specific web element
        WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        File save = logo.getScreenshotAs(OutputType.FILE);
        File savedImageLocation = new File(System.getProperty("user.dir") + "\\src\\test\\java\\Screenshort\\logo.png");
        FileUtils.copyFile(save,savedImageLocation);






    }
}
