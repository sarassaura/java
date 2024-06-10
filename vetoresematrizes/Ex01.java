package vetoresematrizes;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
 * Dado um vetor contendo 10 números inteiros não ordenados e 
 * não repetidos, construa um algoritmo que consiga pesquisar 
 * dados no vetor, onde o usuário irá digitar um número e o
 * programa deve exibir na tela a posição deste número no vetor. 
 * Caso o número não seja encontrado, a mensagem: 
 * “Não foi encontrado!” deve ser exibida na tela.
*/

public class Ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int inteiros[] = new int[10], numero, posicao;

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o valor %dº: ", i + 1);
			inteiros[i] = sc.nextInt();
		}
		
		System.out.print("\nDigite o número que você deseja encontrar: ");
		numero = sc.nextInt();
		
		Arrays.sort(inteiros);
		posicao = Arrays.binarySearch(inteiros, numero);
		
		if(posicao < 0) {
			System.out.printf("O número %d não foi encontrado!", numero);
		} else {
			System.out.printf("O número %d está localizado na posição: %d", numero, posicao);
		}
		
		sc.close();
	}

}
