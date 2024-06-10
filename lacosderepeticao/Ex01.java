package lacosderepeticao;

import java.util.Locale;
import java.util.Scanner;

/* 
 * Escreva um algoritmo em Java, que 
 * leia 2 números inteiros via teclado, 
 * onde o primeiro número deve ser menor 
 * do que o segundo número. Caso contrário, 
 * deve ser exibida uma mensagem na tela 
 * informando que o intervalo é inválido 
 * e sair do programa. 
 * No intervalo informado, mostre na tela 
 * todes os números que são múltiplos de 3 e 5. 
 */

public class Ex01 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.printf("Digite o primeiro número do intervalo: ");
		num1 = sc.nextInt();
		System.out.printf("Digite o último número do intervalo: ");
		num2 = sc.nextInt();
		
		if(!(num1 < num2)) {
			System.out.println("\nIntervalo inválido!");
		} else {
			for(int i = num1 + 1; i < num2; i++) {
				if(i % 3 == 0 && i % 5 == 0 && i != 0) {
					System.out.printf("\n%d é múltiplo de 3 e 5", i);
					i += 14;
				}
			}
		}
		
		sc.close();
	}
}
