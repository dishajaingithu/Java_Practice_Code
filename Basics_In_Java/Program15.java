/*
	Function/Method :- It Reduce the Redundancy of Code.
       	
	Syntax :-
	
	access_Modifier return_type name_of_function(Parameters){
		
		//body
		return statement
	}
*/

import java.util.Scanner;
class AdditionNo{
			// Parameters
	static int Sum1(int num1 , int num2){	

		return num1 + num2;
	}

	static int Sum2(){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the two Numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		return num1 + num2;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the two Numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

			    // Arguments
		int add1 = Sum1(num1, num2);
		System.out.println("Addition of " + num1 + " & " + num2 + " is : " + add1);

		int add2 = Sum2();
		System.out.println("Addition is : " + add2);

	}
}
