package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		
		String resultadoParcial;
		String resultadoFinal = media >= 7.0 ? "aprovado.": media>= 5.0 ? "em recupera��o." : "reprovado."; 
		
		System.out.println("O aluno est� " + resultadoFinal);
	}
}
