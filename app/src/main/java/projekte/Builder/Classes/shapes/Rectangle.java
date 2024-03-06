package projekte.Builder.Classes.shapes;

import java.util.ArrayList;
import java.util.List;

import projekte.Builder.Classes.Coordinate;
import projekte.Builder.Classes.Translation;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Coordinate startCoordinate, int width, int height) {
        // Rectangle
        super("Rectangle", "A geometrical shape that has 4 corners.",0, 0,startCoordinate);
        this.width = width;
        this.height = height;
    }

    @Override
    public void render() {
        super.renderStartMessage();
        super.getStartCoordinate();

        List<Translation> translations = new ArrayList<>();
        translations.add(new Translation(width,0));
        translations.add(new Translation(0,height));
        translations.add(new Translation(-width,0));
        translations.add(new Translation(0,-height));

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
