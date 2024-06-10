package aulas;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int quantidade;
		long identificador;
		float altura;
		double area;
		char tipo;
		String frase;
		boolean ativo;
		
		System.out.println("\nDigite um valor para a Variável quantidade (int): ");
		quantidade = leia.nextInt();
		
		System.out.println("\nDigite um valor para a Variável identificador (long): ");
		identificador = leia.nextLong();
		
		System.out.println("\nDigite um valor para a Variável altura (float): ");
		altura = leia.nextFloat();
		
		System.out.println("\nDigite um valor para a Variável area (double): ");
		area = leia.nextDouble();
		
		System.out.println("\nDigite um valor para a Variável tipo (char): ");
		tipo = leia.next().charAt(0);
		
		System.out.println("\nDigite um valor para a Variável frase (String): ");
		frase = leia.nextLine();
		
		System.out.println("\nDigite um valor para a Variável ativo (boolean): ");
		ativo = leia.nextBoolean();
		
		System.out.printf("\nDados recebidos via teclado:\n");
		
		System.out.printf("\nO valor da variável quantidade é: %d\n", quantidade);
		System.out.printf("\nO valor da variável identificador é: %d\n", identificador);
		System.out.printf("\nO valor da variável altura é: %.2f\n", altura);
		System.out.printf("\nO valor da variável area é: %.2f\n", area);
		System.out.printf("\nO valor da variável tipo é: %c\n", tipo);
		System.out.printf("\nO valor da variável frase é: %s\n", frase);
		System.out.printf("\nO valor da variável ativo é: %b\n", ativo);
		
		leia.close();
	}

}
