package Shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    } 

    public void calculatePerimeter(){
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle  is: " + perimeter);
    }
} 
