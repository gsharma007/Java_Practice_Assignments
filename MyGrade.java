//Programmer: Gaurav Sharma CSC110AB Module-3 Assignment on Selection
//Date: September 18,2018.
//Description: The program calculates a letter grade for the student CSC110 online course based on three user inputs.The user will be asked to input three integer values against marks obtained in programming assignment,MPL homework and Final exam. Based on the inputs, the letter grade will be calculated by considering weightage of different marks. 
//Input:Percentage earned in programming assignments(p1),the percentage earned in MPL Homework(p2),percentage earned in Final Exam (p3).
//Data type used: 1)int: for all the first three inputs:p1,p2,p3. 2)char: for letter grade string 'grade'.3)double: for the points earned.
//Output: Letter grade of the student and remarks for the course CSC205.               

import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class MyGrade
{
      public static void main(String[] args)
      {
            System.out.println("STUDENT GRADE CALCULATOR"); //The title of the application program
            System.out.println("This program calculates the final letter grade for a student of the online course CSC110 based on the percentages earned in Programming assignments, MPL Homework, and the Final exam."); //A brief description of what the program does
            
            Scanner percentages=new Scanner(System.in); 
            int p1,p2,p3;

            //To prompt the user for desired inputs
            System.out.println("Enter the percentage earned in the Programming assignments: ");
            p1 = percentages.nextInt();
            System.out.println("Enter the percentage earned in the MPL Homework: ");
            p2 = percentages.nextInt();
            System.out.println("Enter the percentage earned in the Final Exam: ");
            p3 = percentages.nextInt(); 

            //checking for errors during input and printing the relevant input validation error message
            if (p1<0 || p1>100)
            {
                System.out.println("The percentage entered for the Programming Assignments must be between 0 and 100, inclusive.");
            }
            else if (p2<0 || p2>100)
            {
                System.out.println("The percentage entered for the MPL Homework must be between 0 and 100, inclusive.");
            }
            else if (p3<0 || p3>100)
            {
                System.out.println("The percentage entered for the Final Exam must be between 0 and 100, inclusive.");
            }
            else //to proceed if no input errors are found
            {
                double m1,m2,m3;

                //to calculate the points earned as per decided weightage
            	m1=p1*0.4;
            	m2=p2*0.2;
            	m3=p3*0.4;
            	double total=m1+m2+m3;
                
                System.out.println("The number of Programming Assignment points earned:\t"+m1);
                System.out.println("The number of MPL Homeworks points earned:\t\t"+m2);
                System.out.println("The numberr of Final Exam points earned:\t\t"+m3);
                System.out.println("The total number of points earned:\t\t"+total);

            	//if else block for grade calculation and rounding off to the nearest integer
                char grade;
                total=Math.round(total);
                //defining the named constants
                final int a=90;
                final int b=80;
                final int c=70;
                final int d=60;
                if(p3<60) //allocating F if a student fails to score 60 percent in the final exam
                {
                    grade='F'; 
                }
                else if(total>=a)
                {
                    grade='A';
                }
                else if(total>=b)
                {
                    grade='B';
                }
                else if(total>=c)
                {
                    grade='C';
                }
                else if(total>=d)
                {
                    grade='D';
                }
                else
                {
                    grade='F';
                }


                System.out.println("The student's letter grade:\t\t"+grade);

                //The remarks/support message based on the letter grade earned for the next course CSC205
                switch(grade)
                {
                    case 'A':
                    System.out.println("\tGreat job! You will have no problem in CSC205.");
                    break;
                    case 'B':
                    System.out.println("\tGood job! You should have little trouble in CSC205.");
                    break;
                    case 'C':
                    System.out.println("\tOk, you passed, but you may be challenged in CSC205.");
                    break;
                    case 'D':
                    System.out.println("\tWhen you retake this course, you will be able to do much better.");
                    break;
                    case 'F':
                    System.out.println("\tYou did not score enough points on the Final Exam to pass this course.");
                    break;
                }
            }
        System.out.println("MyGrade is now terminating.");    
      }
 }
  