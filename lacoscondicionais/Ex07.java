package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		float numero1, numero2;
		int codigo;
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o 1º número: ");
		numero1 = sc.nextFloat();

		System.out.printf("Digite o 2º número: ");
		numero2 = sc.nextFloat();

		System.out.printf("Operação: ");
		codigo = sc.nextInt();

		switch (codigo) {
		case 1:
			System.out.printf("\n%.1f + %.1f = %.1f", numero1, numero2, numero1 + numero2);
			break;
		case 2:
			System.out.printf("\n%.1f - %.1f = %.1f", numero1, numero2, numero1 - numero2);
			break;
		case 3:
			System.out.printf("\n%.1f * %.1f = %.1f", numero1, numero2, numero1 * numero2);
			break;
		case 4:
			System.out.printf("\n%.1f / %.1f = %.1f", numero1, numero2, numero1 / numero2);
			break;
		default:
			System.out.printf("\nOperação Inválida!");
		}

		sc.close();
	}

}
