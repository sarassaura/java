package vetoresematrizes;

import java.util.Locale;
import java.util.Scanner;

/*
 * Elabore um algoritmo que leia 10 números inteiros e 
 * armazene em um vetor. Em seguida, mostre na tela:
 *  - Todos os elementos dos índices ímpares do vetor 
 *  - Todos os elementos do vetor que são números pares
 *  - A Soma de todos os elementos do vetor
 *  - A Média de todos os elementos do vetor, 
 * armazenada em uma variável do tipo real
 */

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int inteiros[] = new int[10], soma = 0;
		float media = 0;
		String indicesImpares = "", pares = "";

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o número da posição %d: ", i);
			inteiros[i] = sc.nextInt();
			
			if(i % 2 == 1) {
				indicesImpares += String.valueOf(inteiros[i]) + " ";
			}
			if(inteiros[i] % 2 == 0) {
				pares += String.valueOf(inteiros[i]) + " ";
			}
			
			soma += inteiros[i];
		}
		
		media = (float)soma / 10;
		
		System.out.printf("\nElementos nos índices ímpares:\n%s\n", indicesImpares);
		System.out.printf("\nElementos pares:\n%s\n", pares);
		System.out.printf("\nSoma: %d\n", soma);
		System.out.printf("\nMédia: %.2f\n", media);

		sc.close();
	}

}
