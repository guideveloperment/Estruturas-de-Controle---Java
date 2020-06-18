package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1,"Roberto");
		usuarios.put(20,"Ricardo");
		usuarios.put(3,"Rafaela");
		usuarios.put(4,"Rebeca");
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); //pega so as chaves
		System.out.println(usuarios.values()); //pega so os valores
		System.out.println(usuarios.entrySet()); //pega chave e valor ao mesmo tempo
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(20)); 
		System.out.println(usuarios.remove(1)); // remove pelo valor das chaves
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey()+ " ==> ");
			System.out.println(registro.getValue());
		}
	}
}
