package aulas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();

		for (int i = 0; i < 10; i++) {
			fila.add(i);
		}

		System.out.println("\nElementos na fila: " + fila);
		System.out.println("\nRemove um elemento na fila: " + fila.remove());
		System.out.println("\nNovos Elementos na fila: " + fila);
		System.out.println("\nNovo Elemento 11 adicionado na fila: " + fila.add(11));
		System.out.println("\nPrimeiro elemento na fila: " + fila.peek());
		System.out.println("\nTamanho da fila: " + fila.size());
		System.out.println("\nChecar se 5 está na fila: " + fila.contains(5));
		System.out.println("\nExibir e retirar o primeiro elemento: " + fila.poll());
		
		System.out.println("\nElementos na fila: " + fila);
	
		System.out.println("\nExibir elementos da fila por iteração:");
		
		Iterator<Integer> iterator = fila.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nLimpar a fila: ");
		fila.clear();
		
		System.out.println("\nFila está vazia? " + fila.isEmpty());
	}

}
