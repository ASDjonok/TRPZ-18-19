package patterns.lab1.decorator;

public class ColorDecorator extends AbstractDecorator {
    private Figure figure;

    public ColorDecorator(Figure figure) {
        this.figure = figure;
    }

    @Override
    String show() {
        System.out.println("In ColorDecorator.show()");
        return "red " + figure.show();
    }
}
