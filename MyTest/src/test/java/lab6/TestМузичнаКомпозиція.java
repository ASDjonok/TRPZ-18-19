package lab6;

import lab8.WrongNameValueException;
import lab8.WrongТривалістьValueException;
import org.junit.Test;

public class TestМузичнаКомпозиція {
    @Test
    public void testМузичнаКомпозиція()
            throws WrongNameValueException, WrongТривалістьValueException {
        МузичнаКомпозиція музичнаКомпозиція =
                new ПопулярнаКомпозиція("123", 1);
    }

    @Test(expected = WrongТривалістьValueException.class)
    public void testМузичнаКомпозиціяException()
            throws WrongNameValueException, WrongТривалістьValueException {
        МузичнаКомпозиція музичнаКомпозиція =
                new ПопулярнаКомпозиція("123", 0);
    }

    /*@Test(expected = WrongТривалістьValueException.class)
    public void testМузичнаКомпозиціяException()
            throws WrongNameValueException, WrongТривалістьValueException {
        МузичнаКомпозиція музичнаКомпозиція =
                new ПопулярнаКомпозиція("123", 0);
    }*/
}
