package operadoresevariaveis;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		float salario, abono, novo_salario;
		
		System.out.printf("Digite o Salário: ");
		salario = sc.nextFloat();
		
		System.out.printf("Digite o Abono: ");
		abono = sc.nextFloat();
		
		novo_salario = salario + abono;
		
		System.out.printf("\n%.2f", novo_salario);
		
		sc.close();
	}
}
