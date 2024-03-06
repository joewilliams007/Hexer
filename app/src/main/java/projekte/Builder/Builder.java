package projekte.Builder;

import java.util.ArrayList;
import java.util.List;

import projekte.Builder.Classes.Coordinate;
import projekte.Builder.Classes.Hexagon;
import projekte.Builder.Classes.Rectangle;
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
        currentCoord = new Coordinate(0,1,0);
    }

    public void create(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;

        // Build Hexagons.
        boolean lower = false;
        for (int i = 0; i<horizontal;i++) {
            Hexagon hex = new Hexagon(currentCoord);
            shapes.add(hex);

            if (lower) {
                currentCoord = Coordinate.move(currentCoord, 4, -3);
            } else {
                currentCoord = Coordinate.move(currentCoord, 3, 3);
            }
            lower = !lower;
        }

        // Build Rectangle.
        Rectangle rect = new Rectangle(new Coordinate(0,0,0), 27, 9);
        shapes.add(rect);

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
