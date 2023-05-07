package day07_Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class C02_BeforeAfter {
   @Before
    public void setUp(){
       System.out.println("Her test methodu oncesi bir kes calisir");
   }
   @After
    public void tearDown (){
       System.out.println("Her test methodu sonrasi bir kez calisir");
   }
   @Before
   public void tear(){
       System.out.println("Deneme");
   }

    @Test
    public void test01() {
        System.out.println("Ilk Test");
    }

    @Test
    public void test02() {
        System.out.println("Ikinci test");


    }
}


