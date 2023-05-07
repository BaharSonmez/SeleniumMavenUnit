package day08_Assertion_DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_Assertion {

    WebDriver driver;
    /*
1)https://amazon.com adresine gidin
2)Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleriyapin
○ title Test  => Sayfa başlığının “Amazon” kelimesini içerip içermediğini test edin
○ image Test => Amazon resminin görüntülendiğini (isDisplayed()) test edin
○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())
○ wrongTitleTest => Sayfa basliginin “amazon” içermediğini doğrulayın
*/


    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void titleTest() {
        //1.Yol
       // String actualTitle = driver.getTitle();
       // String expectedTitle= "Amazon";
       // Assert.assertTrue(actualTitle.contains(expectedTitle));
        //2.Yol
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        //Eger burada bu basligi icermiyorsa acception verir



    }

    @Test
    public void imageTest() {
      WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
      Assert.assertTrue(logo.isDisplayed());


    }

    @Test
    public void SearcBoxTest() {
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue( aramakutusu.isEnabled());
    }

    @Test
    public void wrongTitleTest() {
        Assert.assertFalse(driver.getTitle().contains("amazon"));
    }


}





