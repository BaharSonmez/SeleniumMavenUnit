package day17_ScreenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tekrar01 extends TestBase {

    @Test
    public void screen02() throws IOException {
    driver.get("https://amazon.com");
   String dosyaYolu = "testOutput/screenshot.png";
   TakesScreenshot ts = (TakesScreenshot) driver;
   FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE) ,new File(dosyaYolu));
    }

    @Test
    public void test01() throws IOException {
        driver.get("https://amazon.com");
        String date = new SimpleDateFormat("hh,ss,mm,ddMMyy").format(new Date());
        String dosyaYolu3 ="testOutput/screenshot"+date+".png";
        TakesScreenshot ts = (TakesScreenshot) driver;
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyaYolu3));
    }
}
