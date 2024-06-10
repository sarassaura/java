package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um programa Java para criar uma Collection ArrayList 
 * de Objetos da Classe Wrapper Integer, inicializada com 10 
 * valores inteiros. O programa deverá solicitar ao usuário, 
 * que ele digite via teclado 1 número inteiro e caso ele seja 
 * encontrado no ArrayList, exiba na tela a posição deste número 
 * na Collection. Caso o número não seja encontrado, ele deverá 
 * exibir na tela a mensagem: O número NN não foi encontrado!
 */

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		int entrada = 0;
		
		System.out.printf("Digite o número que você deseja encontrar: ");
		entrada = sc.nextInt();
		
		if(numeros.contains(entrada)) {
			System.out.printf("\nO número %d está localizado na posição: %d", entrada, numeros.indexOf(entrada));
		} else {
			System.out.printf("\nO número %d não foi encontrado!", entrada);
		}

		sc.close();
	}

}
