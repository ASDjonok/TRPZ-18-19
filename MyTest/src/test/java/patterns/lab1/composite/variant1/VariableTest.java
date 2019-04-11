package patterns.lab1.composite.variant1;

import org.junit.Assert;
import org.junit.Test;

public class VariableTest extends Assert {
    @Test
    public void validCreateVariable() {
        Variable variable = new Variable("a");
    }
    @Test(expected = IllegalArgumentException.class)
    public void invalidCreateVariableWithFirstDigitSymbol() {
        Variable variable = new Variable("1a");
    }
    @Test(expected = IllegalArgumentException.class)
    public void invalidCreateVariableWithFirstPercentSymbol() {
        Variable variable = new Variable("%a");
    }
}
