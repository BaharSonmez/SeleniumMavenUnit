package day_03_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_CheckBox extends TestBase {
    @Test
    public void test02() {
         // https://demo.guru99.com/test/radio.html adresine gidin
        driver.get("https://demo.guru99.com/test/radio.html ");
        // checkbox elementlerini locate edin
        WebElement chechbox1= driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
        WebElement chechbox2= driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
        WebElement chechbox3= driver.findElement(By.xpath("//input[@id='vfb-6-2']"));

        // checkbox1 ve checkbox3  secili degil ise secin
        if(!chechbox1.isSelected()){
            chechbox1.click();
        }
        if(!chechbox3.isSelected()){
            chechbox3.click();
        }

        // checkbox1 ve checkbox3 elementlerinin secili oldugunu Test edin
       Assert.assertTrue(chechbox1.isSelected());
       Assert.assertTrue(chechbox3.isSelected());

        // checkbox2 elementinin secili olmadıgını test edin
        Assert.assertFalse(chechbox2.isSelected());


    }
}
