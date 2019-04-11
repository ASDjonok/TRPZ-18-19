package patterns.lab1.composite.variant1;

public class Main {
    public static void main(String[] args) {
        Variable variable = new Variable("a");
        System.out.println(variable.getView());
        Constant constant = new Constant(1);
        System.out.println(constant.getView());
        ComplexExpression complexExpression =
                new ComplexExpression(variable,
                        new OperationSymbol('+'),
                        constant);
        System.out.println(complexExpression.getView());

        ComplexExpression complexExpression2 =
                new ComplexExpression(complexExpression,
                        new OperationSymbol('*'),
                        constant);
        System.out.println(complexExpression2.getView());
        /*Variable variable = new Variable("%a");
        System.out.println(variable);*/
        /*OperationSymbol operationSymbol = null;
        try {
            operationSymbol =
                    new OperationSymbol('%');
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }*/
        System.out.println(":)");
    }
}
