package lab6;

import lab8.WrongNameValueException;
import lab8.WrongТривалістьValueException;

public class ПопулярнаКомпозиція extends МузичнаКомпозиція {
    public ПопулярнаКомпозиція(String назва, int тривалість)
            throws WrongNameValueException, WrongТривалістьValueException {
        super(назва, тривалість);
    }

    public void myMethod(){}
}
