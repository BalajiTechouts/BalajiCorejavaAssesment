package com.Corejava.Test;


import java.util.Arrays; 
public class ParllelSortExample {  
   public static void main(String[] args) {
	int numbers[] = {22, 89, 1, 32, 19, 5};

	Arrays.parallelSort(numbers);

	Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
	System.out.println(" ");
	int num[] = {42, 66, 34, 79, 44, 6, 8};
	Arrays.parallelSort(num, 1, 5);//here sorting is based on indexes

	Arrays.stream(num).forEach(n->System.out.print(n+" "));
    }
}