package lab7;

import lab6.ПопулярнаКомпозиція;
import lab8.WrongNameValueException;
import lab8.WrongТривалістьValueException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMySet extends Assert {
    MySet mySet;

    @Before
    public void before() {
        mySet = new MySet();
    }

    @Test
    public void testMySet() {
        assertEquals(0, mySet.size());
    }

    @Test
    public void testAdd()
            throws WrongNameValueException, WrongТривалістьValueException {
        mySet.add(new ПопулярнаКомпозиція("1", 1));
        assertEquals(1, mySet.size());
    }
}
