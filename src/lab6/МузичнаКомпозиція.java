package lab6;

public class МузичнаКомпозиція {
    private String назва;

    public МузичнаКомпозиція(String назва) {
        this.назва = назва;
    }

    @Override
    public String toString() {
        return назва;
    }
}
