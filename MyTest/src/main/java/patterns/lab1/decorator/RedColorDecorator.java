package patterns.lab1.decorator;

public class RedColorDecorator extends AbstractColorDecorator {

    public RedColorDecorator(Figure figure) {
        super(figure);
//        this.figure = figure;
    }

    @Override
    String show() {
        System.out.println("In RedColorDecorator.show()");
        return "red " + figure.show();
    }
}
