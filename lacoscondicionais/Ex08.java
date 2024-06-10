package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int codigo;
		float valor = 0f, saldo = 1000.0f;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Operação: ");
		codigo = sc.nextInt();
		
		if(codigo == 2 || codigo == 3) {
			System.out.printf("Valor: ");
			valor = sc.nextFloat();
		}

		switch (codigo) {
		case 1:
			System.out.printf("\nOperação - Saldo");
			System.out.printf("\nSaldo: R$ %.2f", saldo);
			break;
		case 2:
			System.out.printf("\nOperação - Saque");
			if(valor > saldo) {
				System.out.printf("\nSaldo Insuficiente!");
			} else {
				System.out.printf("\nNovo Saldo: R$ %.2f", saldo - valor);
			}
			break;
		case 3:
			System.out.printf("\nOperação - Depósito");
			System.out.printf("\nNovo Saldo: R$ %.2f", saldo + valor);
			break;
		default:
			System.out.printf("\nOperação - Inválida!");
		}
		
		sc.close();
	}

}
