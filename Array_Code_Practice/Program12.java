/*
	Find Second Smallest and Second Largest Element in an array and store in the another array
*/

import java.util.Arrays;
class SecondSmallAndSecondLarge{
	static void smallLargeEle(int[] arr, int size){
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;

		for(int i=0; i<size; i++){

			small = Math.min(small,arr[i]);
			large = Math.max(large,arr[i]);
		}
		for(int i=0; i<size; i++){

			if(arr[i] < second_small && arr[i] != small){
				second_small = arr[i];
			}

			if(arr[i] > second_large && arr[i] != large){
				second_large = arr[i];
			}
		}
		int arr2[] = {second_small , second_large};

		for(int i=0; i<arr2.length; i++){

			System.out.println(arr2[i]);
		}
	}

	public static void main(String[] args){

		int[] arr = new int[]{1,2,3,4,5};
		int n = arr.length;
		smallLargeEle(arr,n);
	}
}
