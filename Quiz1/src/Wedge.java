import java.util.Scanner;

public class Wedge {
    public static void main(String[] args) {
        
        System.out.println("Enter the initial number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        String item = "";
        for (int i = 0; i <= number; i++ ) {
            item = item + "@";
        }
        System.out.println(item); 
        
        for ( int i = number; (i <= number && i > 0); i--) {
            item = item.substring(0, item.length()-1);
            System.out.println(item);
        }
        
    }
}