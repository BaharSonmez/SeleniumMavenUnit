package day07_Junit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class C04_BeforeClassAfterClass {
    /*
    @BeforeClass ve @AfterClass methodlari sadece static methodalr ile calisir

     */

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Tum testlerden once bir kez calisir");

    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Class taki Tum testlerden sonra bir kez calisir");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Her test methodundan once");
    }

    @Test
    public void test01() {
        System.out.println("ilk test");
    }

    @Test
    public void test02() {
        System.out.println("Ikinci test");
    }
}
