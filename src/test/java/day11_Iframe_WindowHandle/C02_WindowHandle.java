package day11_Iframe_WindowHandle;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class C02_WindowHandle extends TestBase {
    /*
    //Window 1'de adresine gidiniz
    //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
    //Window 2'de https://www.youtube.com sayfasını açınız:
    //Window 3'te https://www.linkedin.com sayfasını açınız:
    //techproeducation sayfasına geçiniz:
    //youtube sayfasına geçiniz:
    //linkedIn sayfasına geçiniz:
     */

    @Test
    public void windowHandle() {
        driver.get("https://www.techproeducation.com");
        String techproWindowHandle = driver.getWindowHandle();//TechPro sayfasinin handle degerini bir Stringe assing ettik
        String actualTitle= driver.getTitle();
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";
        Assert.assertEquals(expectedTitle,actualTitle);

        //Window 2'de https://www.youtube.com sayfasını açınız:
        driver.switchTo(). //gecis yap
                newWindow(WindowType.WINDOW);//yeni bir pencereye driveri tasir
        //-->WindoeType.Tab ---> Yeni sekme acar..
        driver.get("https://www.youtube.com ");
        String youtubeWindowHandle = driver.getWindowHandle();
        // //Window 3'te https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedWindowHandle = driver.getWindowHandle();

        //List<String> tumWindowList = new ArrayList<String>(driver.getWindowHandles());//Butun actigim pencerelerin handle
        //degerlerini bir ARRAYLIST E atmis oldum ve alttakilari yoruma aldim

        //techproeducation sayfasına geçiniz:
        driver.switchTo().window(techproWindowHandle);
        //driver.switchTo().window(tumWindowList.get(0));

        bekle(3);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(youtubeWindowHandle);
        bekle(3);
        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(linkedWindowHandle);




    }
}

