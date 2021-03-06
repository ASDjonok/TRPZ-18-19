package patterns.lab1.decorator;

public class Line extends AbstractFigureComponent {
    public Line(int x, int y) {
        super(x, y);
    }

    @Override
    String show() {
        System.out.println("In Line.show()");
        return "line";
    }
}
