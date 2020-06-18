package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<> ();
		
		// Offer e Add -> adicionam elementos na fila 
		// Diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana"); //retorna false
		fila.offer("Bia");
		fila.offer("Carlos"); // Lança uma exceção
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Diferença entre peek e element é que fila.peek retorna null quando a lista está vazia, já fila.element apresenta erro qdo a fila está vazia
		
		System.out.println(fila.peek()); // ele lê o elemento da fila mas não remove por isso duplica tem ana duas vezes
		System.out.println(fila.peek());  //retorna null se estiver vazia
		System.out.println(fila.element()); 
		System.out.println(fila.element()); // Lança uma exceção
		
	
		// Poll e Remove -> obter o próximo elemento
		// da fila e remove!
		
		System.out.println(fila.poll()); // remove false
		System.out.println(fila.remove()); //Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		//fila.size()
		//fila.clear();
		//fila.isEmpty()
		
		//fila.contains(...) verifica se tem elemento na fila
		
	}
}
		