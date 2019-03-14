package lab9;

import lab8.WrongNameValueException;
import lab8.WrongТривалістьValueException;

public abstract class МузичнаКомпозиція /*implements Serializable*/ {
    protected String назва;
    protected int тривалість;

    public МузичнаКомпозиція() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj.toString().equals(toString());
    }

    public МузичнаКомпозиція(String назва, int тривалість)
            throws WrongNameValueException, WrongТривалістьValueException {
        if (назва == null) {
            throw new WrongNameValueException();
        }
        if (тривалість <= 0) {
            throw new WrongТривалістьValueException("Проблема в тому, що тривалість композиції <= 0, і не можна " +
                    "створити такий трек");
        }
        this.назва = назва;
        this.тривалість = тривалість;
    }

    public int віддайТривалість() {
        return тривалість;
    }

    @Override
    public String toString() {
        String simpleName = this.getClass().getSimpleName();
        return (назва != null
                ? назва + " " + simpleName + " "+ тривалість + " с"
                : simpleName) + ".";
    }
}
