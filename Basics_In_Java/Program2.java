/*
 	Input/Output In Java :-
	1) Using Scanner Class :- import java.util.*;
	2) Using BufferedReader and InputStream class :- import java.io.*;
*/

import java.util.Scanner;
class InputOutput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Integer Value : ");
		int value = sc.nextInt();
		System.out.println("Integer Value : " + value);

		System.out.print("Enter the Character Value : ");
		char ch = sc.next().charAt(0);
		System.out.println("Character Value : " + ch);

		System.out.print("Enter the String which take only first Word : ");
		String str1 = sc.next();
		System.out.println("String Value 1 : " + str1);
		
		sc.nextLine();

		System.out.print("Enter the String which take whole string : ");
		String str2 = sc.nextLine();
		System.out.println("String Value 2 : " + str2);

		System.out.print("Enter the Floating Point Value : ");
	       	float fValue = sc.nextFloat();
		System.out.println("Floating Value : " + fValue);
		
		System.out.print("Enter the Double Point Value : ");
		double dValue = sc.nextDouble();
		System.out.println("Double Value : " + dValue);
	}
}	


