package aulas;

import java.util.Scanner;

public class LacosRepeticao {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
//		for(inicializacao; condicao; incremento/decrementado) {
//			//bloco de codigo a ser incrementado
//		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Pessoa na posicação " + i + " é pessoa " + (i + 1));
		}
		
		String nome;
		int contador;
		
		for(contador = 1; contador < 4; contador++) {
			System.out.println("\nDigite o " + contador + "º nome: ");
			nome = sc.nextLine();
			System.out.println("O contador " + contador + "º nome: " + nome);
		}
		
		System.out.println("\n\nDigite a Tabuada que voce deseja calcular: ");
		int numero;
		numero = sc.nextInt();
		
		for(contador = 1; contador <= 10; contador++) {
			System.out.println(numero + " x " + contador + " = " + numero * contador);
		}
		System.out.println("Acabou o for");
		
		int numero1, numero2, soma;
		char continua = 's';
		
		while(continua != 'n') {			
			System.out.printf("\nDigite o primeiro valor: ");
			numero1 = sc.nextInt();
			
			System.out.printf("\nDigite o segundo valor: ");
			numero2 = sc.nextInt();
			
			soma = numero1 + numero2;
			
			System.out.printf("\n\nO resultado da soma é: " + soma);
			System.out.println("\n\n++++++++++++++++MENU++++++++++++++++++");
            System.out.println("\nDeseja somar dois valores?");
            System.out.println("\nDigite s para sim OU digite n para não: ");
			continua = Character.toLowerCase(sc.next().charAt(0));
			System.out.println("++++++++++++++++++++++++++++++++++");
		}
		
		System.out.println("programa finalizado");
		
		int resultado;
		contador = 3;
		
		do {
			System.out.println("\nDigite um numero inteiro: ");
			numero = sc.nextInt();
			resultado = numero * 5;
			
			System.out.println("\nO resultado da multiplicação é: " + resultado);
			contador--;
		} while(contador >= 2);
		
		sc.close();
	}
}
