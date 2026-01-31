package dependant;

import org.testng.annotations.Test;

public class DependsOnMethodsTest {

    @Test
    public void makeFoundation() {
        System.out.println("Foundation is laid.");
    }

    @Test(dependsOnMethods = {"makeFoundation"})
    public void makeWalls() {
        System.out.println("Walls are built.");
    }

    @Test(dependsOnMethods = {"makeFoundation","makeWalls"})
    public void makeRoof() {
        System.out.println("Roof is constructed.");
    }

    @Test(dependsOnMethods = {"makeFoundation","makeWalls","makeRoof"})
    public void supplyElectricity() {
        System.out.println("Electricity is supplied.");
    }

    @Test(dependsOnMethods = {"makeFoundation","makeWalls","makeRoof"})
    public void supplyWater() {
        System.out.println("Water is supplied.");
    }


}
