package day11_Iframe_WindowHandle;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class Tekrar02 extends TestBase {
    /*
   https://the-internet.herokuapp.com/iframe sayfasına gidiniz
   Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
   Textbox içindeki yazıyı siliniz.
   Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
   Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
    */

    @Test
    public void FrameTest() {
        driver.get("https://the-internet.herokuapp.com/iframe");
       WebElement yazi01= driver.findElement(By.xpath("//*[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(yazi01.getText().contains("Editor"));
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.xpath("//p"));
        textBox.clear();
        textBox.sendKeys("Bu textbox Iframe icinde yer almaktadir");
        driver.switchTo().defaultContent();
        WebElement SeleniumText =driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        Assert.assertTrue(SeleniumText.isDisplayed());


    }
}
