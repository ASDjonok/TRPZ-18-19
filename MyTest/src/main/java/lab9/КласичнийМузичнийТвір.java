package lab9;

import lab8.WrongNameValueException;
import lab8.WrongТривалістьValueException;

import java.io.Serializable;

public class КласичнийМузичнийТвір extends МузичнаКомпозиція implements Serializable {
    private String publicInformation;

    public КласичнийМузичнийТвір(String назва, int тривалість, String publicInformation)
            throws WrongNameValueException, WrongТривалістьValueException {
        this.назва = назва;
        this.тривалість = тривалість;
        this.publicInformation = publicInformation;
    }

    public String getPublicInformation() {
        return publicInformation;
    }

    @Override
    public String toString() {
        return super.toString() + " Public information: " + publicInformation;
    }
}


