package vetoresematrizes;

import java.util.Locale;
import java.util.Scanner;

/*
 * Elabore um algoritmo que leia uma Matriz 3x3 de 
 * números inteiros e em seguida, mostre na tela:
 * - Todos os elementos da Diagonal Principal
 * - Todos os elementos da Diagonal Secundária
 * - A Soma de todos os elementos da Diagonal Principal
 * - A Soma de todos os elementos da Diagonal Secundária
 */

public class Ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int inteiros[][] = new int[3][3], somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
		int principal[] = new int[3], secundaria[] = new int[3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Digite o número da posição [%d][%d]: ", i, j);
				inteiros[i][j] = sc.nextInt();
				if (i == j) {
					principal[i] = inteiros[i][j];
					somaDiagonalPrincipal += inteiros[i][j];
				}
				if ((i + j) == 2) {
					secundaria[i] = inteiros[i][j];
					somaDiagonalSecundaria += inteiros[i][j];
				}

			}
		}

		System.out.println("\nElementos da Diagonal Principal:");
		for(int elemento : principal) {
			System.out.printf("%d ", elemento);
		}

		System.out.println("\nElementos da Diagonal Secundária:");
		for(int elemento : secundaria) {
			System.out.printf("%d ", elemento);
		}
		
		System.out.printf("\nSoma dos Elementos da Digonal Principal:\n%d", somaDiagonalPrincipal);
		System.out.printf("\nSoma dos Elementos da Digonal Secundária:\n%d", somaDiagonalSecundaria);

		sc.close();
	}

}
