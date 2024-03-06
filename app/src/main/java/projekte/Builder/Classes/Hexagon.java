package projekte.Builder.Classes;

import java.util.ArrayList;
import java.util.List;

import projekte.util.Display;

public class Hexagon extends Shape {

    public Hexagon(Coordinate startCoordinate) {
        // Hexagon
        super("Hexagon", "A geometrical shape",0, 0,startCoordinate);
    }

    @Override
    public void render() {
        super.renderStartMessage();
        super.getStartCoordinate();

        List<Translation> translations = new ArrayList<>();
        translations.add(new Translation(1,2));
        translations.add(new Translation(1,2));
        translations.add(new Translation(2,0));
        translations.add(new Translation(1,-2));
        translations.add(new Translation(-1,-2));
        translations.add(new Translation(-2,0));

        for (Translation translation : translations) {
            Coordinate newPosition = Coordinate.move(getStartCoordinate(), translation.getX(),translation.getY());
            super.getCoordinates().add(newPosition);
            super.setStartCoordinate(newPosition);
        }

        System.out.println("----");
        for (Coordinate coords : super.getCoordinates()) {
            System.out.println(coords.getX()+" "+coords.getY());
        }
    }
}
