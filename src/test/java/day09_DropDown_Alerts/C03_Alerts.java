package day09_DropDown_Alerts;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_Alerts extends TestBase {
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
    public void alerts() throws InterruptedException {

        //https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
   driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

   //     1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “You successfully clicked an alert” oldugunu test edin.
  //              Bir metod olusturun: dismissAlert
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        Thread.sleep(20000);
        driver.switchTo(). //Gecmek ,Degistirmek
                alert().  //Alert'e gecis yap
                accept();//Cikan uyarida OK yada Tamama a basar.
        //2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        //    “successfuly” icermedigini test edin.
        String actualText = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedText = "You succesfully clicked an alert";
        Assert.assertEquals(expectedText,actualText);



    }

    @Test
    public void dismissAlert() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");


        // Bir metod olusturun: dismissAlert
      //  2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
     //    “successfuly” icermedigini test edin.
        driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
        Thread.sleep(15000);
        driver.switchTo().alert().dismiss();
        String actualTest = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedText ="successfuly";
        Assert.assertFalse(actualTest.contains(expectedText));


    }

    @Test
    public void sendKeysAlert() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
//    3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
//    tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("Erol");
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
        Assert.assertTrue(result.getText().contains("Erol"));
        System.out.println(result.getText());
    }
}
