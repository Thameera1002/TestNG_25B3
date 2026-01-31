package dependant;

import org.testng.annotations.Test;

public class DependsOnGroupsTest {

    @Test(groups = "Login")
    public void loginTest1() {
        System.out.println("Login Test 1 executed.");
    }

    @Test(groups = "Login")
    public void loginTest2() {
        System.out.println("Login Test 2 executed.");
    }

    @Test(dependsOnGroups = "Login")
    public void dashboardTest() {
        System.out.println("Dashboard Test executed.");
    }
}
