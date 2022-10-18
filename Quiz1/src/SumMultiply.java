import java.util.Scanner;

public class SumMultiply {
    public static void main (String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a integer number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter another integer number: ");
        int secondNumber = scan.nextInt();
        int resultSum = firstNumber + secondNumber;
        int resultMult = firstNumber * secondNumber;

        System.out.println("The sum of them is :" + resultSum);
        System.out.println("The product of them is :" + resultMult);
    }
}
