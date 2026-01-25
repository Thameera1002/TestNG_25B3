package annotations;

import org.testng.annotations.*;

public class TestNGAnnotationTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I'm Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("I'm Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("I'm Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I'm Before Method");
    }

    @Test
    public void testMethod() {
        System.out.println("I'm Test Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I'm After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I'm After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I'm After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I'm After Suite");
    }


}
