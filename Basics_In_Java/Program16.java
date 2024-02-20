/*
	Swap Two Numbers :- Write the Method for this.
*/

class SwapNo{

	static void Swap(int a, int b){

		int temp = a;
		a = b;
		b = temp;

		System.out.print("In Swap Function: ");
		System.out.println(a + " " + b);
	}
	public static void main(String[] args){

		int a = 10;
		int b = 20;

		Swap(a,b);
		
		System.out.print("After the Swap Function Call : ");
		System.out.println(a + " " + b);
	}
}


