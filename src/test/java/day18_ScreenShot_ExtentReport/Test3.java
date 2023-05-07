package day18_ScreenShot_ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Test3 extends TestBase {


    @Test
    public void test01() {
        driver.get("http://a.testaddressbook.com");
       WebElement frame = driver.findElement(By.xpath("//*[@src='//www.herokucdn.com/error-pages/no-such-app.html']"));
       driver.switchTo().frame(frame);

      WebElement tus=  driver.findElement(By.className("btn"));
      tus.click();






    }


}








