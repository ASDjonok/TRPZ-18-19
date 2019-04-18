package patterns.lab1.decorator;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Line();

        //----

        figure = new ColorDecorator(figure);
        figure = new LineTypeDecorator(figure);

        //----

        System.out.println(figure.show());
    }
}
