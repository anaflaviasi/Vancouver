import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import Student.Student;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student student1 = new Student();
        ArrayList<Student> listStudent = new ArrayList<>();
        ArrayList<Student> oldDelListStudent = new ArrayList<>();
        ArrayList<Student> oldUpdListStudent = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        char option;
        String function;
        Boolean decision = true;
        Boolean studentFound = false;
        // String answer;

        System.out.println("===============================================");
        System.out.println("========= School Management System ============");
        System.out.println("===============================================");
        
        do {
            System.out.println("1. Student");
            System.out.println("2. Enrollment");
            System.out.println("3. Attendance");
            System.out.println("4. Transcript");
            System.out.println("5. Invoice");
            System.out.println("6. Exit");
            System.out.println();
            System.out.println("Choose one of the options above to start your task: ");
            option = sc.next().charAt(0);


            switch(option) {
                case '1' : //Student
                function =  student1.showMenu();
                
                while (decision){

                    studentFound = false;

                    if (function.equals("M")){ // Menu
                        function =  student1.showMenu();
                        if (function.equals("E")){
                            decision = false;
                        }
                        else{
                            decision = true;
                        }
                    }
                    

                    if (function.equals("I")){ // Input
                        try {
                        student1.inputStudent();
                        }catch (InputMismatchException e) {
                            System.out.println("Please enter a number which is valid meaning integer");
                        } finally {
                            listStudent.add( new Student (student1.getId(), student1.getName(), student1.getProgram()));
                            System.out.println("You have just included the Student(s) in the system: " + listStudent);
                                                                    
                            sc.nextLine();
                            System.out.println("Do you want to include a new Student in the system?");
                            System.out.println("Say 'I' for 'Input' or 'M' for the Menu");
                            function = sc.nextLine();
                            if (function.equals("I") || function.equals("M")){
                                decision = true;
                            }
                            else if (function.equals("E")){
                                decision = false;
                            }
                        } 
                    } 
                    

                    if (function.equals("D")){ // Display
                        try {
                        student1.searchStudent();    

                        }catch (InputMismatchException e) {
                            System.out.println("Please enter a number which is valid meaning integer");
                        } finally {
                            for(int i = 0; i < listStudent.size(); i++){
                                if (listStudent.get(i).getId() == student1.getId()){
                                    System.out.println("Student: " + listStudent.get(i));
                                    studentFound = true;
                                    break;
                                }
                            }
                            if (studentFound == false){
                                System.out.println("Student is not registered in the system.");
                            }
                            sc.nextLine();
                            System.out.println("Do you want to display a student?");
                            System.out.println("Say 'D' for 'Display' or 'M' for the Menu");
                            function = sc.nextLine();
                            if (function.equals("D") || function.equals("M")){
                                 decision = true;
                             }
                             else if (function.equals("E")){
                                 decision = false;
                             }                                
                        } 
                    }   


                    if (function.equals("U")){ // Update
                        try {
                        student1.searchStudent();    

                        }catch (InputMismatchException e) {
                            System.out.println("Please enter a number which is valid meaning integer");
                        } finally {
                            for(int i = 0; i < listStudent.size(); i++){
                                if (listStudent.get(i).getId() == student1.getId()){
                                    oldUpdListStudent.add(listStudent.get(i));
                                    oldUpdListStudent.get(i).setId(listStudent.get(i).getId());
                                    oldUpdListStudent.get(i).setName(listStudent.get(i).getName());
                                    oldUpdListStudent.get(i).setProgram(listStudent.get(i).getProgram());
                                    student1.updateStudent();
                                    listStudent.get(i).setName(student1.getName());
                                    listStudent.get(i).setProgram(student1.getProgram());
                                    System.out.println("Previous data : " + oldUpdListStudent.get(i));
                                    System.out.println("New data : " + listStudent.get(i));
                                    studentFound = true;
                                    break;
                                }
                            }
                            if (studentFound == false){
                                System.out.println("Student is not registered in the system.");
                            }   
                            sc.nextLine();
                            System.out.println("Do you want to modify a student?");
                            System.out.println("Say 'U' for 'Update' or 'M' for the Menu");
                            function = sc.nextLine();
                            if (function.equals("U") || function.equals("M")){
                                 decision = true;
                             }
                             else if (function.equals("E")){
                                 decision = false;
                             }
                        } 
                    }   


                    if (function.equals("T")){ // Delete
                        try {
                        student1.searchStudent();    

                        }catch (InputMismatchException e) {
                            System.out.println("Please enter a number which is valid meaning integer");
                        } finally {
                            for(int i = 0; i < listStudent.size(); i++){
                                if (listStudent.get(i).getId() == student1.getId()){
                                    oldDelListStudent.add(listStudent.get(i));
                                    String answer = "YES";
                                    student1.deleteStudent(answer);
                                    if (answer.equals("YES")){
                                        listStudent.remove(i);
                                        System.out.println("Deleted data : " + oldDelListStudent);
                                        System.out.println("New list of Students: " + listStudent);
                                    }
                                     else if (answer.equals("NO")){
                                        System.out.println("The task was canceled");
                                    }
                                    studentFound = true;
                                    break;                                      
                                }
                            }
                            if (studentFound == false){
                                System.out.println("Student is not registered in the system.");
                            }   
                            sc.nextLine();
                            System.out.println("Do you want to delete a student?");
                            System.out.println("Say 'T' for 'Delete' or 'M' for the Menu");
                            function = sc.nextLine();
                            if (function.equals("T") || function.equals("M")){
                                 decision = true;
                             }
                             else if (function.equals("E")){
                                 decision = false;
                             }                           
                        } 
                    }   
                }

                break;

                case '2' :  //Enrollment
                break;  

                case '3' : //Attendance
                break;

                case '4' : //Transcript
                break;   

                case '5' : //Invoice
                break;

                case '6' : //Exit
                System.out.println("================================================");
                sc.close();
                break;

                default:
                System.out.println("Invalid Option! Please enter a valid input.");
            } 

        }while(option != '6');
            System.out.println();
            System.out.println("Thank you!"); 
        
    }    
}