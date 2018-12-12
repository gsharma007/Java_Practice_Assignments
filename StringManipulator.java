//   Programmer: Gaurav Sharma     CSC110 Module 2 Programming Assignment on sequence
//   Date: Sept 4, 2018
/*   Description: This program displays the information from a city name entered by
the user*/
/*   Input:  User is prompted to enter the name of his/her favorite city: type: string */
/*   Output: The output displays information from the city name such as 
number of characters (type: int), first character of the name (type: char) 
and name in upper case, lower case characters (type: string) */ 

import java.io.*;
import java.util.Scanner;

public class StringManipulator
{
public static void main(String[] args)
{
Scanner city_name= new Scanner(System.in); 
String city;
System.out.print("Enter the name of a city: "); //input for user to enter
city= city_name.nextLine(); 

System.out.println("Number of characters: "+city.length()); //string length
System.out.println("Name of the city in all upper case letters: "+city.toUpperCase()); //converting into upper case
System.out.println("Name of the city in all lower case letters: "+city.toLowerCase()); //converting into lowercase
System.out.println("First Character is: "+city.charAt(0)); //character at first position
}
}











