package fundamentos;

public class TipoString {

	public static void main(String[] args) {
	
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println (s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		String nome = "Pedro";
		String sobrenome = "Viana";
		int idade = 33;
		double salario = 12345.987;
		
		System.out.println("nome:" + nome + " \nsobrenome: " + sobrenome + " \nidade: " + idade + " \nsalario R$ " + salario);
		
		System.out.printf("O senhor: %s ganha  R$ %.2f  e tem %d anos", nome, salario, idade );
		System.out.printf("\nidade: %d", idade);
		
		System.out.printf("\nnome: %d %s", idade, nome );
				
		/*System.out.println("Olá Pessoal".charAt (2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.length());
		
		String b = "Pedro";
		String sobrenome = "Santos";
		
		System.out.println("b:" + sobrenome + "\nsobrenome:");
		System.out.println("Frase qualquer".contains("ioi"));
		System.out.println("Frase qualquer".contains("qual"));
		*/
	}
}
