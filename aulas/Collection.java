package aulas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		// Collection ArrayList, tipo double
		ArrayList<Double> notas = new ArrayList<Double>();

		// Objeto da classe wrapper Double

		Double y = Double.valueOf(9);

		/* Add algumas notas */

		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(10.0);
		notas.add(4.0);
		notas.add(6.5);

		System.out.printf("\nNotas cadastradas: " + notas);

		System.out.printf("\nA posição da nota 5 é: " + notas.indexOf(5.0));

		System.out.printf("\nA nota 5 existe na lista: " + notas.contains(5.0));

		System.out.println("\nA 3ª posição da lista é a nota: " + notas.get(2));

		notas.set(notas.indexOf(5.0), 10.0);

		System.out.printf("\nA nota 5 foi alterada para 10: " + notas);

		notas.remove(4.0);

		System.out.println("\nA nota 4 foi apagada: " + notas);

		System.out.println("\nA lista está vazia? " + notas.isEmpty());

		System.out.println("\nO tamanho da lista é: " + notas.size());

		notas.clear();

		System.out.println("\nA lista está vazia: " + notas);

		//

		notas.add(9.0);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(10.0);
		notas.add(4.0);
		notas.add(6.5);

		System.out.println("\nNotas cadastradas - Laço For...Each");

		for (Double nota : notas) {
			System.out.println(nota);
		}

		//

		System.out.println("\nNotas cadastradas - Interface Iterator");

		Iterator<Double> iNotas = notas.iterator();

		while (iNotas.hasNext()) {
			System.out.println(iNotas.next());
		}

		//

		// Cria a Collection Set, do tipo String chamada setFrutas
		Set<String> setFrutas = new HashSet<String>();

		// Adiciona algumas frutas na Colection Set
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");

		System.out.println("\nDados da Collection: " + setFrutas);

		System.out.println("\nExiste a fruta Kiwi? " + setFrutas.contains("Kiwi"));

		// Remove um elemento da Collection
		setFrutas.remove("Kiwi");
		System.out.println("\nKiwi foi removida!");
		System.out.println("\nExiste a fruta Kiwi na Collection? " + setFrutas.contains("Kiwi"));

		System.out.println("\n\nListar todos os Elementos com o Laço For..Each");

		for (String fruta : setFrutas) {
			if (fruta != null)
				System.out.println("O Hashcode do Elemento " + fruta + " é " + fruta.hashCode());
		}
		
		// Lista todos os elementos da Collection Set com o Objeto da Classe Iterator
		System.out.println("\n\nListar todos os Elementos com o Iterator");

		Iterator<String> isetFrutas = setFrutas.iterator();

		while (isetFrutas.hasNext()) {
			System.out.println(isetFrutas.next());
		}

		// Verifica se a Collection Set está vazia
		System.out.println("\nA Colection Set está vazia? " + setFrutas.isEmpty());

		// Limpa a Collection Set
		setFrutas.clear();
		System.out.println("\nTodos os itens foram removidos da Collection Set!");

		// Verifica novamente se a Collection Set está vazia
		System.out.println("\nA Colection Set está vazia? " + setFrutas.isEmpty());
	}

}
