package day_06_practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class test02 extends TestBase {
    @Test
    public void test66() {

        // https://www.teknosa.com/ adresine gidin
        driver.get("https://www.teknosa.com");
        // arama cubuguna oppo yazip enter'a basınız
        driver.findElement(By.id("button-1580496494")).click();
        driver.switchTo().alert().accept();


        WebElement armbtn = driver.findElement(By.xpath("//button[@class='search-button js_search_button sbx-fake btn-search']"));
        armbtn.sendKeys("oppo", Keys.ENTER);
        // sonuc sayisini yazdiriniz
        // ilk urunun fotografını cekin
        // cikan ilk urune tiklayiniz
        // iki ArrowDown sayfayı asagiya kaydirin
        // sepete ekleyiniz
        // sepetim'e git tilayiniz
        // "Siparis Ozeti" webelementinin text'ini yazdiriniz
        // Alisverisi tamamlayiniz
        // "Teknosa'ya hos geldiniz" webelementinin text'ini yazdiriniz


    }
    }

