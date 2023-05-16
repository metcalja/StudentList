/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author yacob
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'reverse' for reverse string, or 'student' for student array: ");
        String answer = input.nextLine();
        //this is all for reversing a string
        if (answer.equalsIgnoreCase("reverse")) {
            System.out.println("Enter a string: ");
            String word = input.nextLine();
            char[] characters = new char[word.length()];

            for (int i = 0; i < word.length(); i++) {
                characters[i] = word.charAt(i);
            }
            for (int i = characters.length - 1; i >= 0; i--) {
                System.out.println(characters[i]);
            }
        } else {
            //this is for array of objects
            Student[] students = new Student[5];
            students[0] = new Student("Het", "hetsId");
            students[1] = new Student("Robert", "robertId");
            students[2] = new Student("Jacob", "jacobsId");
            students[3] = new Student("Jose", "joseId");
            students[4] = new Student("Juan", "juanId");

            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].getFname());
            }
        }penguin
    }
    
}
