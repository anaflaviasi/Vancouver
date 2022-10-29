package Student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private Integer id;
    private String name;
    private String program;

    Scanner sc = new Scanner(System.in);
    String function;
    String field;

 // Default Constructor
    public Student(){
        this.id = 0;
        this.name = "Unknown";
        this.program = "Unknown";
    }

 // Parameterized Constructor
    public Student(Integer id, String name, String program){
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String showMenu() {
        System.out.println();
        System.out.println("I. Input");
        System.out.println("D. Display");
        System.out.println("U. Update");
        System.out.println("T. Delete"); 
        System.out.println("E. Exit");
        System.out.println();
        System.out.println("Now you should choose one of the functions above: ");
        function = sc.nextLine();
        System.out.println();
        return function;
    } 

    public void inputStudent(){
        System.out.println("Enter the Student id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Student name: ");
        name = sc.nextLine();
        System.out.println("Enter the Student program: ");
        program = sc.nextLine();
        System.out.println();
    }

    public void searchStudent(){
            System.out.println("Enter the Student id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println();
        } 

    public void updateStudent(){
            System.out.println("Update the Student name: ");
            name = sc.nextLine();
            System.out.println("Update the Student program: ");
            program = sc.nextLine();
    } 

    @Override
    public String toString() {
        return "{Id=" + id + 
                ", Name=" + name +
                ", Program=" + program + "}";
    }

    public int size() {
        return 0;
    }
}


