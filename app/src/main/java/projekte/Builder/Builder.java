package projekte.Builder;

import java.util.ArrayList;
import java.util.List;

import projekte.Builder.Classes.Coordinate;
import projekte.Builder.Classes.Hexagon;
import projekte.Builder.Classes.Shape;
import projekte.util.Display;

public class Builder {
    private List<Shape> shapes;
    private int horizontal;
    private int vertical;
    private Coordinate currentCoord;

    /**
     * Creates an instance of the main builder for the coordiantes.
     */
    public Builder() {
        shapes = new ArrayList<>();
        currentCoord = new Coordinate(0,0,0);
    }

    public void create(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;

        for (int i = 0; i<4;i++) {
            Hexagon hex = new Hexagon(currentCoord);
            shapes.add(hex);
            currentCoord = Coordinate.move(currentCoord, 0, 5);
        }

        List<Coordinate> coords = new ArrayList<>();
        for (Shape shape : shapes) {
            shape.render();
            for (Coordinate coordinate : shape.getCoordinates()) {
                coords.add(coordinate);
            }
        }
        Display.displayCoordinates(coords);
    }
}
