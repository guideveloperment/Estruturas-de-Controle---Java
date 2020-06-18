package Controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String Valor = "#";
		for(int i = 1; i <=5; i++ ) {
			System.out.println(Valor);
			Valor+= "#";
		}
		
		// versão do desafio
		// não pode usar o valor numérico pra controlar o laço!
		
		for (String v = "#"; !v.equals("#####"); v +="#") {
			System.out.println(v);
		}
		
	}
}

