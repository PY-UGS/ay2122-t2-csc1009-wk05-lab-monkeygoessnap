
public class CircleFromSimpleGeometricObject extends GeometricObject{

    double radius;

    public CircleFromSimpleGeometricObject() {
        super();
    }

    public CircleFromSimpleGeometricObject(double radius) {
        super();
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius; 
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    public void printCircle() {
        
    }
    
}
