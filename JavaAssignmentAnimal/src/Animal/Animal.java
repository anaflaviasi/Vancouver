package Animal;

public class Animal {
    private int height;
    private int weight;
    private String animalType;
    private String bloodType;

    // Default Constructor
    public Animal(){
        this.height = 0;
        this.weight = 0;
        this.animalType = "Unknown";
        this.bloodType = "Unknown";
    }

    // Parameterized Constructor
    public Animal(int height, int weight, String animalType, String bloodType){
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void showInfoAnimal(){
        System.out.println("My Height: " + this.getHeight());
        System.out.println("My Weight: " + this.getWeight());
        System.out.println("My Type: " + this.getAnimalType());
        System.out.println("My Blood: " + this.getBloodType());
    }
}
