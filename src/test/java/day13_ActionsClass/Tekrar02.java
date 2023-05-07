package day13_ActionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Tekrar02 extends TestBase {
    @Test
    public void test02() {

        //Amazon anasayfasına gidin
        //"Account & List" üzerinde bekleyin (mouse over - hover over)
        // //Açılan menüde "Account" linkine tıklayın
        //Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın
        driver.get("https://amazon.com");
        WebElement accountBox = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
        Actions action = new Actions(driver);
        action.moveToElement(accountBox).perform();
        driver.findElement(By.xpath("//*[text()='Account']")).click();
        Assert.assertEquals("Your Account",driver.getTitle());



    }
}
