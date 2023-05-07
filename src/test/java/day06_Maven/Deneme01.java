package day06_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class Deneme01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com");

        //arama kutusunu locate edelim
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //“Samsung headphones” ile arama yapalim
        aramakutusu.sendKeys("Samsung headphones", Keys.ENTER);

        //Bulunan sonuc sayisini yazdiralim

        // WebElement sonucsyisi = driver.findElement(By.xpath("//*[text()='1-16 of 221 results for']"));
        //   System.out.println("Sonuc sayisi = " + sonucsyisi.getText());// Bu yanlis cunku ben ileride Iphone aratirsam
        //hata verir
        // o yuzden hemen bir ust satirindaki Class ATTRIBUTE ile Locate edicem

        WebElement sonucsayisi = driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(sonucsayisi.getText());
        String[] aramasonuc = sonucsayisi.getText().split(" ");
        System.out.println("Bulunan sonuc sayisi =" + aramasonuc[2]);

        //Ilk urunu tiklayalim
        //Sayfadaki tum basliklari yazdiralim
       driver.findElement(By.xpath("(//*[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")).click();
     List<WebElement> sayfaBasliklari = driver.findElements(By.xpath("//h1"));
     for(WebElement w:sayfaBasliklari){
         System.out.println(w.getText());
     }
     //LAMBDA ILE YAZALIM
        sayfaBasliklari.forEach(t-> System.out.println(t.getText()));
     //sayfayi kapatin
        driver.close();


    }
}
