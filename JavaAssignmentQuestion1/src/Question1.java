import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Integer number = 0;

        ArrayList<Integer> array = new ArrayList<>(10);
        array.add(1);
        array.add(15);
        array.add(20);
        array.add(25);
        array.add(30);
        array.add(35);
        array.add(40);
        array.add(42);
        array.add(45);
        array.add(50);
        System.out.println(array);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a number from the list: ");
        number = sc.nextInt();

        System.out.println("The number is in the list? " + array.contains(number));
    }
    
}
