/*
	Even Numbers: Print all even numbers from an array.
*/

import java.io.*;
class EvenNo{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Length of Array Elements : ");
		int length = Integer.parseInt(br.readLine());

		int arr[] = new int[length];

		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

		}
	
		System.out.print("Even Element in Array : ");		
		for(int i=0; i<arr.length; i++){

			if(arr[i] % 2 == 0){

				System.out.print(arr[i] + " ");
			}

		}

		System.out.println();

	}
}







