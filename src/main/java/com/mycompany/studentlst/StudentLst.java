package com.mycompany.studentlst;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author MoaathAlrajab
 */
public class StudentLst {

    public static void main(String[] args) {
        Student[] students= new Student[2];
        Scanner inScanner = new Scanner(System.in);
        
        for(int i=0; i< students.length;i++){
            System.out.print("Enter student's name: ");
            String name = inScanner.nextLine();
            Student student = new Student(name);
            
            students[i]= student;
            
        }
        System.out.println(printOutput(students));
    }
    
    public static String printOutput(Student[] students){
        String str="";
        
        //To Do 03: complete the implementation of this method
        for (int i = 0; i < students.length; i++) {
            str += "Printing the output The student's name is " + students[i].getName() + " "+"\n";

        }

        return str;
    }
    
    
}
