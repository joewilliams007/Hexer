package projekte.Builder.Classes.patterns;

import java.util.ArrayList;
import java.util.List;

import projekte.Builder.Classes.Coordinate;
import projekte.Builder.Classes.shapes.Shape;

public class Pattern extends Shape {
    private List<Shape> shapes;
    private int horizontal;
    private int vertical;
    private Coordinate currentCoord;

    /**
     * A Pattern consists of multiple shapes.
     * @param startCoordinate
     * @param horizontal
     * @param vertical
     */
    public Pattern(Coordinate startCoordinate, int horizontal, int vertical) {
        super("Pattern", "A pattern contains a collection of shapes.",startCoordinate);
        this.shapes = new ArrayList<>();
        this.currentCoord = startCoordinate;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public Coordinate getCurrentCoord() {
        return currentCoord;
    }

    public void setCurrentCoord(Coordinate currentCoord) {
        this.currentCoord = currentCoord;
    }
}
