import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Question3> car = new ArrayList<>();
        car.add( new Question3("Hyundai", "iLoad", 2021));
        car.add( new Question3("Ford", "Ranger", 2023));
        car.add( new Question3("Audi", "A3", 2022));
        car.add( new Question3("Toyota", "Corolla", 2021));
        car.add( new Question3("Subaru", "Crosstrek", 2024));

        Collections.sort(car);
        System.out.println("Car List:" + car);
        // car.forEach(object -> {
        //     System.out.println("Car List:" + object.toString());
        // });
        
    }
}
  