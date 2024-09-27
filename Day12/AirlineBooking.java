package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class AirlineBooking {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //clicking dropdown department
        driver.findElement(By.xpath("//select[@name='fromPort']")).click();
        Thread.sleep(1000);
        //selecting th department
        driver.findElement(By.xpath("//option[@value='Philadelphia']")).click();
        Thread.sleep(1000);


        //clicking dropdown destination city
        driver.findElement(By.xpath("//select[@name='toPort']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='London']")).click();
        Thread.sleep(1000);


        //selecting submit button
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();



        //number of rows
        int size = driver.findElements(By.xpath("//table[@class = 'table']//tr")).size();
        List<String> prices = new ArrayList<String>();
        //finding the prices of the flight
        for(int i = 1;i<size;i++) {
            String price = driver.findElement(By.xpath("//table[@class = 'table']//tr[" + i + "]//td[6]")).getText();
            prices.add(price);
        }

        //sorting the prices of the flight
        Collections.sort(prices, new Comparator<String>() {
            @Override
            public int compare(String p1, String p2) {
                // Extract the numeric part for comparison while keeping the dollar sign
                double price1 = Double.parseDouble(p1.replace("$", "").trim());
                double price2 = Double.parseDouble(p2.replace("$", "").trim());
                return Double.compare(price1, price2);
            }




        });
        //printing the prices of the flight

        System.out.println(prices);

        Thread.sleep(1000);



        // this is click the lowest price of the flight
        for (int i = 1;i<4;i++){


            String price = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//table[@class = 'table']//tr[" + i + "]//td[6]"))).getText();
//            String pricecheck = driver.findElement(By.xpath("//table[@class = 'table']//tr["+i+"]//td[6]")).getText();
            String priceofflight =prices.get(0);


            if (price.equals(priceofflight)){
                driver.findElement(By.xpath("//table[@class = 'table']//tr[2]//td[1]")).click();
                System.out.println(price);
            }
        }




        //passing a data to book th flight

       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='inputName']")));

        Thread.sleep(1000);
        //passing user name
        WebElement data = driver.findElement(By.xpath("//input[@id='inputName']"));
        data.sendKeys("Koushik B S");
//        System.out.println(data.isDisplayed());
        Thread.sleep(1000);

        //passing address
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("cmr university main campus ,boys hostel ,baglur banglore");
        Thread.sleep(1000);
//
//        //passing city name
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bengaluru");
        Thread.sleep(1000);
//
//        //passing state name
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Karnataka");
        Thread.sleep(1000);
//
//        //passing pincode
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("562149");
        Thread.sleep(1000);
//
//        //selecting cartype dropdown
         WebElement cardtype = driver.findElement(By.xpath("//select[@id='cardType']"));
        Select select = new Select(cardtype);
        select.selectByValue("visa");
        Thread.sleep(1000);



        // submitiing the card number
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("7589-769-7589");
        Thread.sleep(1000);

        //card month
        driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("4");
        Thread.sleep(1000);

        //year
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2022");
        Thread.sleep(1000);

        //card owner name
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Koushik B S");
        Thread.sleep(1000);

        //radiobutton remeber me
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        Thread.sleep(1000);


        //submitting button
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
        Thread.sleep(1000);










//        driver.close();


    }
}
