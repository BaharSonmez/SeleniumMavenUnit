package day18_ScreenShot_ExtentReport;

import com.mongodb.MapReduceCommand;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 extends TestBase {
    @Test
    public void test03() throws IOException {
        driver.get("https://amazon.com");
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyy").format(new Date());
        String dosyayl= "testOutput/screenshot"+tarih+"pmg";
        TakesScreenshot ts = (TakesScreenshot) driver;
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyayl));





    }


}
