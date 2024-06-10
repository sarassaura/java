package lacosderepeticao;

import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um algoritmo em Java, 
 * que leia a idade de várias pessoas 
 * (números inteiros), via teclado e 
 * mostre na tela o total de pessoas 
 * cuja idade seja menor que 21 anos 
 * e o total de pessoas cuja idade 
 * seja maior que 50 anos. 
 * A leitura dos dados deve ser 
 * finalizada ao digitar uma 
 * idade negativa.
*/

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int idade = 1, menor = 0, maior = 0;
		
		while(idade > 0) {
			System.out.printf("Digite uma idade: ");
			idade = sc.nextInt();
			
			if(idade > 21) {
				menor++;
			}
			if(idade > 50) {
				maior++;
			}
		}
		
		System.out.printf("\nTotal de pessoas menores de 21 anos: " + menor);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: " + maior);

		sc.close();
	}
}
