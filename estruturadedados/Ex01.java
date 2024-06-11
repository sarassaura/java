package estruturadedados;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

/*
 * Escreva um programa Java contendo 
 * uma Collection Queue (Fila) de Objetos da Classe String, 
 * para organizar a ordem de chegada dos Clientes de um Banco. 
 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
 * 
 * - 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
 * - 2: Listar todos os Clientes na fila
 * - 3: Chamar (retirar) uma pessoa da fila 
 * - 0: O programa deve ser finalizado. 

 * Caso a fila esteja vazia, o programa deverá informar que a 
 * fila está vazia ao tentar retirar (chamar) um cliente da fila..
 */

public class Ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Queue<String> pessoas = new LinkedList<String>();
		int opcao = 1;

		System.out.println("************************************************");
		System.out.println("       1 - Adicionar Cliente na Fila");
		System.out.println("       2 - Listar todos os clientes");
		System.out.println("       3 - Retirar Cliente da Fila");
		System.out.println("       0 - Sair");
		System.out.println("************************************************");
		while (opcao != 0 && opcao > 0 && opcao < 4) {
			do {
				System.out.printf("Entre com a opção desejada: ");
				opcao = sc.nextInt();
			} while (opcao < 0 || opcao > 3);
			// TODO: adicionar default opção Inválida
			switch (opcao) {
			case 1:
				System.out.printf("Digite o nome: ");
				sc.nextLine();
				pessoas.add(sc.nextLine());

				System.out.println("\nFila:");
				for (String pessoa : pessoas) {
					System.out.println(pessoa);
				}
				System.out.println("\nCliente Adicionado!\n");
				break;
			case 2:
				if (pessoas.size() == 0) {
					System.out.println("\nA Fila está vazia!\n");
				} else {
					System.out.println("\nLista de Clientes na fila:\n");
					for (String pessoa : pessoas) {
						System.out.println(pessoa);
					}
					System.out.println();
				}
				break;
			case 3:
				if (pessoas.size() == 0) {
					System.out.println("\nA Fila está vazia!\n");
				} else {
					pessoas.poll();
					if (pessoas.size() == 0) {
						System.out.println("\nA Fila está vazia!\n");
					} else {
						System.out.println("\nFila:");
						for (String pessoa : pessoas) {
							System.out.println(pessoa);
						}
					}

					System.out.println("\nO Cliente foi Chamado!\n");
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			}
		}
		sc.close();
	}

}
