package Reptile;

public class Crocodile extends Reptile{
    
// Default Constructor
public Crocodile(){

}

// Parameterized Constructor
public Crocodile(String skinType, String bone, String eggType, int height, int weight, String animalType, String bloodType){
    super(skinType, bone, eggType, height, weight, animalType, bloodType);
}

public void showInfo() {
    System.out.println("Crocodile");
    System.out.println("My skin type: " + this.getSkinType());
    System.out.println("My bone: " + this.getBone());
    System.out.println("My Egg Type: " + this.getEggType());
}
    
}
