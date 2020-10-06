package com.Corejava.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
public class ListIteratorExample {
  public static void main(String a[]){
    ListIterator<String> Litr = null;
    List<String> names = new ArrayList<String>();
    names.add("balaji");
    names.add("bhaskar");
    names.add("prasanth");
    names.add("deepika");
    names.add("jayaram");
    
    Litr=names.listIterator();
 
    System.out.println("Traversing the list in forward direction:");
    while(Litr.hasNext()){
       System.out.println(Litr.next());
    }
    System.out.println("\nTraversing the list in backward direction:");
    while(Litr.hasPrevious()){
       System.out.println(Litr.previous());
    }
  }
}
