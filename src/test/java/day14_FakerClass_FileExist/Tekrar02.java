package day14_FakerClass_FileExist;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Tekrar02 extends TestBase {
    @Test
    public void file() {
        //Masa ustunde bir dosya olusturalim ve bu dosyanin varligini dogrulayalim
        System.out.println(System.getProperty("user.dir"));
        String dosyaYolu ="C:\\Users\\VeBa-C\\Desktop\\New Text Document.txt";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


    }
}
