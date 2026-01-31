package parallel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class B {
    long startTime ;

    @BeforeClass
    public void beforeClass() {
        startTime = System.currentTimeMillis();
    }

    @AfterClass
    public void afterClass() {
        long endTime = System.currentTimeMillis();
        System.out.println("\n\nTotal Time taken: " + (endTime - startTime) + " milliseconds");
    }

    @Test
    public void testMethod1() throws InterruptedException {
        System.out.println("Class B Test Method 1 - Thread ID: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Test Method 1 - Count: " + i);
        }
    }

    @Test
    public void testMethod2() throws InterruptedException {
        System.out.println("Class B Test Method 2 - Thread ID: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1500);
            System.out.println("Test Method 2 - Count: " + i);
        }
    }

    @Test
    public void testMethod3() throws InterruptedException {
        System.out.println("Class B Test Method 3 - Thread ID: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            System.out.println("Test Method 3 - Count: " + i);
        }
    }

    @Test
    public void testMethod4() throws InterruptedException {
        System.out.println("Class B Test Method 4 - Thread ID: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(2500);
            System.out.println("Test Method 4 - Count: " + i);
        }
    }
}
