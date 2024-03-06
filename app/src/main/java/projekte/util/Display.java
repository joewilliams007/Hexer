package projekte.util;

import java.util.List;

import projekte.Builder.Classes.Coordinate;

public class Display {
    public static void displayCoordinates (List<Coordinate> coords) {
        int field[][];
        int size = 20;
        field = new int[size][size];
        for (Coordinate coord : coords) {
            field[coord.getX()][coord.getY()] = 1;
        }
        for (int x = 0; x<size; x++) {
            System.out.println("");
            for (int y = 0; y<size; y++) {
                if (field[x][y] == 1) {
                    System.out.print("x");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }
}
