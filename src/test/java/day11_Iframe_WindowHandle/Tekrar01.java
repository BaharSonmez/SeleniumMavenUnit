package day11_Iframe_WindowHandle;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.ArrayList;

public class Tekrar01 extends TestBase {
    /*
    //Tech Pro education Window 1'de adresine gidiniz
    //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
    //Window 2'de https://www.youtube.com sayfasını açınız:
    //Window 3'te https://www.linkedin.com sayfasını açınız:
    //techproeducation sayfasına geçiniz:
    //youtube sayfasına geçiniz:
    //linkedIn sayfasına geçiniz:
     */

    @Test
    public void test01() {
        driver.get("https://techproeducation.com");
        String techpro = driver.getWindowHandle();
        String tecprobaslik = driver.getTitle();
        Assert.assertTrue(tecprobaslik.contains("Techpro Education | Online It Courses & Bootcamps"));

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        String youtube = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedIn = driver.getWindowHandle();

        driver.switchTo().window(techpro);
        bekle(2);
         driver.switchTo().window(youtube);
         bekle(2);
         driver.switchTo().window(linkedIn);

         //Ben 3 tane pencere actim ve handle degerlerini aldim. Eger handle degerlerini almazsam soyle yapabilirim
        //Butun actigim pencerelerin Handle degerlerini bir ArrayListe atayacagim

       // List<String> tumWindowList = new ArrayList<String>(driver.getWindowHandles());
        //sonra ben cagirmak istedigim window sayfasinin indexini yazarsam o sayfa gelir

        //driver.switchTo().window(tumWindowList.get(0));




    }
}
