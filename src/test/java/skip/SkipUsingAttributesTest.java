package skip;

import org.testng.annotations.Test;

public class SkipUsingAttributesTest {

    @Test
    public void testMethod1() {
        System.out.println("This is test method 1.");
    }

    @Test(enabled = false)
    public void testMethod2() {
        System.out.println("This is test method 2.");
    }

    @Test
    public void testMethod3() {
        System.out.println("This is test method 3.");
    }
}
