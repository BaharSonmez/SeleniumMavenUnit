package day16_SeleniumExceptions;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03_NullPointerException  {
    /*
    NullPointerException:
       Degisken olusturup bu degiskene atama yapmadigimizda yada esitlemedigimizde NullPointerException hatasi aliriz
            */

    WebDriver driver;
    Faker faker;
    Actions actions;
    Integer sayi;
    int number;
    String isim;

    @Test
    public void NullPointerException() {
        driver.get("https://amazon");
        //driver objeme atama yapmadigim icin java.lang.Nullpointer exception hatasi alriz
        //yani biz driver= new ChromeDriver(); atamasini yapmadigimiz icin bu hatayi aliriz

    }

    @Test
    public void Test02() {
        System.out.println(faker.name().firstName()); //Java.lang.Nullpointer exception hatasi aldik
        //cunku objemize atama yapmadik yani
        // faker = new Faker(); atamasini yapmadik
    }

    @Test
    public void NullPointerExceptionTest03() {
        //bu atamayi yapmadigim icin asagida hata aldim
        // actions = new Actions(driver);
        actions.doubleClick().perform();//java.lang.NullPointerException hatasi verdi

    }

    @Test
    public void NullPopinterExceptionTest04() {
        //sayi degiskenine atama yapilmadigi icin  java.lang.NullPointerException hatasi aldik
        //sayi = 5
        System.out.println(sayi+5);

    }

    @Test
    public void NullPointerExceptionTest05() {
        isim = "Erol";
        System.out.println(isim.charAt(0));
    }

    @Test
    public void Test06() {
        System.out.println(number);
    }
}



