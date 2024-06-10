package estruturadedados;

import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Queue<String> pessoas = new PriorityQueue<String>();
		int opcao = 1;

		while (opcao != 0 && opcao > 0 && opcao < 4) {
			System.out.println("************************************************");
			System.out.println("       1 - Adicionar Cliente na Fila");
			System.out.println("       2 - Listar todos os clientes");
			System.out.println("       3 - Retirar Cliente da Fila");
			System.out.println("       0 - Sair");
			System.out.println("************************************************");
			do {
				System.out.println("Entre com a opção desejada: ");
				opcao = sc.nextInt();
			} while (opcao < 0 || opcao > 3);

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
					System.out.printf("Digite o nome: ");
					sc.nextLine();
					pessoas.remove(sc.nextLine());
					if (pessoas.size() == 0) {
						System.out.println("\nA Fila está vazia!\n");
					} else {
						System.out.println("\nFila:");
						for (String pessoa : pessoas) {
							System.out.println(pessoa);
						}
					}

					System.out.println("\nO Cliente foi Chamado!");
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
