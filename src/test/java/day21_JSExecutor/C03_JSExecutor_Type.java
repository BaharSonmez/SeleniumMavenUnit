package day21_JSExecutor;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_JSExecutor_Type extends TestBase {
    @Test
    public void typeTest() {

        //Techpro education ana sayfasina git
        driver.get("https://techproeducation.com");
        bekle(2);
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();


        //Aarama kutusuna QA yaz
        WebElement arakutusu = driver.findElement(By.xpath("//*[@title='Search']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        /*
        Bazi giris kutulari normal sendKeys () methodu ile metin gonderilmesine izin vermez.
        Bu gibi durumlarda asagidaki ornekteki gibi JSExecutor kullanilir
         */
        //js.executeScript("arguments[0].value='QA'",arakutusu);
        sendKeysJS(arakutusu,"QA");
        /*
        Eger js.executeScript("argumants[0].value='QA'",aramakutusu); bu kullanimdaki metin gonderemezsek asagidaki
        ornekteki gibi value attribute'ne deger atayabiliriz.

         */
        js.executeScript("argumnets[0].setAttribute('value','QA')",arakutusu);

        sendAttributeJS(arakutusu,"QA");

    }

}
