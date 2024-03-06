package projekte.Builder;

import java.util.ArrayList;
import java.util.List;

import projekte.Builder.Classes.Coordinate;

public class Builder {
    private List<Coordinate> coords;
    private int horizontal;
    private int vertical;
    private Coordinate currentCoord;

    /**
     * Creates an instance of the main builder for the coordiantes.
     */
    public Builder() {
        coords = new ArrayList<>();
        currentCoord = new Coordinate(0,0,0);
    }

    public void create(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }
}
