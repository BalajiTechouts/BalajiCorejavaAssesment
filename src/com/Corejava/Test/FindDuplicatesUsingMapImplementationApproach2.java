package com.Corejava.Test;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class FindDuplicatesUsingMapImplementationApproach2 {
         public static void main(String[] args)
         {
       int[] arr = {1, 2, 3, 2, 4, 3, 5, 6, 7, 5, 8, 9, 10};
 
       Map<Integer, Integer> arrMap = new HashMap<>();
  
        for(int i = 0; i < arr.length; i++)
        {
          if(arrMap.containsKey(arr[i]))
            {
            arrMap.put(arr[i], arrMap.get(arr[i]) + 1);
            }
          else
            {
               arrMap.put(arr[i], 1);
            }
        }
 
       Set<Entry<Integer, Integer>> entry = arrMap.entrySet();
 
       for(Entry<Integer, Integer> ent: entry)
       {
 
          if(ent.getValue() > 1)
          {
             System.out.println("Duplicate element:"+ent.getKey());
          }
       }
}

}
