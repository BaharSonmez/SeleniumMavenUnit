package day06_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class Odev2 {
    public static <WebElements> void main(String[] args) {
        /*
        -------------------------------------------------------------------------
                ---Project 2-------------------------------------------------------
                1- “https://www.saucedemo.com” Adresine gidin
        2-  Username kutusuna “standard_user” yazdirin
        3-  Password kutusuna “secret_sauce” yazdirin
        4-   Login tusuna basin
        5- Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        6- Add to Cart butonuna basin
        7- Alisveris sepetine tiklayin
        8-  Sectiginiz urunun basarili olarak sepete eklendigini control edin
        9-  Sayfayi kapatin

                -----------------------------------------------------------------------------
        */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         driver.get("https://www.saucedemo.com");
        WebElement usernamebox = driver.findElement(By.xpath("(//*[@class='input_error form_input'])"));
        usernamebox.click();
        usernamebox.sendKeys("standard_user",Keys.ENTER);
        WebElement password =driver.findElement(By.xpath("(//*[@id='password'])"));
        password.sendKeys("secret_sauce",Keys.ENTER);
        WebElement login = driver.findElement(By.xpath("(//*[@class='submit-button btn_action'])"));
        login.submit();
        WebElement firstProduct =driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        firstProduct.click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        WebElement shoppingbox= driver.findElement(By.id("shopping_cart_container"));
        shoppingbox.click();

        String urun = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).getText();
        System.out.println(urun);


//        8-  Sectiginiz urunun basarili olarak sepete eklendigini control edin

        WebElement urunBasarili=driver.findElement(By.xpath("//div[@class='cart_quantity']"));
        String sayi=urunBasarili.getText();

        int intsayi=Integer.parseInt(sayi);

        if (intsayi>=1){
            System.out.println("Test Pass");
        }else System.out.println("Test Fail");


//        9-  Sayfayi kapatin
        driver.close();





    }
}
