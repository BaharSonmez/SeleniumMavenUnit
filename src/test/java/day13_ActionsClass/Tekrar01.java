package day13_ActionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Tekrar01 extends TestBase {
    @Test
    public void action1() {
         /*
        https://the-internet.herokuapp.com/context_menu  sitesine gidin
        Kutuya sağ tıklayın
        Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
        Tamam diyerek alert’i kapatın
         */

       driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement kutu = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(kutu).perform();

        String alertkutu= driver.switchTo().alert().getText();
        System.out.println(alertkutu);
        Assert.assertEquals("You selected a context menu",alertkutu);
        driver.switchTo().alert().accept();

    }
}
