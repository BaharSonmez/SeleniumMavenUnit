package day14_FakerClass_FileExist;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownloadTest extends TestBase {
    @Test
    public void fileDownload() {
        /*
        https://testcenter.techproeducation.com/index.php?page=file-
       //download    adresine gidelim.
      // b10 all test cases dosyasını indirelim
      //  Dosyanın başarıyla indirilip indirilmediğini test edelim

         */

        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
        bekle(2);



         driver.findElement(By.xpath("(//a)[3]")).click();
         //Dosyanin basariyla indirilip indirilmedigini test edin
        bekle(5);

        //Ilk ol,arak dosya yolununaliyoruz
        //ben biliyorum ki once indirilenlere gelicek
        String dosyaYolu = System.getProperty("user.home") +"/Downloads/b10 all test cases, code.docx";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }
}
