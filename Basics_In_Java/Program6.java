/*
	Loops :-
		1) for loop
		2) while loop
		3) do-while loop
	
	Q. Print the Numbers from 1 to 5.
*/

import java.util.*;
class loops{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the last range of number : ");
		int n = sc.nextInt();

		// Using for-loop
		// Syntax :-
		// for(initialization(1); condition(2); increment/decrement(4)){
		// 	body(3)
		// }
		for(int i=1; i<=n; i++){

			System.out.print(i + " ");
		}

		System.out.println();

		// Using while-loop
		// Syntax :-
		//
		// Initialization
		// while(condition){
		//	body
		//	increment/decrement
		//}
		int i=1;
		while(i<=n){
			System.out.print(i + " ");
			i++;
		}

		System.out.println();

		// Using do-while loop :- Loop Execute At least Once.
		// Syntax :-
		//
		// Initialization
		// do{
		// 	body
		// 	increment/decrement
		// }while(condition);

		int x = 1;
		do{
			System.out.print(x + " ");
			x++;
		}while(x<=n);

		System.out.println();
	}
}
