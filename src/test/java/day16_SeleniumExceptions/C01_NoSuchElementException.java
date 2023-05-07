package day16_SeleniumExceptions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class C01_NoSuchElementException extends TestBase {
    @Test
    public void NoSuchElementException() {
       /*
       NoSuchElementException:
         -Sayfada bulunmayan bir elemente erisim saglamaya calisildiginda karsilasilir


        */
        //techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");
        //bir reklam cikiyor onu locate edelim
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
        //Search box bolumunu locate alalim.Type ile alabiliriz
        //driver.findElement(By.xpath("//*[@type='search']")).sendKeys("java", Keys.ENTER);
        //bu dogru locate yanlislikla bir ssearc yazarsak NoSuch Element exeption firlatir.
        driver.findElement(By.xpath("//*[@type='ssearch']")).sendKeys("java", Keys.ENTER);



    }
}
