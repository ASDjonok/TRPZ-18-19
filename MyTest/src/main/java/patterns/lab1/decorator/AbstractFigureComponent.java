package patterns.lab1.decorator;

import java.awt.*;

public abstract class AbstractFigureComponent extends Figure {
    private Point point;

    public AbstractFigureComponent(int x, int y) {
        point = new Point(x, y);
    }
}
