package lab7;

import lab6.КласичнийМузичнийТвір;
import lab6.МузичнаКомпозиція;
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

    @Test(expected = WrongТривалістьValueException.class)
    public void testAddWithException()
            throws WrongNameValueException, WrongТривалістьValueException {
        assertTrue(false);
        try {
            mySet.add(new ПопулярнаКомпозиція("1", 1));
        } catch (WrongNameValueException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testAdd()
            throws WrongNameValueException, WrongТривалістьValueException {
        mySet.add(new ПопулярнаКомпозиція("1", 10));
        assertEquals(1, mySet.size());
    }

    @Test
    public void testContains() {
        МузичнаКомпозиція музичнаКомпозиція =
                new ПопулярнаКомпозиція("2", 20);
        mySet.add(музичнаКомпозиція);
//        музичнаКомпозиція.myMethod();
        музичнаКомпозиція =
                new КласичнийМузичнийТвір("2", 20);
        mySet.add(музичнаКомпозиція);
        assertTrue(mySet.contains(музичнаКомпозиція));
    }

    @Test
    public void testContainsClassCastException() {
        boolean b = mySet.contains(1);
        System.out.println(b);
    }
}
