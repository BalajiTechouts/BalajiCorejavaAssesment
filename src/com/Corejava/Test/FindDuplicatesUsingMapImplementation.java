package com.Corejava.Test;
import java.util.Map;
import java.util.HashMap;
public class FindDuplicatesUsingMapImplementation {
public static void main(String[] args)
{
int[] arr= {1,2,1,2,3,5,6,7,7,8,9,10};

Map<Integer,Integer> map = new HashMap<Integer,Integer>();

for(Integer element:arr){

if(map.containsKey(element))

System.out.println("Duplicate Value : "+element);

else{

map.put(element, 1);

}

}
}
}
	
