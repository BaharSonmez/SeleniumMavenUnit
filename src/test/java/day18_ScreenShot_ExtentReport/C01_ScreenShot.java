package day18_ScreenShot_ExtentReport;

import org.junit.Test;
import utilities.TestBase;

public class C01_ScreenShot extends TestBase {
    @Test
    public void ScreenShotTest01() {
        //Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");

        //Sayfanin resmini alalim
        tumSayfaResmi();
        //Sonra amazon sayfasina gidelim
        driver.get("https://amazon.com");
        //Amazon sayfasinin ekran goruntusunu alalim
        tumSayfaResmi();


    }
}
