package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String subfilo, classe, ordem;
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite vertebrado ou invertebrado: ");
		subfilo = sc.nextLine();

		if (subfilo.equalsIgnoreCase("vertebrado")) {
			System.out.printf("Digite ave ou mamífero: ");
			classe = sc.nextLine();

			if (classe.equalsIgnoreCase("ave")) {
				System.out.printf("Digite carnívoro ou onívoro: ");
				ordem = sc.nextLine();
				
				if (ordem.equalsIgnoreCase("carnívoro")) {
					System.out.println("\nÁguia");
				} else if (ordem.equalsIgnoreCase("onívoro")) {
					System.out.println("\nPomba");
				} else {
					System.out.printf("Ordem inválida!");
				}
			} else if (classe.equalsIgnoreCase("mamífero")) {
				System.out.printf("Digite onívoro ou herbívoro: ");
				ordem = sc.nextLine();
				
				if (ordem.equalsIgnoreCase("onívoro")) {
					System.out.println("\nHomem");
				} else if (ordem.equalsIgnoreCase("herbívoro")) {
					System.out.println("\nVaca");
				} else {
					System.out.printf("Ordem inválida!");
				}
			} else {
				System.out.printf("Classe inválida!");
			}
		} else if (subfilo.equalsIgnoreCase("invertebrado")) {
			System.out.printf("Digite inseto ou anelídeo: ");
			classe = sc.nextLine();

			if (classe.equalsIgnoreCase("inseto")) {
				System.out.printf("Digite hematófago ou herbívoro: ");
				ordem = sc.nextLine();
				
				if (ordem.equalsIgnoreCase("hematófago")) {
					System.out.println("\nPulga");
				} else if (ordem.equalsIgnoreCase("herbívoro")) {
					System.out.println("\nLagarta");
				} else {
					System.out.printf("Ordem inválida!");
				}
			} else if (classe.equalsIgnoreCase("anelídeo")) {
				System.out.printf("Digite hematófago ou onívoro: ");
				ordem = sc.nextLine();
				
				if (ordem.equalsIgnoreCase("hematófago")) {
					System.out.println("\nSanguessuga");
				} else if (ordem.equalsIgnoreCase("onívoro")) {
					System.out.println("\nMinhoca");
				} else {
					System.out.printf("Ordem inválida!");
				}
			} else {
				System.out.printf("Classe inválida!");
			}
		} else {
			System.out.printf("Subfilo inválido!");
		}
		
		sc.close();
	}
}
