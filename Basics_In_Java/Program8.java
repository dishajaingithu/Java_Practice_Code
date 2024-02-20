/*
	Q. Alphabet Case Check ?
*/

import java.util.Scanner;
class CaseCheck{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		char ch = sc.next().trim().charAt(0);

		if(ch >= 'a' && ch <= 'z'){

			System.out.println("Lowest Case");

		}else if(ch >= 'A' && ch <= 'Z'){

			System.out.println("Upper Case");
		}else{
			System.out.println("Special Character");
		}
	}
}
