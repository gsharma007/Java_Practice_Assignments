//   Programmer: Gaurav Sharma     CSC110 Module 2 Programming Assignment on sequence
//   Date: Sept 4, 2018
/*   Description: This program converts the temperature from fahrenheit scale 
to celsius scale hence the user will provide an input temperature in degree fahrenheit 
and the output will display the temperature in degree celsius */
/*   Input:  User is prompted to enter a integer value for the temperature 
in fahrenhiets, type: Integer */
//   Output: The temperature, in degree celsius, type: double


import java.io.*;
import java.util.Scanner;
public class TempConverter
{
public static void main(String[] args){
int fahrenheit; //declaring data type for the input
Scanner fahrenheitTemp = new Scanner(System.in);  //creating scanner object
System.out.print("Enter a fahrenheit temperature:"); //prompt for user input
fahrenheit= fahrenheitTemp.nextInt();
double celsius; /*declaring data type for output, "double" because it can take 
fractional values */
celsius= 5*(fahrenheit - 32)/9; // formula for conversion
System.out.println( fahrenheit +" degrees fahreheit is " +celsius+" degrees celsius.");/*
println is used for output display in next line */
}
}
