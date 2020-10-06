package com.Corejava.Test;


 public class SingleTonExecution
{ 
 public static void main(String args[]) 
 {  
	 SingleTon x = SingleTon.Singleton(); 

	 SingleTon y = SingleTon.Singleton(); 

	 SingleTon z = SingleTon.Singleton(); 
	 
     x.s = (x.s).toUpperCase(); 

     System.out.println("String from x is " + x.s); 
     System.out.println("String from y is " + y.s); 
     System.out.println("String from z is " + z.s); 
     System.out.println("\n"); 

     z.s = (z.s).toLowerCase(); 

     System.out.println("String from x is " + x.s); 
     System.out.println("String from y is " + y.s); 
     System.out.println("String from z is " + z.s); 
 } 
} 