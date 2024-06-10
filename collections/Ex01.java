package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um programa Java para criar uma Collection ArrayList 
 * de Objetos da Classe String. O programa deverá solicitar ao 
 * usuário, que ele digite via teclado 5 cores e deverá adicioná-las 
 * individualmente no ArrayList. Em seguida, faça o que se pede:
 * 
 *	- Mostre na tela todas as cores que foram adicionadas. 
 *	- Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
*/

public class Ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();

		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite a %dª cor: ", (i + 1));
			cores.add(sc.nextLine());
		}
		
		System.out.println("\nListar todas as cores:\n");
		
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores:\n");
		
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		sc.close();
	}

}
