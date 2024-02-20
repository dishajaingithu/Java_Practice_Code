/*
	Union of two Sorted Array
*/

import java.util.*;

class Main{
   public static void main(String[] args){

      Integer arr1[] = { 1, 2, 3, 4, 5,6,7,8,9,10};
      Integer arr2[] = { 2, 3, 4, 4, 5, 11, 12};
      union(arr1, arr2);
   }

   public static void  union(Integer []arr1, Integer []arr2){

      HashSet<Integer> set = new HashSet<>();

      set.addAll(Arrays.asList(arr1));

      set.addAll(Arrays.asList(arr2));

      Integer[] union = {};
      union = set.toArray(union);

      System.out.println("Union of two arrays is: " + Arrays.toString(union));
   }
}
