package lab8;

public class WrongТривалістьValueException extends RuntimeException{
    public WrongТривалістьValueException() {
//        System.out.println("Проблема в тому, що тривалість композиції <= 0");
    }

    public WrongТривалістьValueException(String message) {
        super(message);
    }
}
