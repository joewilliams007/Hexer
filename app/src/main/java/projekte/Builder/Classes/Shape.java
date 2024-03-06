package projekte.Builder.Classes;

import java.util.List;

import projekte.util.Logger;

public class Shape {
    private List<Coordinate> coordinates;
    private int inlineThickness;
    private int outlineThickness;
    private String name;
    private String description;

    /**
     * The main shape.
     * @param inlineThickness The level of extrusion in the inside direction.
     * @param outlineThickness The level of extrusion in the outside direction.
     * @param name The name of the shape.
     * @param description The description of the shape.
     */
    public Shape(int inlineThickness, int outlineThickness, String name,
            String description) {
        this.inlineThickness = inlineThickness;
        this.outlineThickness = outlineThickness;
        this.name = name;
        this.description = description;
    }

    public void render() {
        Logger.log("main shape does not render");
    }

    public void renderStartMessage() {
        Logger.log("Rendering "+name+".");
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public int getInlineThickness() {
        return inlineThickness;
    }

    public void setInlineThickness(int inlineThickness) {
        this.inlineThickness = inlineThickness;
    }

    public int getOutlineThickness() {
        return outlineThickness;
    }

    public void setOutlineThickness(int outlineThickness) {
        this.outlineThickness = outlineThickness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
