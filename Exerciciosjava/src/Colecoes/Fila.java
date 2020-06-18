package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<> ();
		
		// Offer e Add -> adicionam elementos na fila 
		// Diferen�a � o comportamento quando a fila est� cheia!
		
		fila.add("Ana"); //retorna false
		fila.offer("Bia");
		fila.offer("Carlos"); // Lan�a uma exce��o
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Diferen�a entre peek e element � que fila.peek retorna null quando a lista est� vazia, j� fila.element apresenta erro qdo a fila est� vazia
		
		System.out.println(fila.peek()); // ele l� o elemento da fila mas n�o remove por isso duplica tem ana duas vezes
		System.out.println(fila.peek());  //retorna null se estiver vazia
		System.out.println(fila.element()); 
		System.out.println(fila.element()); // Lan�a uma exce��o
		
	
		// Poll e Remove -> obter o pr�ximo elemento
		// da fila e remove!
		
		System.out.println(fila.poll()); // remove false
		System.out.println(fila.remove()); //Lan�a uma exce��o
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
		