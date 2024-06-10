package lacosderepeticao;

import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um algoritmo em Java, 
 * que leia números inteiros via 
 * teclado, até que o número zero 
 * seja digitado. Ao final, mostre 
 * na tela a soma de todos os 
 * números digitados, 
 * que sejam positivos.
 */

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int numeros, soma = 0;
		
		do {
			System.out.printf("Digite um número: ");
			numeros = sc.nextInt();
			
			if(numeros > 0) {				
				soma += numeros;
			}
		} while(numeros != 0);
		
		System.out.printf("\nA soma dos números positivos é: " + soma);
		
		sc.close();
	}

}
