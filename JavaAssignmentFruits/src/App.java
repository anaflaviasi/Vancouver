public class App {
    public static void main(String[] args) throws Exception {
        
        Fruits Apple = new Fruits("Apple", "Red", 1, true, 0.50, 1 );

        System.out.println("Fruit: " + Apple.getName());
        System.out.println("Color: " + Apple.getColor());
        System.out.println("Tasty: " + Apple.getIsTasty());

        System.out.println("\n");
        
        Apple.addQuantity(5, 0.99, 5);
        System.out.println("Adding Quantities");
        System.out.println("Weight: " + Apple.getWeight());
        System.out.println("Price: " + Apple.getPrice()); 
        System.out.println("Quantity: " + Apple.getQuantity());

        System.out.println("\n");

        Apple.removeQuantity(1, 0.50, 2);
        System.out.println("Removing Quantities");
        System.out.println("Weight: " + Apple.getWeight());
        System.out.println("Price: " + Apple.getPrice()); 
        System.out.println("Quantity: " + Apple.getQuantity());








    }
}
