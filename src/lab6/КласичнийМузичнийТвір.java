package lab6;

import lab8.WrongNameValueException;
import lab8.WrongТривалістьValueException;

public class КласичнийМузичнийТвір extends МузичнаКомпозиція {
    public КласичнийМузичнийТвір(String назва, int тривалість)
            throws WrongNameValueException, WrongТривалістьValueException {
        super(назва, тривалість);
    }
}
