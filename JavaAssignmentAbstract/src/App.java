import Shape.Cylinder;
import Shape.Sphere;

public class App {
    public static void main(String[] args) throws Exception {

        Cylinder cy = new Cylinder(20, 50);
        cy.getVolume();
        
        Sphere sph = new Sphere(50);
        sph.getVolume();

    }
}
