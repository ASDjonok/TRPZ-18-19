package lab6;

import lab8.WrongNameValueException;
import lab8.WrongТривалістьValueException;

public class РокКомпозиція extends МузичнаКомпозиція {
    public РокКомпозиція(String назва, int тривалість)
            throws WrongNameValueException, WrongТривалістьValueException {
        super(назва, тривалість);
    }
}
