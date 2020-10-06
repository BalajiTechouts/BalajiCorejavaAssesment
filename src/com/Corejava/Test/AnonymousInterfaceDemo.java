package com.Corejava.Test;


interface Manageable
{
  public void manage();
}
 
public class AnonymousInterfaceDemo
{
  public static void main(String[] args)
  {
    Manageable m = new Manageable() {
      public void manage()
      {
        System.out.println("It is manageable");
      }			
    }; 
    m.manage();
  }
}
