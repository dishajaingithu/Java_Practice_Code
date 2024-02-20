/*
	First Occurrence: Find and print the index of the first occurrence of a specific element in an array.
*/

import java.util.*;
class FirstOcc {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length of Array Element : ");
		int length = sc.nextInt();

		int arr[] = new int[length];
		System.out.println("Enter Array Element : ");

		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		System.out.print("Enter Element to find their first occurrence : "); 
		int ele = sc.nextInt();
		int flag = 0;

		for(int i=0; i<arr.length; i++){

			if(arr[i] == ele){
				flag = 1;
				System.out.println("First Occurrence Index of Element is : " + i);
				break;
			}
		}

		if(flag == 0){

			System.out.println("Element is Not Present in Array.");
		}
	}
}
