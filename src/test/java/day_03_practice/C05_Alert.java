package day_03_practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C05_Alert extends TestBase {
    @Test
    public void test06() {
        //http://demo.guru99.com/test/delete_customer.php adresine gidin
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        //customer id kısmına 53920 yazın
         driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("53920");

        //submit butonuna tıklayın
        driver.findElement(By.xpath("//*[@name='submit']")).click();
        //cıkan alert mesajını yazdırın
        String alertYazisi = driver.switchTo().alert().getText();
        System.out.println("ALERT YAZISI : " + alertYazisi);
        //alerti kabul edin
        driver.switchTo().alert().accept();

        //cıkan 2. alert mesajını yazdırın
       String alertYazisi2 =  driver.switchTo().alert().getText();
        System.out.println("ALERT2 YAZISI=" + alertYazisi2);

        //cıkan 2. alerti kabul edin
        driver.switchTo().alert().accept();


    }
}
