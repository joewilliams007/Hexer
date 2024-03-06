package projekte.Builder.Classes.patterns;

import projekte.Builder.Classes.Coordinate;
import projekte.Builder.Classes.shapes.Hexagon;

public class HexagonPattern extends Pattern {
    private int horizontal;
    private int vertical;

    public HexagonPattern(Coordinate startCoordinate,int horizontal, int vertical) {
        super(startCoordinate,horizontal,vertical);
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override
    public void render() {
        super.renderStartMessage();

        boolean lower = false;
        for (int i = 0; i<horizontal;i++) {
            Hexagon hex = new Hexagon(getCurrentCoord());
            getShapes().add(hex);

            if (lower) {
                setCurrentCoord(Coordinate.move(getCurrentCoord(), 4, -3));
            } else {
                setCurrentCoord(Coordinate.move(getCurrentCoord(), 3, 3));
            }
            lower = !lower;
        }
    }
}
