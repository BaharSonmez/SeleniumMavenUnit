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
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class Tekrar {
    static  WebDriver driver;

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
        WebDriver  driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
    }

    @Test
    public void titletest() {

      String  actualtitle = driver.getTitle();
      String expectedTitle = "Amazon";
      // if(actualtitle.contains(expectedTitle)){
      //    System.out.println("Tested passed");
      // }else System.out.println("Tested failed");
      // Assert.assertTrue(driver.getTitle().contains("Amazon"));
      Assert.assertTrue(actualtitle.contains(expectedTitle));


    }

    @Test
    public void image() {
      WebElement logo = driver.findElement(By.xpath("//*[@id='nav-logo-sprites']"));
      Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    public void searchbox() {
       WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
       Assert.assertTrue(searchbox.isEnabled());
    }

    @Test
    public void title() {
       Assert.assertFalse(driver.getTitle().contains("amazon"));
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}
