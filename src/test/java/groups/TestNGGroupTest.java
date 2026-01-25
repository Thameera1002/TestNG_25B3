package groups;

import org.testng.annotations.*;

public class TestNGGroupTest {

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

    @Test(groups = {"smoke"})
    public void testMethod1() {
        System.out.println("I'm Test Method1");
    }

    @Test(groups = {"smoke"})
    public void testMethod2() { System.out.println("I'm Test Method2");}

    @Test(groups = {"regression"})
    public void testMethod3() {
        System.out.println("I'm Test Method3");
    }

    @Test(groups = {"smoke", "regression"})
    public void testMethod4() {
        System.out.println("I'm Test Method4");
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
