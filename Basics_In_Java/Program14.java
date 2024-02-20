/*
	Switch Statement :- In switch statement, you can jump to various cases based on your expression
	Syntax :-
		switch(expression){
			case 1:
				body
				break;
			case 2:
				body
				break;
			default:
				body
				break;
		}
	
	Note :-
	1) Cases have to be the same type as expression must be a constatnt or literal.
	2) Duplicate case values are not allowed.
	3) break is use to terminate the sequence.
	4) if break is not used, it will continue to next case.
	5) default will execute when none of the above does.
	6) if defaults is not at the end, put break after it.
*/

import java.util.Scanner;
class SwitchSta{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String fruit = sc.next().trim();

		switch(fruit){

			case "mango" :
				System.out.println("Mango");
				break;
			case "Apple" :
				System.out.println("Apple");
				break;
			default :
				System.out.println("Not Favorite");
				break;
		}
	}
}
