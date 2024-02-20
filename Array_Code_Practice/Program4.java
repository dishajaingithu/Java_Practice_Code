/*
	Search Element: Given an array and a target element, check if the element is present in the array. 
*/

import java.io.*;
class SearchEle {

	public static void main(String[] args) throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Length of Array Elements : ");
		int length = Integer.parseInt(br.readLine());
		int arr[] = new int[length];

		System.out.print("Enter Element to Search in Array : ");
		int searchNo = Integer.parseInt(br.readLine());

		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

		}
			
		int flag = 0;	
		for(int i=0; i<arr.length; i++){

			if(arr[i] == searchNo){
				flag = 1;
				break;
			}

		}

		if(flag == 1){

			System.out.println("Element is Present in Array");
		}else{
			System.out.println("Element is Not Present in Array");
		}

	}
}







