package Bird;

import Animal.Animal;

public class Bird extends Animal {
    private Boolean hasFeathers;
    private Boolean canFly;
    
  // Default Constructor
  public Bird(){
    this.hasFeathers = false;
    this.canFly = false;
  }

  // Parameterized Constructor
  public Bird(Boolean hasFeathers, boolean canFly, int height, int weight, String animalType, String bloodType){
    super (height, weight, animalType, bloodType);

    this.hasFeathers = hasFeathers;
    this.canFly = canFly;
}

  public Boolean getHasFeathers() {
    return hasFeathers;
  }

  public void setHasFeathers(Boolean hasFeathers) {
    this.hasFeathers = hasFeathers;
  }

  public Boolean getCanFly() {
    return canFly;
  }

  public void setCanFly(Boolean canFly) {
    this.canFly = canFly;
  }




}
