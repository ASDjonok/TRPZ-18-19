package patterns.lab1.composite.variant1;

public class Main {
    public static void main(String[] args) {
        OperationSymbol operationSymbol = null;
        try {
            operationSymbol =
                    new OperationSymbol('%');
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(":)");
    }
}
