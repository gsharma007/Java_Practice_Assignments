//   Programmer: Gaurav Sharma     CSC110 Module 2 Programming Assignment on sequence
//   Date: Sept 4, 2018
/*   Description: This program determines the change to be dispensed from a vending 
machine by calculating the balance, when a customer places a dollar into the machine*/
/*   Input:  User is prompted to enter the price of an item from 
25..100, type: Integer */
/*   Output: The change amount, in different denominations such as quarters
dimesa and nickels, type: int */

import java.io.*;
import java.util.Scanner;
public class ChangeMaker
{
  public static void main(String[] args)
  {
    Scanner ItemPrice=new Scanner(System.in); //creating scanner object
    int price,balance,quarters,dimes,nickels; // data type declaration
    System.out.print("Enter price of item (25..100), in 5-cent increments):");
    price = ItemPrice.nextInt(); 
    System.out.println("You bought an item for "+ price+" cents and gave me a dollar");
    balance = 100-price; 
    quarters=balance/25;
    balance=balance%25;
    dimes = balance/10;
    balance=balance%10;
    nickels=balance/5;
    balance=balance%5;
    System.out.println("so your change is:");
    System.out.println(quarters+" quarters");
    System.out.println(dimes +" dimes, and");
    System.out.println(nickels+" nickels.");
    
  }
}