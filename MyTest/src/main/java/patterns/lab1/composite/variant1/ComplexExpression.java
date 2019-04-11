package patterns.lab1.composite.variant1;

public class ComplexExpression implements Expression {
    private Expression firstExpression;
    private Expression secondExpression;
    private OperationSymbol operationSymbol;

    public ComplexExpression(Expression firstExpression,
                             OperationSymbol operationSymbol,
                             Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
        this.operationSymbol = operationSymbol;
    }

    @Override
    public String getView() {
        return firstExpression.getView() +
                operationSymbol.getView() +
                secondExpression.getView();
    }
}
