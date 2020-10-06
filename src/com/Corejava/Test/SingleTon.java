package com.Corejava.Test;


public class SingleTon
{
 // static variable single_instance of type Singleton 
 private static SingleTon single_instance=null; 

 // variable of type String 
 public String s; 

 // private constructor restricted to this class itself 
 private SingleTon() 
 { 
     s = "Hello I am a string part of Singleton class"; 
 } 

 // static method to create instance of Singleton class 
 public static SingleTon Singleton() 
 { 
     // To ensure only one instance is created 
     if (single_instance == null) 
     { 
         single_instance = new SingleTon(); 
     } 
     return single_instance; 
 } 
} 

