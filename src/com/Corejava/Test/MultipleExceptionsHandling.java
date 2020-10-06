package com.Corejava.Test;

import java.util.Scanner;
import java.io.PrintWriter;  
import java.io.FileNotFoundException;

public class MultipleExceptionsHandling {
	public static void main(String args[])
    { 
		System.out.println("Enter the number");  
	 Scanner sc = new Scanner(System.in); 
        try
        { 
            int n = Integer.parseInt(sc.nextLine()); 
            if (99%n == 0) 
                System.out.println(n + " is the factor of 99"); 
        } 
        catch (ArithmeticException ex) 
        { 
            System.out.println("Arithmetic " + ex); 
        } 
        catch (NumberFormatException ex) 
        { 
            System.out.println("Number Format Exception " + ex); 
        } 
        PrintWriter pw;  
        try {  
            pw = new PrintWriter("xyz.txt"); 
            pw.println("saved");  
        }  
 
 catch (FileNotFoundException e) {  
              
            System.out.println(e);  
        }         
    System.out.println("File saved successfully");  
        MultipleExceptionsHandling meh=new MultipleExceptionsHandling();
        meh.TryCatchFinally();
    }

	 void TryCatchFinally() {
	 
	int[] arr = new int[4]; 
     try
     { 
         int i = arr[4]; 
               
        
         System.out.println("Inside try block"); 
     } 
       
     catch(ArrayIndexOutOfBoundsException ex) 
     { 
         System.out.println("In the catch block The Exception Will be caught"); 
     } 
       
     finally
     { 
         System.out.println("finally block executed"); 
     } 
       
    
     System.out.println("try-catch-finally clause outside"); 
 } 
	     }    

