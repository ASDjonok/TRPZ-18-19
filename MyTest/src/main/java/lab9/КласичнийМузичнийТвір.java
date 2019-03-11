package lab9;

import lab8.WrongNameValueException;
import lab8.WrongТривалістьValueException;

import java.io.Serializable;

public class КласичнийМузичнийТвір extends МузичнаКомпозиція implements Serializable {
    public КласичнийМузичнийТвір(String назва, int тривалість)
            throws WrongNameValueException, WrongТривалістьValueException {
        this.назва = назва;
        this.тривалість = тривалість;
    }
}
