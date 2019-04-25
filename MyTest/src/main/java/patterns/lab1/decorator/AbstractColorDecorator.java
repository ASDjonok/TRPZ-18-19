package patterns.lab1.decorator;

public abstract class AbstractColorDecorator extends AbstractDecorator {

    public AbstractColorDecorator(Figure figure) {
        this.figure = figure;
    }

    /*@Override
    String show() {
        System.out.println("In AbstractColorDecorator.show()");
        return "red " + figure.show();
    }*/
}
