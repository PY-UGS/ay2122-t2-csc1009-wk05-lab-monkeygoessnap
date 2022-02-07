
import java.util.Date;

public class GeometricObject {

    String color;
    boolean filled;
    Date dateCreated;

    public GeometricObject() {
        //empty constructor
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString() {
        return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
    }
    
}
