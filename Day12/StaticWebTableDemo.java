package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticWebTableDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");


        //finding the number of elements in the row
        int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();

        System.out.println(row);


        //finding the heading of the table
        List<WebElement> header = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
        System.out.println("size of the header is " + header.size());
        for (int i = 0; i < header.size(); i++) {
            System.out.println(header.get(i).getText());
        }


        //reading a data from  row and coloum
        List<WebElement> data = driver.findElements(By.xpath("//table[@name='BookTable']//tr[4]//td"));
        System.out.println("size of the data is " + data.size());

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).getText());
        }



        //reading data from specific rows and coloums
        String information = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[3]")).getText();
        System.out.println(information);



        //reading data from all rows and columns

        int coloumn = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();

        System.out.println("printing the data");


        for (int i = 2;i<row;i++){
            for(int j = 1;j<=coloumn;j++){

               String dataname =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
               System.out.print(dataname + " " );
            }
            System.out.println();
            System.out.println();
            System.out.println("next datataaa");
        }



        //print the bookname whose author is mukesh
        ////table[@name='BookTable']//tr[3]//td[2]

        for (int i = 2;i<row;i++){

          String checkingElement =   driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();

          if (checkingElement.equals("Mukesh")){
             String bookname =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
              System.out.println(bookname);



          }


        }

//

        //find the total price of the books
        int totalAmount = 0;
        for (int i = 2;i<row;i++){

           String price =  driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[4]")).getText();
           totalAmount += Integer.parseInt(price);

        }

        System.out.println("total amount is " + totalAmount);






        driver.quit();

    }
}
