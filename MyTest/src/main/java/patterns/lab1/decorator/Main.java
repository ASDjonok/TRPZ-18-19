package patterns.lab1.decorator;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Line(1, 2);

        //----

        figure = new RedColorDecorator(figure);
        figure = new LineTypeDecorator(figure);
        figure = new BlueColorDecorator(figure);

        //----

        System.out.println(figure.show());
    }
}
