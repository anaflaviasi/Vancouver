package Shape;

public abstract class Shape {
    protected double radius;

    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Shape(double radius){
        this.radius = radius;
    }
    
    public abstract void getVolume();
}
