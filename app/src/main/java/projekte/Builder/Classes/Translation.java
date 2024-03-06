package projekte.Builder.Classes;

public class Translation {
    private int x;
    private int y;
    private int z;
    
    public Translation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Translation(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
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
}
