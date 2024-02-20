/*
	Reverse Array: Reverse the elements of an array in-place.
*/

import java.io.*;
class InPlaceReverse{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Length of Array Elements : ");
		int length = Integer.parseInt(br.readLine());

		int arr[] = new int[length];

		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

		}
	
		  for(int i = 0; i < arr.length / 2; i++) {
            		// Swapping the elements
            		int j = arr[i];
            		arr[i] = arr[arr.length - i - 1];
            		arr[arr.length - i - 1] = j;
        	}

		System.out.print("Reversed Array :" );
		for(int i=0; i<arr.length;i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();

	}
}







