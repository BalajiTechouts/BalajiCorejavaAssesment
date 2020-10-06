package com.Corejava.Test;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		System.out.println(al);
		Iterator<Integer> itr=(Iterator) al.iterator();
		while(itr.hasNext()) {
		Integer i =(Integer)itr.next();
		if(i%2==0)
		     {
			System.out.println(i);
			
		     }
		else {
			
			itr.remove();
			
		      }
		}
		}
	
}
