package day_06_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Tekrar01 extends TestBase {
    @Test
    public void testwaits() {
        // https://the-internet.herokuapp.com/dynamic_controls adresine gidiniz
        // Textbox'in etkin olmadıgını(enable) test edin
        // Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        // It's enable! mesajının goruntulendigini test edin
        // Textbox'in etkin oldugunu(enable) test edin
        driver.get(" https://the-internet.herokuapp.com/dynamic_controls");
        WebElement textbox1 =driver.findElement(By.xpath("//input[@text='Enable']"));
        Assert.assertFalse(textbox1.isEnabled());

        WebElement enableButonu = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButonu.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(textbox1));
         WebElement enablemessage = driver.findElement(By.xpath("message"));
         Assert.assertTrue(enablemessage.isDisplayed());





    }
}
