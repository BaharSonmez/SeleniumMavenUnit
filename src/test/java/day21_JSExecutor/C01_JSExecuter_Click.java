package day21_JSExecutor;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_JSExecuter_Click extends TestBase {
    /*
    http://www.uitestpractice.com/Students/Form sayfasına git
    Formu doldur
    Submit tuşuna tıkla
    Sayfa adresinin "http://www.uitestpractice.com/Students/Form?optradio=on" olduğunu doğrula.
    */
    //NOT:
    //Eger bir web sayfasinin HTML kodlari tamamen yada kismen  JavaScript kullanilarak olusturulduysa
    //o sayfaya mudahale etmek icin o sayfaya genelliklle JAVASCRIPTEXECUTER arayusu kullanmak gerekir
    // Bu durumda sayfayi manipule etmek veya etkilesimde bulunmak icin standart WebDriver komutlari
    //yetersiz kalabilir. Bu nedenle JSExecuter arayuzu , sayfanin JS kodlarina dogruda erisebilir.
    //Ancak mumkunse WeDriver'in sundugu standart yontemlerle sorunleri cozmek her zmaan daha iyidir
    //Cunku JS kullanimi sayfanin daha yavas yuklenmesine neden olabilir


    @Test
    public void clickByJSTest() {
        driver.get("http://www.uitestpractice.com/Students/Form");
        //formu doldur
        Faker faker = new Faker();
       WebElement firstname = driver.findElement(By.id("firstname"));
       firstname.sendKeys(faker.name().firstName(), Keys.TAB,faker.name().lastName(),Keys.TAB,Keys.TAB,Keys.TAB,
               Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,faker.phoneNumber().cellPhone());

       //Submit tusuna tikla
        WebElement submit = driver.findElement(By.xpath("//*[text()='Submit']"));
       // try {
       //     submit.click();
       // } catch (Exception e) {
        //    JavascriptExecutor js = (JavascriptExecutor) driver;
       //     js.executeScript("arguments[0].click();",submit);
       // }
        click(submit);

        //Burada Exception firlatti
        //org.openga.selenium.ElementClickInterceptedException:Eger JS kodalriyla bir web olusturulmussa
        //normal Click() methodunda bu exception i aliriz

        //Oncelile obejemi olusturucam

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();",submit);


       // Sayfa adresinin "http://www.uitestpractice.com/Students/Form?optradio=on" olduğunu doğrula.
        Assert.assertNotEquals("http://www.uitestpractice.com/Students/Form?optradio=on",driver.getCurrentUrl());





    }
}
