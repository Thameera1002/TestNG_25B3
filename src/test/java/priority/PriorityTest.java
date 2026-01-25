package priority;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 4)
    public  void a(){
        System.out.println("This is A method");
    }

    @Test(priority = 3)
    public void ab(){
        System.out.println("This is AB method");
    }

    @Test(priority = 2)
    public void abc(){
        System.out.println("This is ABC method");
    }

    @Test
    public void ecd(){
        System.out.println("This is ABCD method");
    }

    @Test(priority = -2)
    public void b(){
        System.out.println("This is B method");
    }
}
