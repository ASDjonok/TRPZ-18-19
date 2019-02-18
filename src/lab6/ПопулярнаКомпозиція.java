package lab6;

import lab8.WrongNameValueException;

public class ПопулярнаКомпозиція extends МузичнаКомпозиція {
    public ПопулярнаКомпозиція(String назва, int тривалість) throws WrongNameValueException {
        super(назва, тривалість);
    }
}
