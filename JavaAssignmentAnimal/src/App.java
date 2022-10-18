import Animal.Animal;
import Bird.Eagle;
import Fish.Eel;
import Reptile.Crocodile;

public class App {
    public static void main(String[] args) throws Exception {
        
        Crocodile croc = new Crocodile();
        croc.setEggType("Hard-shelled eggs");
        croc.setHeight(200);
        croc.setWeight(500);
        croc.setAnimalType("Reptile");
        croc.setBloodType("Warm");
        croc.showInfo();
        croc.showInfoAnimal();

        System.out.println("\n");

        Eel el = new Eel();
        el.setHasGills(true);
        el.setHeight(50);
        el.setWeight(10);
        el.setAnimalType("Aquatic vertebrate");
        el.setBloodType("Cold");
        el.showInfo();
        el.showInfoAnimal();

        System.out.println("\n");
    
        Eagle eag = new Eagle();
        eag.setHasFeathers(true);
        eag.setCanFly(true);
        eag.setHeight(70);
        eag.setWeight(120);
        eag.setAnimalType("");
        eag.setBloodType("Warm");
        eag.showInfo();
        eag.showInfoAnimal();

    }
}
