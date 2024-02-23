// Take the Input from User using Buffered Reader Class

import java.io.*;

class InputOutputOp{

	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		byte by;
		short s;
		int num ;
		float f ;
		char ch;
		long l;
		double d;
		boolean b;

		try{

		System.out.print("Enter Byte Value : ");
		by = Byte.parseByte(br.readLine());
		System.out.println(by);

		//br.close();

		System.out.print("Enter Short Value : ");
		s = Short.parseShort(br.readLine());
		System.out.println(s);

		System.out.print("Enter Integer Value : ");
		num = Integer.parseInt(br.readLine());
		System.out.println(num);

		System.out.print("Enter Float Value : ");
		f = Float.parseFloat(br.readLine());
		System.out.println(f);

		System.out.print("Enter Char Value : ");
		ch = (char)br.read();
		br.skip(1);
		System.out.println(ch);
		
		System.out.print("Enter Long Value : ");
		l = Long.parseLong(br.readLine());
		System.out.println(l);

		System.out.print("Enter Double Value : ");
		d = Double.parseDouble(br.readLine());
		System.out.println(d);

		System.out.print("Enter Boolean Value : ");
		b = Boolean.parseBoolean(br.readLine());
		System.out.println(b);

		}catch(IOException io){

			io.printStackTrace();
		}
		
	}
}



