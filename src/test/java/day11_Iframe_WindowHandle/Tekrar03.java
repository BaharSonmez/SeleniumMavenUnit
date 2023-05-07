package day11_Iframe_WindowHandle;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class Tekrar03 extends TestBase {
    @Test
    public void test9() {
        //https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        //İlk sayfanın ID'sini(Window Handle değerini) alın.
        String firstPageHnd = driver.getWindowHandle();
        //Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String text = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("Opening a new window",text);

        //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String sayfaBasli = driver.getTitle();
        Assert.assertEquals("The Internet",sayfaBasli);
        //"Click Here" butonuna tıklayın.
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();
        //Açılan pencereye geçin.
        List<String> acilanYeniWindow = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(acilanYeniWindow.get(1));

        //Açılan yeni pencerenin sayfa başlığının(title) “New Window” olduğunu doğrulayın.
         String ilkSayfaBaslik = driver.getTitle();
         Assert.assertEquals("New Window",ilkSayfaBaslik);


        //Bir önceki pencereye dönüp sayfa başlığının “The Internet” olduğunu  doğrulayın.
        driver.switchTo().window(acilanYeniWindow.get(0));
        String firstPage = driver.getTitle();
        Assert.assertEquals("The Internet",firstPage);
        bekle(2);
        //2. pencereye tekrar geçin.
        driver.switchTo().window(acilanYeniWindow.get(1));
        bekle(2);
        //1. pencereye tekrar dönün.
        driver.switchTo().window(acilanYeniWindow.get(0));




    }
}
