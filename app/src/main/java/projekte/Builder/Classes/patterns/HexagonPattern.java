package projekte.Builder.Classes.patterns;

import projekte.Builder.Classes.Coordinate;
import projekte.Builder.Classes.shapes.Hexagon;
import projekte.Builder.Classes.shapes.Rectangle;

public class HexagonPattern extends Pattern {
    private int horizontal;
    private int vertical;
    private boolean isEdges;

    /*
     * A pattern that contains hexagons.
     */
    public HexagonPattern(Coordinate startCoordinate,int horizontal, int vertical, boolean isEdges) {
        super(startCoordinate,horizontal,vertical);
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.isEdges = isEdges;
    }

    @Override
    public void render() {
        super.renderStartMessage();

        if (isEdges) {
            setCurrentCoord(new Coordinate(getCurrentCoord().getX(),getCurrentCoord().getY()+1,getCurrentCoord().getZ()));
        }

        boolean lower = false;
        Coordinate endCoordinate = new Coordinate(0, 0, 0);

        for (int y = 0; y<vertical;y++) {
            for (int x = 0; x<horizontal;x++) {
                Hexagon hex = new Hexagon(getCurrentCoord());
                getShapes().add(hex);
    
                if (lower) {
                    setCurrentCoord(Coordinate.move(getCurrentCoord(), 4, -3));
                } else {
                    setCurrentCoord(Coordinate.move(getCurrentCoord(), 3, 3));
                }
                setEndCoordinate(endCoordinate);
                lower = !lower;
            }
            setCurrentCoord(new Coordinate(0,getCurrentCoord().getY()+9,getCurrentCoord().getZ()));
            setEndCoordinate(endCoordinate);
        }

        if (isEdges) {
            getShapes().add(new Rectangle(Coordinate.move(getStartCoordinate(), 0, 0), Coordinate.move(endCoordinate, -1, 0)));
        }
    }

    private void setEndCoordinate(Coordinate coord) {
        if (getCurrentCoord().getX()>coord.getX()) {
            coord.setX(getCurrentCoord().getX());
        }
        if (getCurrentCoord().getY()>coord.getY()) {
            coord.setY(getCurrentCoord().getY());
        }
    }
}
