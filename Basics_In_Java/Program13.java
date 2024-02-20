/*
	Difference Between equals() and == in String :-
*/

import java.util.Scanner;
class StringSta{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String fruit = sc.next().trim();

		if(fruit.equals("mango")){	// equals() method check the content of Object.
			System.out.println("In If");
		}

		if(fruit == "mango"){		// == operator check the address of Object.
			System.out.println("In if of == ");
		}
	}
}
