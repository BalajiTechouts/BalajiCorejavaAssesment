package com.Corejava.Test;
import java.io.*;
public class StringMethods {



   public static void main(String args[]) {
      String Str = new String("Welcome to Techouts");
      System.out.println("Hashcode for Str :" + Str.hashCode() );
      String str2=new String("Welcome to Hyderabad");
      System.out.println(Str.equals(str2));
      System.out.println();
      
   }
}