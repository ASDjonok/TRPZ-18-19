package patterns.lab1.decorator;

public class Oval extends AbstractFigureComponent {
    public Oval(int x, int y) {
        super(x, y);
    }

    @Override
    String show() {
        System.out.println("In Line.show()");
        return "line";
    }
}
