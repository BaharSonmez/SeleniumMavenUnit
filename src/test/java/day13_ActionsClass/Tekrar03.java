package day13_ActionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Tekrar03 extends TestBase {
     /*
     https://techproeducation.com adresine gidin
     Sayfanın alt tarafına gidin
     Sayfanın üst tarafına gidin
     */

    @Test
    public void action03() {
        driver.get("https://techproeducation.com ");
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        bekle(2);
        action.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

    }


}
