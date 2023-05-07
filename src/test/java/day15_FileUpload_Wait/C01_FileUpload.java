package day15_FileUpload_Wait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_FileUpload extends TestBase {
    @Test
    public void fileUpload() {
        /*
        NOT: Bir Web sayfasinda upload islemi yapmamiz gerekirse:
        1-Oncelikle upload edecegimiz webelemnti locate ederiz
        2-Upload edecegimiz dosya yolunu bir String e assign ederiz
        3-Locate ettigimiz webelemnte  sendkeys methodu ile dosya yolunu aldigimiz string degiskenini gondeririz.


         https://the-internet.herokuapp.com/upload adresine gidin
         Batch129.txt  dosyasını yükleyin(upload)
         “File Uploaded!” textinin görüntülendiğini test edin
         */
        driver.get("https://the-internet.herokuapp.com/upload ");
        WebElement dosyaSecWbelement = driver.findElement(By.xpath("//*[@id='file-upload']"));
        bekle(3);
        String dosyaYolu = "C:\\Users\\VeBa-C\\Desktop\\Batch129.txt";
       //2.Yol   String dosya = System.getProperty("user.home")+ "Desktop\\Batch129.txt";
        dosyaSecWbelement.sendKeys(dosyaYolu);
        bekle(3);
        driver.findElement(By.id("file-submit")).click();

        //burada dosyanin gorunurlugunu test ediyoruz...
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());


    }
}
