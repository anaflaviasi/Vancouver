import java.util.InputMismatchException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("Type 1 : For Adding");
        System.out.println("Type 2 : For Subtraction");
        System.out.println("Type 3 : For Division");
        System.out.println("==============================");

        Scanner sc = new Scanner(System.in);

        int userChoice = 0;
        int number1 = 1;
        int number2 = 1;
        int output = 0;
        String answer = "YES";
        Boolean decision = true;
        Boolean wrongchoice = true;

        while (decision){

            System.out.println("Please enter a choice : ");

            try {

                userChoice = sc.nextInt();

                System.out.println("Please enter First number : ");
                number1 = sc.nextInt();

                System.out.println("Please enter Second number : ");
                number2 = sc.nextInt();

                if (userChoice == 1) {
                    output = number1 + number2;
                }

                if (userChoice == 2) {
                    output = number1 - number2;
                }

                if (userChoice == 3) {
                    output = number1 / number2;
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number which is valid meaning integer");
            } catch (IllegalStateException e) {
                System.out.println("Sorry, scanner is closed now");
            } catch (ArithmeticException e) {
                System.out.println("You cannot divide a number by 0");
            } catch (Exception e) {
                System.out.println("Something went wrong Sorry");
            } finally {
                System.out.println("Your final output is : " + output);
            }

            sc.nextLine();
            System.out.println("Do you want to use calculator again? Say 'YES' or 'NO'");
            answer = sc.nextLine();

            // switch(answer){
            //     case "YES":
            //         decision = true;
            //         break;
            //     case "NO":
            //         decision = false;
            //         break;
            // }  

            if (answer.equals("YES")){
                decision = true;
            }else if (answer.equals("NO")){
                decision = false;
            }else {
                while (wrongchoice){
                    System.out.println("Please enter 'YES' or 'NO', you have to type capital letter.");
                    answer = sc.nextLine();
                    if (answer.equals("YES")){
                        decision = true;
                        break;
                    }else if (answer.equals("NO")){
                        decision = false;
                        break;
                    }else{
                        wrongchoice = true;
                    }     

                }
            }    
        }    
        System.out.println("Thank you for choosing the calculator, BYE BYE!");
        sc.close();
    }
}