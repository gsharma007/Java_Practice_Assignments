// Programmer: Gaurav Sharma     CSC110 Module 5 Programming Assignment on Modularity
// Date: Oct 24, 2018
/* Description: This program uses different methods in the form of modules. It first promts users
to eneter number as per definition and provids output on the basis of constraints defined*/
/* Methods used- "Getting an integer from user", "Getting a string from user", "Sum of digits in an integer", 
"Determining if the string is pallindrome", "Inserting undersore character in string", "Devoweling a string" 
and "Writing and output file"*/


import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Methods{
    public static void main(String[] args) {
        System.out.println("Welcome to the Methods app. Please follow directions in prompts.");
        System.out.println("Results will be written to file, MethodsOutput.txt.");
        Scanner keyboard = new Scanner(System.in);
        File file = new File("MethodsOutput.txt");
        //file.getParentFile().mkdirs();
        PrintWriter printWriter=null;
        try{
        printWriter = new PrintWriter(file);
        }catch(FileNotFoundException wx){
            System.out.println("File not found");
        }
        int number = getInt(keyboard);
        while(number!=999){
            String devoweled = "";
            String str="";
            int digitSum=0;
            digitSum = sumDigits(number);
            if(sumDigits(number)%2!=0){
                str = getString(keyboard);
                if(!isPalindrome(str)){
                    str = insertUnderscores(str);
                }
                devoweled = devowel(str);
                writeToOutputFile(printWriter, number, str, devoweled);
            }
            else{
                writeToOutputFile(printWriter, number, digitSum);
            }
            number = getInt(keyboard);
        }
        printWriter.close();
        System.out.println("Terminating Methods app...");
    }

    public static int getInt(Scanner keyboard){
        int number = 0;
        while (number<=99){
            System.out.print("Please enter an integer greater than 99 (999 to quit): ");
            number = keyboard.nextInt();
            if(number<=99){
                System.out.println("Input is NOT greater than 99.");
            }
        }
        return number;
    }

    public static String getString(Scanner keyborad){
        String str ="";
        while(str.length()<=2 || str.contains(" ")){
            System.out.print("Enter a string longer than 2 characters: ");
            str = keyborad.next();
            if(str.length()<=2){
                System.out.println("Input string length is NOT greater than 2.");
            }
        }
        return str;
    }
    public static int sumDigits(int val){
        int answer =0;
        do{
            answer = answer + (val%10);
            val = val/10;
        }
        while(val>0);
        return answer;
    }
    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static String insertUnderscores(String s){
        String str ="";
        for(int i=0;i<s.length()-1;i++){
            str = str + s.charAt(i)+"_";
        }
        str = str+s.charAt(s.length()-1);
        return str;
    }
    public static String devowel(String s){
        String str ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'||s.charAt(i)=='u'){
            }
            else{
                str = str+s.charAt(i);
            }
        }
        return str;
    }
    public static void writeToOutputFile(PrintWriter outFile, int input, String inStr, String devoweled){
        outFile.println(input + " String: "+ inStr + " Devoweled: "+devoweled);
    }
    public static void writeToOutputFile(PrintWriter outFile, int input, int digitSum){
        outFile.println(input + " - sum of digits: "+ digitSum);
    }
}