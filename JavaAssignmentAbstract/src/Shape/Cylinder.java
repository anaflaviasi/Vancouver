package Shape;

public class Cylinder extends Shape {
    private double height;

    // Parameterized Constructor
    public Cylinder(double height, double radius) {
        super(radius);

        this.height = height;
    }

    @Override
    public void  getVolume( ){
        double cylinderShape = Math.PI * (radius * radius) * height; 
        System.out.println("Cylinder Shape is: " + cylinderShape);
    } 
}
