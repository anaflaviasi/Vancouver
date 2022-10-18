package Bird;

public class Eagle extends Bird{

// Default Constructor
public Eagle(){

}   

// Parameterized Constructor
public Eagle(Boolean hasFeathers, boolean canFly, int height, int weight, String animalType, String bloodType){
    super (hasFeathers, canFly, height, weight, animalType, bloodType);

}

public void showInfo() {
    System.out.println("Eagle");
    System.out.println("Do I have feathers? " + this.getHasFeathers());
    System.out.println("Can I fly? " + this.getCanFly());

}  
    
}
