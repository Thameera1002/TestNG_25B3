package listners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class) // Attach the custom listener to this test class
public class CustomListnerTest {


    @Test
    public void testPassed() {
        System.out.println("This test is designed to pass.");
    }

    @Test
    public void testFailed() {
        System.out.println("This test is designed to fail.");
        Assert.assertTrue(false);
    }

    @Test
    public void testSkipped() {
        System.out.println("This test is designed to be skipped.");
        throw new org.testng.SkipException("Skipping this test intentionally.");
    }
}
