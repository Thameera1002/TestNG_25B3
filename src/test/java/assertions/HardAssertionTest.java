package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionTest {

    @Test
    public void assertionTest(){
        System.out.println("A");
        System.out.println("B");
        Assert.assertEquals("A","A");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");
        Assert.assertTrue(false);
        System.out.println("F");
    }
}
