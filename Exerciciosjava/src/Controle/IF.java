package Controle;

import java.util.Scanner;

public class IF {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
	System.out.print("Informe a media:");
	double media = entrada.nextDouble();
	
	if(media <= 10 && media >= 7.0) {
		System.out.println("Aprovado!!!");
		System.out.println("Parab�ns!!!");
	}
		
	if (media < 7 && media >= 4.5) {
		System.out.println("Recupera��o!");
		System.out.println("Estuda que d�!!!!");
	}
	
	if (media < 4.5 && media >=0) {
		System.out.println("Reprovado!!!");
		System.out.println("Fica pra Pr�xima!!!");
	}
	
	
	
	
	
		entrada.close();
				
		
		
		
	}

}
