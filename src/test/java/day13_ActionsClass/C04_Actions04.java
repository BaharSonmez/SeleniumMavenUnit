package day13_ActionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;

public class C04_Actions04 extends TestBase {
    @Test
    public void actions() {

        /*
    https://jqueryui.com/droppable/ adresine gidin
    "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
     */
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement dragSource =driver.findElement(By.id("draggable"));
        WebElement dropTarget  =driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragSource,dropTarget).perform();
        //Source(drag) webelementini alip Target(drop) webelementinin uzerine tasir

    }

    @Test
    public void actions02() {
        //Ayni soruyu baska bir yontemle cozuyoruz
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement dragSource =driver.findElement(By.id("draggable"));
        WebElement dropTarget  =driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(dragSource).//WebElementi tututp bekler
                moveToElement(dropTarget).//mouse elementin uzerine tasir
                release().perform();
        //serbest birakir




    }
}
