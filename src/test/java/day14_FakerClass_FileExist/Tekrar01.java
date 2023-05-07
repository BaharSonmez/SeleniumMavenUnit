package day14_FakerClass_FileExist;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Tekrar01 extends TestBase {
    @Test
    public void action1() {

        //"https://techproeducation.com/" gidin
        // İlk kelime SHIFT tuşuna basılı şekilde, ikinci kelime basılmadan "TECHPRO education" araması yapın.
        //Sayfayi Richmond College Enrollment Form linkine kadar scroll yapalım


        driver.get("https://techproeducation.com/");
        driver.findElement(By.cssSelector("i[class='eicon-close']")).click();
        WebElement search = driver.findElement(By.xpath("//input[@class='elementor-search-form__input']"));
        Actions action = new Actions(driver);
        action.keyDown(search, Keys.SHIFT).sendKeys("techpro").keyUp(search, Keys.SHIFT).
                sendKeys("education",Keys.ENTER).perform();
        WebElement richmondCollege = driver.findElement(By.xpath("(//h3//a)[9]"));
        action.scrollToElement(richmondCollege).perform();



    }
}
