package Fish;

import Animal.Animal;

public class Fish extends Animal{
    private String habitat;
    private Boolean hasGills;

    // Default Constructor
    public Fish(){
        this.habitat = "Ocean";
        this.hasGills = false;
    }

    // Parameterized Constructor
    public Fish(String habitat, boolean hasGills, int height, int weight, String animalType, String bloodType){

        super (height, weight, animalType, bloodType);
        
        this.habitat = habitat;
        this.hasGills = hasGills;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Boolean getHasGills() {
        return hasGills;
    }

    public void setHasGills(Boolean hasGills) {
        this.hasGills = hasGills;
    }
     
}
