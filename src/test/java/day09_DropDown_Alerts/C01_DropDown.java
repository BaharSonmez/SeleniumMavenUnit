package day09_DropDown_Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C01_DropDown {
    WebDriver driver;

    @Before

    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }
    /*
    --DropDown Nedir: Alt basliklarin oldugu acilir menu listesi
    --DropDown nasil automate edilir?(Handle):
          a-DropDown menuyu ilk olarak locate ederiz
          b-Select objesi olustururuz
          c-Select objesinin DropDown menu Webelementinin icerigine ve seceneklerine
          erisim saglamasi icin Select sinifina argument olarak Locate ettigimiz
          webelementi koyariz
          ORNEK: Select select= new Select(DDM Webelement)

          d-Select class'i sadece <select> tag'i ile olusturulmus DropDown menulere uygulanabilir.
          e-Select objesi DropDowm menuyu handle edebilmek icin 3 method kullanilir
              --selectByVisibleText()--> Ddm deki elemente gorunur metin ile ulasmak icin kullanilir
              --selectByIndex()-> index ile ulasmak icin kullanilir(index 0 dan baslar)
              --selectByValue()-> Elementin degeri ile ulasmak icin kullanilir(option tag'indeki deger ile)
          f-getOptions()->Locate ettigimiz ddm deki tum secenekleri bize dondurur
          g-getFirstSelectedOption90->Ddm deki en son secili kalan ilk secenegi bize dondurur

     */


    @Test
    public void test02() {
        //a. Tüm eyalet isimlerini yazdıralım
      //  WebElement tumEyaletler = driver.findElement(By.cssSelector("select[id='state']"));
      //  Select select = new Select(tumEyaletler);
       // List<WebElement> stateList = select.getOptions();//Bütün options taglarını getir
        //for (WebElement w:stateList) {
        //    System.out.println(w.getText());
        // }
       // stateList.forEach(t-> System.out.println(t.getText()));

        //a. Tüm eyalet isimlerini yazdıralım
        List<WebElement> tumEyaletler = driver.findElements(By.xpath("//*[@id='state']//option"));
        tumEyaletler.forEach(t-> System.out.println(t.getText()));//Lambda ile yaptik
        System.out.println(tumEyaletler.get(2).getText());
        System.out.println("************" );

        //Sayfadaki tum dropDowndaki tum secenekleri (option) konsolda yazdirin
        List<WebElement> eyaletlerList = driver.findElements(By.tagName("option"));
        eyaletlerList.forEach(t-> System.out.println(t.getText()));



    }



}