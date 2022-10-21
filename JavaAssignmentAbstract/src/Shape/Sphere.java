package Shape;

public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public void  getVolume( ){
        double sphereShape = (4.0 / 3.0) * Math.PI * (radius * radius * radius); 
        System.out.println("Shpere Shape is: " + sphereShape);
    }  

}
 