public class Fruits {
    
 private String name;
 private String color;
 private int  weight;
 private Boolean isTasty;
 private Double price;
 private int  quantity;


 // Default Constructor
 public Fruits(){
    this.name = "Unknown";
    this.color = "Unknown";
    this.weight = 0;
    this.isTasty = true;
    this.price = 0.00;
    this.quantity = 0;
 }
    
 // Parameterized Constructor
 public Fruits( String name, String color, int  weight, Boolean isTasty, Double price, int  quantity){
    this.name = name;
    this.color = color;
    this.weight = weight;
    this.isTasty = isTasty;
    this.price = price;
    this.quantity = quantity;
 }

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public int getWeight() {
    return weight;
}

public void setWeight(int weight) {
    this.weight = weight;
}

public Boolean getIsTasty() {
    return isTasty;
}

public void setIsTasty(Boolean isTasty) {
    this.isTasty = isTasty;
}

public Double getPrice() {
    return price;
}

public void setPrice(Double price) {
    this.price = price;
}

public int getQuantity() {
    return quantity;
}

public void setQuantity(int quantity) {
    this.quantity = quantity;
}

public void addQuantity(int  weight, Double price, int  quantity){
    this.weight += weight;
    this.price += price;
    this.quantity += quantity;
}

public void removeQuantity(int  weight, Double price, int  quantity){
    this.weight -= weight;
    this.price -= price;
    this.quantity -= quantity;
}
 
}
