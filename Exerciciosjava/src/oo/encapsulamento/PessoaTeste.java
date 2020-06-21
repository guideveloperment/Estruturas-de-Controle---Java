package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro",-45);
		p1.setIdade(230);
		//p1.idade = -30; // alterar o valor da variável
		
		
		System.out.println(p1.getIdade()); //ler o valor da variável
		System.out.println(p1); // toString
	}
	
	@Override
	public String toString() {
		return "Olá eu sou o " + getNome()
		+ "e tenho " + getIdade() + "anos.";
		
	}

	private String getIdade() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
}

  
