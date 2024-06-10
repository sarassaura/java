package lacosderepeticao;

import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um algoritmo em Java, 
 * que leia 10 números inteiros 
 * via teclado e mostre na tela 
 * quantos números são pares e 
 * quantos número são ímpares.
*/

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int num, pares = 0, impares = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			num = sc.nextInt();
			if(num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.printf("\nTotal de números pares: " + pares);
		System.out.printf("\nTotal de números ímpares: " + impares);
		
		sc.close();
	}

}
