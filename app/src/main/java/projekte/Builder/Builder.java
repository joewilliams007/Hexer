package projekte.Builder;

import java.util.ArrayList;
import java.util.List;

import projekte.Builder.Classes.Coordinate;
import projekte.Builder.Classes.patterns.HexagonPattern;
import projekte.Builder.Classes.patterns.Pattern;
import projekte.Builder.Classes.shapes.Rectangle;
import projekte.Builder.Classes.shapes.Shape;
import projekte.util.Display;

public class Builder {
    private List<Shape> shapes;
    private Coordinate currentCoord;

    /**
     * Creates an instance of the main builder for the coordiantes.
     */
    public Builder() {
        shapes = new ArrayList<>();
        currentCoord = new Coordinate(0,0,0);
    }

    /**
     * Creates the shapes.
     * @param horizontal
     * @param vertical
     */
    public void create(int horizontal, int vertical) {
        // Add shapes
        shapes.add(new HexagonPattern(currentCoord, horizontal, vertical,true));
        // shapes.add(new Rectangle(new Coordinate(0,0,0), 27, 18));
    }

    /**
     * Renders the coordiantes for each shape.
     */
    public void render() {
        List<Coordinate> coords = new ArrayList<>();
        for (Shape shape : shapes) {

            if (shape instanceof projekte.Builder.Classes.patterns.Pattern) {
                Pattern pattern = (Pattern) shape;
                pattern.render();
                for (Shape pShape : pattern.getShapes()) {
                    pShape.render();
                    for (Coordinate coordinate : pShape.getCoordinates()) {
                        coords.add(coordinate);
                    }
                }
            } else {
                shape.render();
                for (Coordinate coordinate : shape.getCoordinates()) {
                    coords.add(coordinate);
                }
            }
        }
        Display.displayCoordinates(coords);
    }
}
