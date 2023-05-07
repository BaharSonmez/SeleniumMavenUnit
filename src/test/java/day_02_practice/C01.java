package day_02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {
        // https://www.amazon.com/ adresine gidin
        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz
        // arama kutusunun, name attribute'nun degerinin 'field-keywords' oldugunu test edin
        // sayfayi kapatiniz

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramakutusu =  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        String actualname =aramakutusu.getTagName();
        String expectedname = "input";
        if(actualname.contains(expectedname)){
            System.out.println("TESTED PASSED");
        }else System.out.println("TESTED FAILED");

        String actualNameDegeri =aramakutusu.getAttribute("name");
        String expectedNamedegeri = "field-keywords";

        if(expectedNamedegeri.equals(actualNameDegeri)){
            System.out.println("name attributenin degeri field keyword");

        }else{
            System.out.println("name attributenin degeri field keywords degil");
        }

         driver.close();





    }
}
