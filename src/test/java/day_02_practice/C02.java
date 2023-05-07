package day_02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.lang.reflect.Array;
import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
          // https://www.google.com/ adresine gidin
        // sayfa baslıgının "Google" kelimesini icerdigini test edin
        // arama cubuguna "Nutella" yazıp aratın
        // bulunan sonuc sayısını yazdırın
        // sonuc sayısının 100000000  fazla oldugunu test edin
        // sayfayı kapatın

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@class='QS5gu sy4vM'])")).click();
        System.out.println("Google sayfa basligi = " + driver.getTitle());

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("TESTED PASSED");
        }else System.out.println("TESTED FAILED");

        WebElement searchbox =driver.findElement(By.xpath("(//*[@class='gLFyf'])"));
        searchbox.sendKeys("Nutella", Keys.ENTER);
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@id='result-stats'])"));
        System.out.println("sonucYazisi= "+ sonucYazisi.getText());
        String arr[] = sonucYazisi.getText().split(" ");
        String sonuc = arr[1];
        System.out.println(sonuc);

       String sonucc = sonuc.replaceAll("\\D","");

       if(Integer.parseInt(sonucc)>100000000){
           System.out.println("Sonuc sayisi 100000000'den fazla");

       }else{
           System.out.println("Sonuc sayisi 100000000 dan fazla degil");
       }

      driver.close();









    }
}
