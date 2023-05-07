package day18_ScreenShot_ExtentReport;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 extends TestBase {
    @Test
    public void test9() throws IOException {
        //Amazon sayfasina gidiniz
        driver.get("https:/amazon.com");
        //Arama bolumunde Iphone aratiniz
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //Sonuc yazisinin resmini aliniz
       WebElement sonucY =  driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
       String date1= new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
       String dosyaYolu2 = "testOutput/Webelementsonuc"+date1+"png";
        FileUtils.copyFile(sonucY.getScreenshotAs(OutputType.FILE) ,new File(dosyaYolu2));
        //tekrar techpro sayfasina gecelim




    }
}
