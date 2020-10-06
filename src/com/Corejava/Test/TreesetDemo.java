package com.Corejava.Test;
import java.util.TreeSet;
public class TreesetDemo {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
	      ts.add(100);
	      ts.add(111);
	      ts.add(130);
	      ts.add(120);
	      ts.add(30);
	      ts.add(555);
	     System.out.println("Treeset Elements="+ts); 
	     System.out.println("First element to remove from Treeset"+ts.pollFirst());
	     System.out.println("After Removing First Element Treeset Elements are = "+ts);
	     System.out.println("Last element to remove from treeset= "+ts.pollLast());
	     System.out.println("After Removing Last Element Treeset Elements are: "+ts);
	     TreeSet<String> td=new TreeSet<String>();
	     td.add("a");
	     td.add("b");
	     td.add("A");
	     td.add("B");
	     td.add("c");
	     td.add("D");
	     System.out.println("Treeset Elements="+td);
	     
		}
    }
