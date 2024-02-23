// Take the Input from User using Scanner Class.

import java.util.*;

class InputOutput {

	public static void main(String[] args){
		byte by;
		short s;
		int num ;
		float f ;
		char ch;
		long l;
		double d;
		boolean b;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Byte Value : ");
		by = sc.nextByte();
		System.out.println(by);

		System.out.print("Enter Short Value : ");
		s = sc.nextShort();
		System.out.println(s);

		System.out.print("Enter Integer Value : ");
		num = sc.nextInt();
		System.out.println(num);

		System.out.print("Enter Float Value : ");
		f = sc.nextFloat();
		System.out.println(f);

		System.out.print("Enter Character Value : ");
		ch = sc.next().charAt(0);
		System.out.println(ch);
	
		System.out.print("Enter Long Value : ");
		l = sc.nextLong();
		System.out.println(l);

		System.out.print("Enter Double Value : ");
		d = sc.nextDouble();
		System.out.println(d);

		System.out.print("Enter Boolean Value : ");
		b = sc.nextBoolean();
		System.out.println(b);
	}
}





