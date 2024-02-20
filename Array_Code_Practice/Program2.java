/*
	Find Maximum Element: Find and print the maximum element in an array.
*/

import java.util.*;
class MaxElement{

	static void bubbleSort(int arr[]){

		int size = arr.length;
		int temp = 0;

		for(int i=0; i<size; i++){

			for(int j=1; j<(size-i); j++){

				if(arr[j-1] > arr[j]){

					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Length of Array Element : ");
		int length = sc.nextInt();

		int arr[] = new int[length];

		System.out.println("Enter Array Element : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();

		}

		bubbleSort(arr);

		System.out.println("Maximum Element is : "+arr[length-1]);

	}
}


