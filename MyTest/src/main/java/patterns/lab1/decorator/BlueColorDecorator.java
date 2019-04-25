package patterns.lab1.decorator;

public class BlueColorDecorator extends AbstractColorDecorator {

    public BlueColorDecorator(Figure figure) {
        super(figure);
    }

    @Override
    String show() {
        System.out.println("In BlueColorDecorator.show()");
        return "blue " + figure.show();
    }
}
