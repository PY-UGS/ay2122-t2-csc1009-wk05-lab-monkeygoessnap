public abstract class Shape {
    
    double pi;
    double dim1;
    double dim2;
    
    public Shape(double dim1, double dim2) {
        this.pi = 3.14;
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();

}
