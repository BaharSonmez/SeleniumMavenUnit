package day12_WindowHandles_BasicAut_Cookies;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class Tekrar001 extends TestBase {
    @Test
    public void autenct() {
           /*
    Aşağıdaki bilgileri kullanarak authentication yapınız:
    Url: https://the-internet.herokuapp.com/basic_auth
    Username: admin
    Password: admin
    Başarılı girişi doğrulayın.
     */
        //Bizim bu siteye otomasyonla gecmemiz icin soyle yapariz

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //Paragrafin "congratulations" kelimesini icerdigini dogrulayin

       WebElement girisDog=  driver.findElement(By.xpath("//p"));
        Assert.assertTrue(girisDog.getText().contains("Congratulations"));

    }

    @Test
    public void cookies() {
        //1-Amazon anasayfaya gidin
        //2-tum cookie’leri listeleyin
        //3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        //4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        //5-ismi “en sevdigim cookie” ve degeri “"'cikolatali'"” olan bir cookie  olusturun ve sayfaya ekleyin
        //6-eklediginiz cookie’nin sayfaya eklendigini test edin
        //7-ismi skin olan cookie’yi silin ve silindigini test edin
        //8-tum cookie’leri silin ve silindigini test edin


        //1
        driver.get("https://amazon.com");
        //2
        List<Cookie> cookiset = new ArrayList<Cookie>(driver.manage().getCookies());
        int sayac= 1;
        for (Cookie w:cookiset){
            System.out.println(sayac+ ".inci cookie"+w);
            System.out.println("Name :"+w.getName());
            System.out.println("Value :"+w.getValue());
            sayac++;

        }
        //3
        int cookiesayisi = cookiset.size();
        System.out.println("cookies sayisi = "+ cookiesayisi);
        Assert.assertTrue(cookiesayisi>5);
        //4
       String actualname = driver.manage().getCookieNamed("i18n-prefs ").getValue();
       Assert.assertEquals("USD",actualname);
       //5
        Cookie cookienew = new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(cookienew);
      //6



    }
}
