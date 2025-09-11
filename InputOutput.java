/**********************************************************************
Program Title : Input and Output Demonstration
File Name     : "InputOutput.java"
**********************************************************************/

import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // String and int input
        System.out.println("Enter name:");
        String name = myObj.nextLine();

        System.out.println("Enter age:");
        int age = myObj.nextInt();

        // Double input
        System.out.println("Enter your height (in meters):");
        double height = myObj.nextDouble();

        // Boolean input
        System.out.println("Are you a student? ");
        boolean isStudent = myObj.nextBoolean();

        // Character input
        System.out.println("Enter your grade (single character):");
        char grade = myObj.next().charAt(0);

        // Output all values
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Student: " + isStudent);
        System.out.println("Grade: " + grade);

        myObj.close();
    }
}
