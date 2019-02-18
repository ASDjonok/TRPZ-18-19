package lab6;

import lab8.WrongNameValueException;

public class РокКомпозиція extends МузичнаКомпозиція {
    public РокКомпозиція(String назва, int тривалість) throws WrongNameValueException {
        super(назва, тривалість);
    }
}
