package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String nome;
		int idade;
		boolean primeira_doacao;
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o Nome do doador: ");
		nome = sc.nextLine();

		System.out.printf("Digite a Idade do doador: ");
		idade = sc.nextInt();

		System.out.printf("Primeira doação de sangue? ");
		primeira_doacao = sc.nextBoolean();

		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69) {
				if(primeira_doacao) {
					System.out.println(nome + " é uma pessoa que não está apta para doar sangue!");
				} else {
					System.out.println(nome + " é uma pessoa que está apta para doar sangue!");
				}
			} else {
				System.out.println(nome + " é uma pessoa que está apta para doar sangue!");
			}
		} else {
			System.out.println(nome + " é uma pessoa que não está apta para doar sangue!");
		}

		sc.close();
	}
}
