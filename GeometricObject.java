public class GeometricObject {

    private String color;
    private boolean filled;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter method for color
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter method for color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter method for filled. Since filled is boolean,
     * so, the get method name is isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Setter method for filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Return a string representation of this object
     */
    public String toString() {
        return "Color: " + color + "and filled: " + filled;
    }
}