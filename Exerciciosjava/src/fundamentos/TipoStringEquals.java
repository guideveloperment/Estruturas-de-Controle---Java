package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String ("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next(); // next tbm tira os espaços em branco o nextLine deixa da forma como vc digitou
		System.out.println("2" == s2.trim());
		System.out.println("2" .equals(s2.trim()));
		// .trim exclui os espaços em branco
		
		entrada.close();
	}
	
}
