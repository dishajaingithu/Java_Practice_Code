/*
	Calculator Program 
*/

import java.util.Scanner;
class Calculator{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int ans = 0;

		while(true){

			System.out.print("Enter the Operator : ");
			char ch = sc.next().trim().charAt(0);

			if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){

				System.out.println("Enter Two Numbers : ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();

				if(ch == '+'){
					ans = num1 + num2;
				}else if(ch == '-'){
					ans = num1 - num2;
				}else if(ch == '*'){
					ans = num1 * num2;
				}else if(ch == '/'){

					if(num2 != 0){
						ans = num1 / num2;
					}
				}else if(ch == '%'){
					ans = num1 % num2;
				}
			}else if(ch == 'x' || ch == 'X'){
				break;
			}else{
				System.out.println("Invalid Operators");
			}

			System.out.println(ans);
		}
	}
}



