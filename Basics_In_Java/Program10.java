/*
	Q. Count the digits from given Number ?
*/

import java.util.Scanner;
class CountDigitInNo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		System.out.print("Enter the Which number is Count : ");
		int countNo = sc.nextInt();

		int count = 0;

		while(num != 0){

			int rem = num % 10;
			if(rem == countNo){

				count++;
			}

			num /= 10;
		}

		System.out.println(countNo + " in given number is " + count);
	}
}

		
