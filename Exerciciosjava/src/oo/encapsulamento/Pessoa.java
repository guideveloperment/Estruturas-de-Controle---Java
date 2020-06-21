package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa(String nome,int idade) {
		setNome(nome);
		setIdade(idade);
		}
	
	
	//Getter
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	//Setter
	public void setIdade(int novaIdade) {
		if(novaIdade >=0 && novaIdade <=120) {
			this.idade = novaIdade;
		}
		
	}
	
}
