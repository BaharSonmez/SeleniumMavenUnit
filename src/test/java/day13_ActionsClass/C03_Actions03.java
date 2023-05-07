package day13_ActionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03_Actions03 extends TestBase {
    /*
     https://techproeducation.com adresine gidin
     Sayfanın alt tarafına gidin
     Sayfanın üst tarafına gidin
     */

    @Test
    public void actions () {

        driver.get("https://techproeducation.com ");
        bekle(2);
        driver.findElement(By.xpath("//*[class='eicon-close']")).click();
        //Sayfanın alt tarafına gidin
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        //Sayfanın üst tarafına gidin

        action.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).sendKeys(Keys.ARROW_DOWN).perform();
        //perform () ile Action objemi isleme aliyorum

    }

    @Test
    public void actions02() {
        driver.get("https://techproeducation.com ");
        bekle(2);
        driver.findElement(By.xpath("//*[class='eicon-close']")).click();
        //Sayfanin alt tarafina gidin
        Actions action = new Actions(driver);
        action.sendKeys(Keys.END);
        //Sayfan ust tarafina gidin
        action.sendKeys(Keys.HOME).build().perform();//perform ile action objemi isleme alir
        //build() birden fazla olusturdugumuz action objesini birbirine baglayabiliriz

    }

    @Test
    public void actions03() {
        //Amazon anasayfasina gidi
        driver.get("https://amazon.com");
        //Arama kutusuna buyuk harfle SAMSUNG ARATIN
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys(Keys.SHIFT,"s","a",Keys.SHIFT,"msung");
        driver.navigate().back();
        WebElement aramaKutusu2 = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu2.sendKeys(Keys.SHIFT,"iphone");


    }
}
