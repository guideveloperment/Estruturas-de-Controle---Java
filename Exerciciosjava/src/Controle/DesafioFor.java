package Controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String Valor = "#";
		for(int i = 1; i <=5; i++ ) {
			System.out.println(Valor);
			Valor+= "#";
		}
		
		// vers�o do desafio
		// n�o pode usar o valor num�rico pra controlar o la�o!
		
		for (String v = "#"; !v.equals("#####"); v +="#") {
			System.out.println(v);
		}
		
	}
}

