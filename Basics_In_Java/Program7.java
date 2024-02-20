/*
	Q. Find the Largest of 3 Numbers.
*/

import java.util.Scanner;
class Largest{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// Way 1 :-
		int max = 0;
		if(a > b){
			max = a;
		}else {
			max = b;
		}

		if(c > max){

			max = c;
		}

		System.out.println("Maximum Value is : " + max);

		// Way 2 :-
		int largeValue = Math.max(c, Math.max(a,b));
		System.out.println("Maximum Value is : " + largeValue);


	}
}


