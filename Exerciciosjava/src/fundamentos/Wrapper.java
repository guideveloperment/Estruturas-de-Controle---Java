package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		// BYTE
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000"); // int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l /3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		entrada.close();
		
		
	}	
	
}
