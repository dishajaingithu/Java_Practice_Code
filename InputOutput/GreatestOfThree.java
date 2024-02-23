public class GreatestOfThree{

	public static void main(String[] args){

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		if(num1 == num2 && num2 == num3){

			System.out.println("All are Equal");


		}else if(num1 == num2	&& num3 > num1){
			System.out.println("num1 and num2 is Equal");
		}else if(num2 == num3 && num3 > num2){

			System.out.println("num2 and num3 is Equal");
		}else if(num1 == num3 && num3>num1){

			System.out.println("num1 and num3 is Equal");

		}else if(num1 > num2 && num1 > num3){

			System.out.println("num1 : " + num1);

		}else if(num2 > num3){

			System.out.println("num2 : " + num2);

		}else{
			System.out.println("num3 : " + num3);
		}		

	}
}
