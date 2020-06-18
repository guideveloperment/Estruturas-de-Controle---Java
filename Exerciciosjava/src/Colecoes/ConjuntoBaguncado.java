package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet ();
		
		conjunto.add(1.2); // double -> double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("X"));
		System.out.println(conjunto.remove("x"));
		System.out.println(conjunto.remove(1.2));
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.contains(1.2));
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet ();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.add(nums); // Uni�o entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
