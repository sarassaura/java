package aulas;

import java.util.Scanner;

public class LacosCondicionais {

	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;

		// if(condicao) {
		// comando se for verdadeira
		// } else {
		// comando se for falsa
		// }

		if (x) {
			System.out.println("X é verdadeiro");
		}

		if (y == true) {
			System.out.println("Y é verdadeiro");
		}

		int n1 = 4, n2 = 3, n3 = 4;

		if (n1 < 5) {
			System.out.println("O número n1 é menor que 5");
		}

		if (n1 < n2) {
			System.out.println("O número n1 é menor que n2");
		}

		if (n1 == n3) {
			System.out.println("O número n1 é igual ao número n3");
		}

		int idade = 18;
		boolean carteiraMotorista = true;

		if (carteiraMotorista && idade >= 18) {
			System.out.println("Voce pode dirigir");
		}

		float nota1, nota2, media;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();

		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();

		media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.println("Parabéns, vou foi aprovade");
		} else if (media >= 5) {
			System.out.println("Alune de Exame");
		} else {
			System.out.println("Ainda não aprovado");
		}

		int opcao;

		/*
		 * Valores de cases duplicados não são permitidos o valor para um case deve ser
		 * do mesmo tipo o valor deve ser uma constante ou literal a instrucao default é
		 * opcional
		 */

		System.out.println("######### Menu de virtudes #########");
		// System.out.println("\n-- Digite 1 para escolher sua virtude-- ");
		// System.out.println("\n-- Digite 2 para escolher seu animal baseado no VIA--
		// ");
		System.out.println("\n-- Digite 1 para sabedoria--");
		System.out.println("\n-- Digite 2 para coragem. Levante a cabeça senão a coroa cai--");
		System.out.println("\n-- Digite 3 para humanidade--");
		System.out.println("\n-- Digite 4 para justiça--");
		System.out.println("\n-- Digite 5 para transcendencia--");
		System.out.println("\n-- Digite 6 para moderacao--");
		// sabedoria e conhecimento, coragem, humanidade, justiça, transcendencia,
		// moderacao

		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Sua virtude foi: sabedoria");
			break;
		case 2:
			System.out.println("Sua virtude foi: coragem");
			break;
		case 3:
			System.out.println("Sua virtude foi: humanidade");
			break;
		case 4:
			System.out.println("Sua virtude foi: justiça");
			break;
		case 5:
			System.out.println("Sua virtude foi: transcendencia");
			break;
		case 6:
			System.out.println("Sua virtude foi: moderacao");
			break;
		default:
			System.out.println("Inválido");
		}

		leia.close();
	}

}
