package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

    SoftAssert softAssert;
    @Test
    public void assertionTest(){
        softAssert = new SoftAssert();
        System.out.println("A");
        System.out.println("B");
        softAssert.assertEquals("A","B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");
        softAssert.assertTrue(false);
        System.out.println("F");
        softAssert.assertAll();
    }
}
