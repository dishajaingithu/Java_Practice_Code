/*
	Array Average: Calculate and print the average of elements in an array.
*/

import java.io.*;
class AvgOfArr{

	public static void main(String[] args) throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Length of Array Elements : ");
		int length = Integer.parseInt(br.readLine());

		int arr[] = new int[length];

		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

		}


		int sum = 0;	// Initially the Sum is Zero
				
		for(int i=0; i<arr.length; i++){	// Calculate the Sum of Array Elements 

			sum = sum + arr[i];

		}

		System.out.println("Sum of Array Elements : " + sum/arr.length);

	}
}







