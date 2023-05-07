package day08_Assertion_DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.javadoc.doclet.Doclet;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.List;

public class Tekrar02 extends TestBase {





    @After
    public void tearDown() throws Exception {
     //   driver.close();
    }

    @Test
    public void test01() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        //a. Yil,ay,gün dropdown menu'leri locate ediniz
        //b. Select objesi olustur
        //c. Select object i kullaarak 3 farkli sekilde secim yapiniz

       WebElement ddmYear = driver.findElement(By.id("year"));
       Select select01 = new Select(ddmYear);
       select01.selectByValue("2016");

       WebElement ddmmounth = driver.findElement(By.id("month"));
       Select select02 = new Select(ddmmounth);
       select02.selectByVisibleText("April");

       WebElement ddmday = driver.findElement(By.id("day"));
       Select select03 = new Select(ddmday);
       select03.selectByIndex(3);


    }

    @Test
    public void test02() {

        //a. Tüm eyalet isimlerini yazdıralım
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
       WebElement tumeyaletisim=  driver.findElement(By.id("state"));
       Select select = new Select(tumeyaletisim);
        List<WebElement> eyalaetListeleri = select.getOptions();
       // for(WebElement w:eyalaetListeleri){
       //     System.out.println(w.getText());

        //Simdi bunu LAMBDA lie yapalim
        eyalaetListeleri.stream().forEach(t-> System.out.println(t.getText()));
        }

    @Test
    public void test03() {
        //State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
       WebElement state = driver.findElement(By.id("state"));
      Select select04 = new Select(state);
      String sonsecilen = select04.getFirstSelectedOption().getText();
      System.out.println(sonsecilen);
      Assert.assertEquals(sonsecilen,"Select a State");


    }
}

