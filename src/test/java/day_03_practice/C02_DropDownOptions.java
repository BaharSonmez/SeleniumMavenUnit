package day_03_practice;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class C02_DropDownOptions extends TestBase {
    // https://www.amazon.com/ sayfasina gidin
    // dropdown'dan "Baby" secenegini secin
    // sectiginiz option'i yazdirin
    // dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin
    // dropdown'daki optionların tamamını yazdırın


    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
        WebElement ddm =driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select  select =new Select(ddm);
        select.selectByVisibleText("Baby");
       String sectigimopsiyon = select.getFirstSelectedOption().getText();
        System.out.println("SECTIGIM OPSIYON =" + sectigimopsiyon);

        List<WebElement> optionlar = select.getOptions();
        int exceptedopSayis = 28;
        int actualOpSay = optionlar.size();
        Assert.assertEquals(exceptedopSayis,actualOpSay);
        //optionlar.stream().forEach(t-> System.out.println(t));
        int sayac = 1;
        for(WebElement w:optionlar){
            System.out.println(sayac +" . option: " + w.getText());

        }




    }
}

