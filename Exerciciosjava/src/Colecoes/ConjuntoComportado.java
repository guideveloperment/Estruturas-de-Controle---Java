package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set <String> listaAprovados = new HashSet <String>();
		SortedSet <String> listaAprovados = new TreeSet <String>(); //TreeSet organiza, ordena o que estiver dentro das variáveis
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		
		for (String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set <Integer> nums = new HashSet <>(); 
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		//nums.get(1); Não é possível acessar pelo Índice
		
		for(int n: nums) {
			System.out.println(n);
		}
		
	}
}
