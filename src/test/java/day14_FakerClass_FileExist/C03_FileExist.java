package day14_FakerClass_FileExist;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist {
    @Test
    public void fileExist() {
     //Masa ustunde bir dosya olusturalim ve bu dosyanin varligini dogrulayalim
        System.out.println(System.getProperty("user.dir"));//c:selenium/B129
        //user.dir : icinde bulunan klasorun yolunu verir

        System.out.println(System.getProperty("user.home"));//localimizin kullanici yolunu verir

        //String dosyaYolu ="C:\\Users\\VeBa-C\\Desktop\\bahar.txt";//Shifte basili iken sag klik yap uzantiyi al
        String farkliKisim = System.getProperty("user.home");//Her kullanicinin ana yolu farkli oldugu icin farkli dedik
        String ortakKisim= "\\OneDrive\\Masaustu\\bahar.txt";
        String dosyaYolu = farkliKisim+ortakKisim;//Dosya yolu olarak farkli kisim ve ortak kismi aldik
        //
        // Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));




    }
}
