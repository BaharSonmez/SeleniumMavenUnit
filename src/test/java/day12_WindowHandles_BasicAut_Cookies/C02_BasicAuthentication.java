package day12_WindowHandles_BasicAut_Cookies;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_BasicAuthentication extends TestBase {
    @Test
    public void BasicAuthentication() {
        /*
    Aşağıdaki bilgileri kullanarak authentication yapınız:
    Url: https://the-internet.herokuapp.com/basic_auth
    Username: admin
    Password: admin
    Başarılı girişi doğrulayın.
     */
  //Bizim bu siteye otomasyonla gecmemiz icin soyle yapariz
        //Authentication : "https://admin:admin@the-internet.herokuapp.com/basic_auth" yazariz

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

      //Paragrafin "congratulations" kelimesini icerdigini dogrulayin

        WebElement paragraph = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(paragraph.getText().contains("Congratulations"));
    }

}
