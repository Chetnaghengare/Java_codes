package Oops;

import java.util.Arrays;

import oops1.greeting;



public class Main {
     
      public static void main(String[] args){
            
        // int[] name = new int[5];
        
        student[] students = new student[5];

        // System.out.println(Arrays.toString(students));

        
        System.out.println((students));

        student chetna = new student();

        chetna.rno = 22510059;
        chetna.name = "chetna";
        chetna.marks = 95;

        System.out.println(chetna.rno + " " +  chetna.name + " " + chetna.marks );
       
        hello();

      }

      public static void hello()
      {
         System.out.println("welcome");
         greeting.greet();
      }
}

class student
{
     int rno;
     String name;
     int marks;


}