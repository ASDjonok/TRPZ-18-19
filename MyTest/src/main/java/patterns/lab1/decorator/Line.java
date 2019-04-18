package patterns.lab1.decorator;

public class Line extends Figure {
    @Override
    String show() {
        System.out.println("In Line.show()");
        return "line";
    }
}
