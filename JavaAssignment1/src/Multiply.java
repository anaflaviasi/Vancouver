import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) throws Exception {
    int result;
    System.out.println("Please enter a number: ");

       try (Scanner scan = new Scanner(System.in)) {
       
           int inputNumber = scan.nextInt();
           result = inputNumber * 10;
           System.out.println("You entered this value :" + inputNumber);
           System.out.println("The result of this multiplication is :" + result);
        }
    }
}