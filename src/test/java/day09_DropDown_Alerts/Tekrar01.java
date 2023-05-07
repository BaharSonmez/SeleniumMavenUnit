package day09_DropDown_Alerts;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Tekrar01 extends TestBase {
     /*

    https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
    Bir metod olusturun: acceptAlert
1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “You successfully clicked an alert” oldugunu test edin.
    Bir metod olusturun: dismissAlert
2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
“successfuly” icermedigini test edin.
    Bir metod olusturun: sendKeysAlert
3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
    tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
    */

    @Test
    public void tekrar01() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        driver.switchTo().alert().accept();

        String  result = driver.findElement(By.id("result")).getText();
        String excepted ="You successfully clicked an alert";
        Assert.assertEquals(result,excepted);

    }

    @Test
    public void dissmisalert() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss();
        String  actualrslt =driver.findElement(By.xpath("//*[@id='result']")).getText();
        String excepted ="successfully";
        Assert.assertFalse(actualrslt.contains(excepted));
    }

    @Test
    public void sendKeys() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//*[text() ='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Bahar");
        Thread.sleep(15);
        driver.switchTo().alert().accept();
        String resultName =driver.findElement(By.xpath("//*[text()='You entered: Bahar']")).getText();
        String exceptedName ="Bahar";
        Assert.assertTrue(resultName.contains(exceptedName));


    }
}
