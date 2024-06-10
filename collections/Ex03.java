package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/*
 * Escreva um programa Java para criar uma Collection Set 
 * de Objetos da Classe Wrapper Integer. O programa deverá 
 * solicitar ao usuário, que ele digite via teclado 10 valores 
 * inteiros não repetidos e adicione-os individualmente na 
 * Collection Set. Em seguida, faça o que se pede:
 *  - Mostre na tela todos os elementos da Collection Set, 
 *  utilizando a Classe Iterator. 
 */

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Set<Integer> numeros = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: ", (i + 1));
			numeros.add(sc.nextInt());
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();

		System.out.println("\nListar dados do Set:");
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

		sc.close();
	}

}
