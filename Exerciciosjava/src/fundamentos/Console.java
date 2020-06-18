package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.println(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d\n", 1, 2, 3, 4);
		System.out.printf("Salario: %.1f\n", 1234.5678);
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		
		
		System.out.print("Digite seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade:");
		int idade = entrada.nextInt();
		
		System.out.print("Digite seu salario:");
		double salario = entrada.nextDouble();
		
		
		
		System.out.println("\n\nnome = " + nome + " " + sobrenome + " tem " + idade + " anos e está em forma!!!" + " e ganha " + salario );
		
		
		entrada.close();
		
		
		
		
		
		
		/*System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena:%d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("\nSalario: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print ("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite aqui sua idade:");
		int idade =  entrada.nextInt();
		
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
		*/
	}
	
}
