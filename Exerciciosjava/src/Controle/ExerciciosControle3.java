package Controle;

import java.util.Scanner;

public class ExerciciosControle3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Nota Parcial 1:");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Nota Parcial 2:");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("Sua media foi " + media + " E você está Aprovado.");
			
		}else if (media >= 4){
			System.out.println("\" Sua média foi " + media + " E você está em Recuperação.\"");
			
		}else {
			System.out.println("Sua média foi " + media + " E você está Reprovado ");
		}
		
		scanner.close();
		
	}
}
