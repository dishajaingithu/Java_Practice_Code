/*
	Count Odd Numbers: Count and print the number of odd number
*/

import java.io.*;
class OddNo{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Length of Array Elements : ");
		int length = Integer.parseInt(br.readLine());

		int arr[] = new int[length];

		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

		}
		
		int count = 0;
		System.out.print("Odd Element in Array : ");		
		for(int i=0; i<arr.length; i++){

			if(arr[i] % 2 != 0){

				System.out.print(arr[i] + " ");
				count++;
			}

		}
		System.out.println();
		System.out.println("Count of Odd Elements : " + count);

	}
}







