package day_05_practice;
import org.junit.Assert;
import org.junit.Test;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
public class C02_Files {
    // Desktop(masaustu)'da bir text dosyası olusturun
    // Desktop(masaustu)'da text dosyasının olup olmadıgını test edin

  //selenium websayfalarını test eder, selenium bilgisayarlarımızdaki dosyalara müdahale veya kontrol edemez.
   // Bu yüzden bilgisayarımızda bir kontrol yaparken Java kullanırız.

    @Test
    public void test01() {
        //    "C:\Users\BURAK                     \Desktop\text"
        String farkiKisim = System.getProperty("user.home");
        System.out.println(farkiKisim);
        String ayniKisim = "\\Desktop\\text";
        System.out.println(ayniKisim);
        String dosyaYolu = farkiKisim + ayniKisim;
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


    }
}























