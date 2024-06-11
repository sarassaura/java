package estruturadedados;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Stack<String> pessoas = new Stack<String>();
		int opcao = 1;

		System.out.println("************************************************");
		System.out.println("       1 - Adicionar Livro na pilha");
		System.out.println("       2 - Listar todos os Livros");
		System.out.println("       3 - Retirar Livro da pilha");
		System.out.println("       0 - Sair");
		System.out.println("************************************************");
		while (opcao != 0 && opcao > 0 && opcao < 4) {
			do {
				System.out.printf("Entre com a opção desejada: ");
				opcao = sc.nextInt();
			} while (opcao < 0 || opcao > 3);

			switch (opcao) {
			case 1:
				System.out.printf("Digite o nome: ");
				sc.nextLine();
				pessoas.push(sc.nextLine());

				System.out.println("\nPilha:");
				for (String pessoa : pessoas) {
					System.out.println(pessoa);
				}
				System.out.println("\nLivro Adicionado!\n");
				break;
			case 2:
				if (pessoas.size() == 0) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
					System.out.println("\nLista de Livros na fila:\n");
					for (String pessoa : pessoas) {
						System.out.println(pessoa);
					}
					System.out.println();
				}
				break;
			case 3:
				if (pessoas.size() == 0) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
					pessoas.pop();
					if (pessoas.size() == 0) {
						System.out.println("\nA Pilha está vazia!\n");
					} else {
						System.out.println("\nPilha:");
						for (String pessoa : pessoas) {
							System.out.println(pessoa);
						}
					}

					System.out.println("\nUm Livro foi retirado da pilha!\n");
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
