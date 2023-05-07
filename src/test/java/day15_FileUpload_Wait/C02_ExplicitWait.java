package day15_FileUpload_Wait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C02_ExplicitWait extends TestBase {

    @Test
    public void explicitWait() {
    /*
    https://the-internet.herokuapp.com/dynamic_loading/1
    Start buttonuna tıklayın
    Hello World! Yazının sitede oldugunu test edin
     */
     driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
     driver.findElement(By.xpath("//button")).click();
     //   Assert.assertTrue(driver.findElement(By.xpath("(//h4)[2]")).isDisplayed();
        //Bu methodu calistirdigimda hata aldim cunku loading devam ederken Jirada kod calismasini tamamladi yani sayfda
        //bekleme suresi devam ederken alt satira gecti.Ama bizim Hello world yazisi aslinda gorunur durumdaydi.

        //Bir Webelementinin gorunurlugunu implicitlywait ile cozemedik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //1.YOL
        WebElement helloWorldTest = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("(//h4)[2]")));
        //visibilityOfElementLocated webelementin gorunur olmasini bekler...
        Assert.assertTrue(helloWorldTest.isDisplayed());


        //2.YOL
       // WebElement helloWorldText1 = driver.findElement(By.xpath("(//h4)[2]"));
       // wait.until(ExpectedConditions.visibilityOf(helloWorldText1));
       // Assert.assertTrue(helloWorldText1.isDisplayed());

        //2 temel wait vardir.
       // 1- Java based wait == Thread.sleep()
       // 2- Selenium based waits
       // 2.1- implicitly wait
       // Obje olusturmaksizin driver.manage.timeouts... seklinde olusturabiliriz.
      //  2.2- explicitly wait
       // WebDriverWait class'indan obje olusturmaliyiz. Constructor'in icine driverimizi ve Duration koymaliyiz.

        /*
        Thread.Sleep = Javadan gelen bu bekleme ile belirttigimiz sure kadar kodlari bekletir.
        Implictly Wait: Sayfadaki tüm webelementler için max süre kadar sayfanın yüklemesini bekler
        Explict Wait: Belirli bir koşul gerçekleşene kadar belirttiğimiz süre boyunca driver'ın beklemesini sağlar
        Fluent Wait: Belirli bir koşul gerçeklesene kadar belirttiğimiz aralıklarla beklemeye devam eder
         */

    }
}
