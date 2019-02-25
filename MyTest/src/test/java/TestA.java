import org.junit.Assert;
import org.junit.Test;

public class TestA extends Assert {
    @Test
    public void testMyMethod() {
//        assertTrue(A.myMethod() == 2);
        assertEquals(1, A.myMethod());
        /*A a = new ;
        int i = a.myMethod();*/
    }
}
