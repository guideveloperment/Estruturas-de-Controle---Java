package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Informe o primeiro salario:");
	String valor1 = entrada.next().replace(",",".");
	
	System.out.print("\nInforme o segundo salario:");
	String valor2 = entrada.next().replace(",", ".");
	
	System.out.print("\nInforme o terceiro salario:");
	String valor3 = entrada.next().replace(",",".");
	
	double salario1 = Double.parseDouble(valor1);
	double salario2 = Double.parseDouble(valor2);
	double salario3 = Double.parseDouble(valor3);
	
	double media = (salario1 + salario2 + salario3) /3;
	System.out.println("\nA média dos salários é " + "R$ " +  media);
	
	
	
	
	
	entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner entrada = new Scanner(System.in);
	
	System.out.println("\n Digite o primeiro salário:");
	String  valor1 = entrada.next().replace(",","."); // replace substitui qualquer virgula pelo ponto (, pelo .)5888
	
	System.out.println("\n Digite o segundo salário:");
	String  valor2 = entrada.next().replace(",",".");
	
	System.out.println("\n Digite o terceiro salário:");
	String  valor3 = entrada.next().replace(",",".");
	
	
	double salario1 = Double.parseDouble(valor1);
	double salario2 = Double.parseDouble(valor2);
	double salario3 = Double.parseDouble(valor3);
	
	double media=(salario1 + salario2 + salario3)/3;
	System.out.println("A média dos salários é:" + media);
	
	
	entrada.close();  // isso é para fechar o Scanner
	*/
	
	
	}
}
