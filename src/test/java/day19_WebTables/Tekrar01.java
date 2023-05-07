package day19_WebTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Tekrar01 extends TestBase {
    @Test
    public void test012() {


        //    https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");
        //    Task 1 : Table1’i yazdırın
     // WebElement tb1  = driver.findElement(By.xpath("//table[1]"));
       // System.out.println(tb1.getText());
        //yada
     List<WebElement> tb1 =  driver.findElements(By.xpath("(//tbody)[1]//tr[3]//td"));
     tb1.forEach(t-> System.out.println(t.getText()+ "--"));


    }
}
