package projekte.Builder.Classes;

public class Coordinate {
    private int x;
    private int y;
    private int z;
    
    public Coordinate(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    /**
     * Creates a point and moves it to the desired location from the previous point.
     * @param coord The previous end point.
     * @param xTranslation
     * @param yTranslation
     * @param zTranslation
     * @return
     */
    public static Coordinate move(Coordinate coord, int xTranslation, int yTranslation, int zTranslation) {
        return new Coordinate(coord.getX()+xTranslation, coord.getY()+yTranslation, coord.getZ()+zTranslation);
    }

        /**
     * Creates a point and moves it to the desired location from the previous point.
     * @param coord The previous end point.
     * @param xTranslation
     * @param yTranslation
     * @return
     */
    public static Coordinate move(Coordinate coord, int xTranslation, int yTranslation) {
        return new Coordinate(coord.getX()+xTranslation, coord.getY()+yTranslation,coord.getZ());
    }
}
