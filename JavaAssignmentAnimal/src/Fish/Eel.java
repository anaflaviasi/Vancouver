package Fish;

public class Eel extends Fish {
    private Boolean eletricCharge;

// Default Constructor
public Eel(){
   this.eletricCharge = true;

}

// Parameterized Constructor
public Eel(Boolean eletricCharge, String habitat, boolean hasGills, int height, int weight, String animalType, String bloodType){
    super (habitat, hasGills, height, weight, animalType, bloodType);

    this.eletricCharge = eletricCharge;


}

public Boolean getEletricCharge() {
    return eletricCharge;
}

public void setEletricCharge(Boolean eletricCharge) {
    this.eletricCharge = eletricCharge;
}  

public void showInfo() {
    System.out.println("Eel");
    System.out.println("Eletric Charge: " + this.getEletricCharge());
    System.out.println("My Habitat: " + this.getHabitat());
    System.out.println("Do I have gills? " + this.getHasGills() );
    
}
}
