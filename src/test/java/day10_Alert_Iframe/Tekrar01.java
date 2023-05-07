package day10_Alert_Iframe;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Tekrar01 extends TestBase {
    @Test
    public void test01() {

        //➢   https://testcenter.techproeducation.com/index.php?page=iframe
        //➢   Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin   oldugunu test
        // edelim
        //➢   Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
        //➢   Son olarak footer daki ‘Povered By’ yazisini varligini test edilip

        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");
        String actualText1 = driver.findElement(By.xpath("//p[text()='An iframe with a thin black border:']")).getText();
        Assert.assertTrue(actualText1.contains("black border"));
        driver.switchTo().frame(0);
        String actual2 =driver.findElement(By.xpath("//*[text()='Applications lists']")).getText();
        Assert.assertTrue(actual2.contains("Applications lists"));
        driver.switchTo().defaultContent();
        WebElement powerYazisi = driver.findElement(By.xpath("//*[text()='Povered By']"));
        Assert.assertTrue(powerYazisi.getText().contains("Povered By"));


    }
}
