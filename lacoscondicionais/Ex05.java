package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int num, quantidade;
		float preco = 0, valor;
		String produto = "";
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o Código do Produto: ");
		num = sc.nextInt();

		System.out.printf("Digite a Quantidade: ");
		quantidade = sc.nextInt();

		switch (num) {
		case 1:
			preco = 10.00f;
			produto = "Cachorro Quente";
			break;
		case 2:
			preco = 15.00f;
			produto = "X-Salada";
			break;
		case 3:
			preco = 18.00f;
			produto = "X-Bacon";
			break;
		case 4:
			preco = 12.00f;
			produto = "Bauru";
			break;
		case 5:
			preco = 8.00f;
			produto = "Refrigerante";
			break;
		case 6:
			preco = 13.00f;
			produto = "Suco de laranja";
			break;
		}
		
		valor = quantidade * preco;
		
		System.out.println("\nProduto: " + produto);
		System.out.printf("Valor total: R$ %.2f", valor);

		sc.close();
	}

}
