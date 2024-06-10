package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/*
 * Escreva um programa Java para criar uma Collection Set de Objetos 
 * da Classe Wrapper Integer, inicializada com 10 valores inteiros. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 
 * 1 número inteiro e caso ele seja encontrado no Set, exiba na tela 
 * a mensagem: Número 00 Encontrado! Caso o número não seja encontrado, 
 * ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
*/

public class Ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();
		numeros.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		int entrada = 0;

		System.out.printf("Digite o número que você deseja encontrar: ");
		entrada = sc.nextInt();
		
		
		
		if(numeros.contains(entrada)) {
			System.out.printf("\nO número %d está localizado na posição!", entrada);
		} else {
			System.out.printf("\nO número %d não foi encontrado!", entrada);
		}

		sc.close();
	}

}
