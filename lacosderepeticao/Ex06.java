package lacosderepeticao;

import java.util.Locale;
import java.util.Scanner;

/*
* Escreva um algoritmo em Java, 
* que leia números inteiros via 
* teclado, até que o número zero 
* seja digitado. Ao final, mostre 
* na tela a média de todos os 
* números digitados, que sejam 
* múltiplos de 3.
 */

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int num, total = 0;
		float media = 0;
		
		do {
			System.out.printf("Digite um número: ");
			num = sc.nextInt();
			if(num % 3 == 0 && num != 0) {
				media += num;
				total++;
			}
		} while(num != 0);
		
		media /= total;
		
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f", media);
		
		sc.close();
	}

}
