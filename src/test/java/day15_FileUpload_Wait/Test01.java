package day15_FileUpload_Wait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Test01 extends TestBase {
    @Test
    public void test01() {
   driver.get("https://the-internet.herokuapp.com/upload");
   WebElement chooseFile = driver.findElement(By.id("file-upload"));
   bekle(3);

   String dosyaYolu= "C:\\Users\\VeBa-C\\Desktop\\Batch129.txt";
   chooseFile.sendKeys(dosyaYolu);
   driver.findElement(By.id("file-submit")).click();
   WebElement upload = driver.findElement(By.xpath("//h3"));


    }
}
