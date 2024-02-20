/*
	Type Conversion :-
*/

class TypeConversion{

	public static void main(String[] args){

		int num = (int)(67.48f);	// Type Conversion from float to integer.
		System.out.println(num);	// 67

		// Automatic type promotion in expressions
		int a = 257;
		byte b = (byte)(a);

		System.out.println(b);		// 257 % 256 = 1

		int number = 'A';
		System.out.println(number);	// ASCII Value of A = 65

		System.out.println("नमस्ते");	// Java Supports Unicode.
	}
}
