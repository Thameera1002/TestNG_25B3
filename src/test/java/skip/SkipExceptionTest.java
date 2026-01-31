package skip;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipExceptionTest {

    @Test
    public void testMethod() {
        //boolean conditionToSkip = true; // This condition can be based on any logic
        boolean conditionToSkip = false; // This condition can be based on any logic
        if(!conditionToSkip){
            throw new SkipException("Skipping this test method as the condition is not met.");
        }else {
            System.out.println("This test method is executed.");
        }


    }
}
